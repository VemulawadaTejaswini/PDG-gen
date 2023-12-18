import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		long cnt = Integer.MAX_VALUE;
		long bcnt = 0;
		long wcnt = S.chars().filter(ch -> ch == '.').count();
		for(int i = 1;i <= N;i++) {
			if(S.charAt(i)=='#') {
				bcnt++;
			}else if(S.charAt(i)=='.') {
				wcnt--;
			}
			cnt = Math.min(cnt, bcnt+wcnt);
		}
		System.out.println(cnt);
	}
}
