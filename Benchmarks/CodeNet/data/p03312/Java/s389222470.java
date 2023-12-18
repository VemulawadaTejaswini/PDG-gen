import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		long[] l = new long[N+1];
		long[] r = new long[N+1];
		for(int i=0; i<N; i++) {
			l[i+1] = l[i] + A[i];
			r[i+1] = r[i] + A[N-1-i];
		}
		
		long ans = Long.MAX_VALUE;
		
		for(int i=2; i<=N-2; i++) {
			long[] suml = findSplit(l, i);
			long[] sumr = findSplit(r, N-i);
			long min = Math.min( Math.min(suml[0], suml[1]),Math.min(sumr[0], sumr[1]));
			long max = Math.max( Math.max(suml[0], suml[1]),Math.max(sumr[0], sumr[1]));
			ans = Math.min(ans, max-min);
		}
		
		System.out.println(ans);
	}
	
	static long[] findSplit(long[] a, int i) {
		int idx = Arrays.binarySearch(a, a[i]/2);
		long[] ans = new long[2];
		if(idx>=0) {
		} else {
			idx = -idx-2;
			if(idx < i-1 && a[i]-a[idx+1] > a[idx]) {
				idx++;
			}
		}
		
		ans[0] = a[idx];
		ans[1] = a[i]-ans[0];
		return ans;
	}
}
