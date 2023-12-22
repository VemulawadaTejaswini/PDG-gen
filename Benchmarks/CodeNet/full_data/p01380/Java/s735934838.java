import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public class pair implements Comparable {
		int a;
		int b;

		pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Object arg0) {
			return  b- ((pair) arg0).b;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair[] data = new pair[n];
		for (int i = 0; i < n; i++) {
			data[i] = new pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(data);
		int[] fastMost = new int[n+1];
		Arrays.fill(fastMost, (1<<30));
		fastMost[0] = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int[] fastMost2 = fastMost.clone();
			for (int j = 1; j < n+1; j++) {
				if (fastMost[j - 1] == 1<<30) {
					break;
				}
				if (fastMost[j - 1] + data[i].a <= data[i].b) {
					fastMost2[j] = Math.min(fastMost2[j], fastMost[j - 1]
							+ data[i].a);
					ans = Math.max(ans, j);
				}
			}
			fastMost = fastMost2.clone();
		}
//		System.out.println(Arrays.toString(fastMost));
		System.out.println(ans);
	}

	public static void main(String Args[]) {
		Main t = new Main();
		t.run();
	}
}