import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = (new StringBuilder(sc.next())).reverse().toString();
		int cnt_w = 0, ans = 0;
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == '.') {
				// white
				cnt_w++;
			}else {
				ans += cnt_w;
				cnt_w = 0;
			}
		}
		System.out.println(ans);
	}
}