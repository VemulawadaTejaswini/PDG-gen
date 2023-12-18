import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int ans = ((int) (k * Math.pow(k - 1, n - 1)));

			System.out.println(ans);
		}
	}
}
