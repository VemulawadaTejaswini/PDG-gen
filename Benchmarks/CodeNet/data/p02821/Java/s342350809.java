import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		Arrays.parallelSort(a);
		int max = a[n-1];

		//cumulative sum
		int[] csum = new int[max*2];
		int p = 0;
		for (int i = 0; i < csum.length; i++) {
			while(p < n && a[p] < i) {
				p++;
				if(p == n) break;
			}
			csum[i] = n-p;
		}

		//binary search
		int l = -1; int r = max*2+1;
		while(r-l> 1) {
			int mid = (r+l)/2;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int res = Math.max(mid-a[i], 0);
				sum += csum[res];
			}
			//System.out.printf("mid:%d, sum:%d%n", mid, sum);
			if(sum >= m) l = mid;
			else r = mid;
		}

		//cumulative sum
		int[] csum2 = new int[n];
		csum2[0] = a[0];
		for (int i = 1; i < n; i++) {
			csum2[i] = csum2[i-1] + a[i];
		}
		//System.out.println(Arrays.toString(csum2));
		int count = 0; int sum = 0;
		for (int i = 0; i < n; i++) {
			int res = Math.max(l-a[i]+1, 0);
			if(n == csum[res]) {
				sum += a[i]*csum[res] + csum2[n-1];
			}else {
				sum += a[i]*csum[res] + (csum2[n-1]-csum2[n-csum[res]-1]);
			}

			count += csum[res];
			//System.out.println(sum);
		}
		sum += (m-count)*l;
		System.out.println(sum);
		sc.close();
	}
}