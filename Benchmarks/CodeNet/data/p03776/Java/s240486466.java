import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] v = new long[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextLong();
		}
		Arrays.sort(v);
		
		long sum = 0;
		int count = 0;
		int count2 = 0;
		int startind = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (n - 1 - i < b) {
				if ((n - 1 - i)>= a && v[i] < v[n-1]) {
					break;
				}
				sum += v[i];
				count++;
			}
		}
			for (int i = n - 1; i >=0; i--) {
				if( v[i] == v[n-a]) {
				count2++;
				if(count == a) {
				if(startind < i) {
					startind = i;
				}
				}
				}
			}
		double result = (double)sum / (double)count;
		long conb = 0;
		if(count == a) {
			conb = nChooseK(count2, n -1 - startind);
		} else {
			for (int i = a; i <= count2; i++) {
				conb += nChooseK(count2, i);
			}
		}
		System.out.println(result);
		System.out.println(conb);
	}
	
	static long nChooseK (int n, int k) {
		if (k == 0) return 1;
		return  (nChooseK(n, k-1) * (n-k+1) / k);
    }

}
