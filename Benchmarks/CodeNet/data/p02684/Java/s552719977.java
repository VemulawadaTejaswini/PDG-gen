import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
		}
		int len = 0;
		int[] pos = new int[N];
		Arrays.fill(pos, -1);
		int p = 0;
		for (p = 0; pos[p] < 0; p = a[p]) {
			pos[p] = len++;
		}
		len -= pos[p];
		K = K - (len * (K / len));
		for (int i = 0; i < N; i++) {
			if (pos[i] == K) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}
