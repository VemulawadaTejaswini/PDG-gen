import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static final long MAX = 1000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] elems = new int[N];
		long[] sort = new long[N];
		for (int i = 0; i < elems.length; i++) {
			elems[i] = sc.nextInt();
			sort[i] = elems[i] * MAX + i;
		}
		Arrays.sort(sort);
		long ans = Integer.MAX_VALUE;
		int[] forb = new int[N+1];
		int[] real = new int[N];
		forb[Math.max(0, N - K + 1)]++;
		forb[N]--;
		for (int i = 1; i <= N; i++) {
			int size = 0, tot0 = 0;
			int open = 0, last0 = -(int)MAX;
			for (int j = 0; j < N; j++) {
				open += forb[j];
				if (open == 0) {
					tot0++;
					last0 = j;
				}
				if (j <= last0 + K - 1) real[size++] = elems[j];
			}
			if (size >= Q && tot0 >= Q) {
				Arrays.sort(real, 0, size);
				ans = Math.min(ans, real[Q-1] - real[0]);
//				System.out.println(tot0 + " " + ans + " real = " + Arrays.toString(real));
			} else break;
			forb[Math.max(0, (int)(sort[i-1] % MAX) - K + 1)]++;
			forb[Math.min(N, (int)(sort[i-1] % MAX) + 1)]--;
		}
		System.out.println(ans);
	}
}
