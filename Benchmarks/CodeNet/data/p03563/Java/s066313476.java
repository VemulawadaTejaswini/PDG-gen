import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc076/tasks/abc076_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		sc.close();
		
		int ans = R + (G-R)*2;
		System.out.println(ans);

	}

}
