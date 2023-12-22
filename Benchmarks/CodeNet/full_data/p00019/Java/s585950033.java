import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		int ans = n;
		int loop = n;

		for(int i = 1; i < loop; i++) {
			ans *= (n - i);
		}

		System.out.println(ans);

	}

}