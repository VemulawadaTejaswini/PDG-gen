import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		long[] p = new long[a];
		long[] q = new long[b];
		long[] r = new long[c];
		
		Arrays.setAll(p, i -> sc.nextLong());
		Arrays.setAll(q, i -> sc.nextLong());
		Arrays.setAll(r, i -> sc.nextLong());
		
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		
		long[] pq = new long[x + y];
		for (int i = 0; i < x; i++) {
			pq[i] = p[a - 1 - i];
			pq[x + i] = q[b - 1 - i];
		}
		
		Arrays.sort(pq);
		
		long[] arr = new long[c * 2];
		for (int i = 0; i < c; i++) {
			arr[i] = pq[i];
			arr[c + i] = r[i];
		}

		Arrays.sort(arr);
		for (int i = 0; i < c; i++) {
			pq[i] = arr[c * 2 - 1 - i];
		}
		
		long sum = 0;
		for (int i = 0; i < x + y; i++) {
			sum += pq[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
