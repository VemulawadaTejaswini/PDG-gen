import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < K; ++i) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int s = Math.min(a, N - 1 - a);
			int u = Math.min(b, N - 1 - b);
			System.out.println(Math.min(s, u) % 3 + 1);
		}
	}

}