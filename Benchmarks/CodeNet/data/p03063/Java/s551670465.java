import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int cnt = Integer.MAX_VALUE;
		int bcnt = 0;
		int wcnt = 0;
		for(int i = 0;i <= N;i++) {
			String s1 = S.substring(0,i);
			String s2 = S.substring(i, S.length());
			for(int j = 0;j<s1.length();j++) {
				if(s1.charAt(j)=='#') {
					bcnt++;
				}
			}
			for(int k = 0;k<s2.length();k++) {
				if(s2.charAt(k)=='.') {
					wcnt++;
				}
			}
			cnt = Math.min(cnt, bcnt+wcnt);
			bcnt=0;wcnt=0;
		}
		System.out.println(cnt);
	}
}