import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int a = 0;
		
		for (int i = 0; i < N; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			a += (r + 1) - l;
		}
		
		System.out.println(a);

		sc.close();
	}
}
