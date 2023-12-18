import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc072/tasks/abc072_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		int ans = X>t ? X-t : 0;
		
		System.out.println(ans);

	}

}
