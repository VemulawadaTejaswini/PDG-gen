import java.util.Scanner;

/**
 * https://abc055.contest.atcoder.jp/tasks/abc055_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = N*800-(N/15)*200;
		System.out.println(ans);

	}

}
