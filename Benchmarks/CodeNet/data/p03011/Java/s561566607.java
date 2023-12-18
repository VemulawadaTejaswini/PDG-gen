import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();

		int ans = 2000;
		ans = Math.min(P+Q,ans);
		ans = Math.min(P+R,ans);
		ans = Math.min(Q+R,ans);
		System.out.println(ans);
	}
}
