
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = (n - 1 + k - 2) / (k - 1);
		System.out.println(ans);

	}

}
