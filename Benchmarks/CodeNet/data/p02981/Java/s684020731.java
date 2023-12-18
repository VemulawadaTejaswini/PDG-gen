import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		if (A * N > B) {
			ans = B;
		} else {
			ans = A * N;
		}

		System.out.println(ans);
		sc.close();
	}
}
