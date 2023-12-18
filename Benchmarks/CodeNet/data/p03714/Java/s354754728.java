
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[3*n];
		for(int i=0; i<3*n; i++) {
			a[i]=sc.nextLong();
		}

		PriorityQueue<Long> pq1 = new PriorityQueue<Long>();
		long sum1 = 0;
		for(int i=0; i<n; i++) {
			pq1.add(a[i]);
			sum1 += a[i];
		}

		PriorityQueue<Long> pq2 = new PriorityQueue<Long>((x,y)->Long.compare(y, x));
		long sum2 = 0;
		for(int i=3*n-1; i>=2*n; i--) {
			pq2.add(a[i]);
			sum2 += a[i];
		}

		long tmp1[] = new long[n+1];
		tmp1[0]=sum1;
		long tmp2[] = new long[n+1];
		tmp2[0]=sum2;

		for(int k=n; k<2*n; k++) {
			pq1.add(a[k]);
			sum1 += a[k];
			long sub1 = pq1.poll();
			sum1 -= sub1;
			tmp1[k-(n-1)] = sum1;

			pq2.add(a[3*n-k-1]);
			sum2 += a[3*n-k-1];
			long sub2 = pq2.poll();
			sum2 -= sub2;
			tmp2[k-(n-1)] = sum2;
		}
		long ans = -Long.MAX_VALUE;
		for(int i=0; i<=n; i++) {
			ans = Math.max(ans, tmp1[i] - tmp2[n-i]);
		}
		System.out.println(ans);
		sc.close();
	}
}


