import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] h = new long[N];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextLong();
		}
		sc.close();
		for (int i = 0; i < h.length - 1; i++) {
			if (h[i] > h[i + 1])
				h[i]--;
			else if (i != 0 && (h[i] - h[i - 1]) >= 1)
				h[i]--;
		}
		for (int i = 0; i < h.length - 1; i++) {
			if (h[i] > h[i + 1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}