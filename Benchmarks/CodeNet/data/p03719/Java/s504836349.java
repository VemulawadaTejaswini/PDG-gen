import java.util.Scanner;

/**
 * https://abc061.contest.atcoder.jp/tasks/abc061_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		String ans = A<=C && C<=B ? "Yes" : "No";
		
		System.out.println(ans);

	}

}