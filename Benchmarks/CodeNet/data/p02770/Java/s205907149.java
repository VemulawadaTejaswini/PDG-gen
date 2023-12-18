import java.util.*;

class Main {
	Scanner sc;
	int k, q;
	int[] d, dm;
	long[] e;
	
	void calc() {
		sc = new Scanner(System.in);
		k = sc.nextInt();
		q = sc.nextInt();
		
		d = new int[k];
		dm = new int[k];
		e = new long[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}
		
		for (int i = 0; i < q; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int m = sc.nextInt();
			
			dm[0] = d[0] % m;
			e[0] = dm[0];
			for (int j = 1; j < k; j++) {
				dm[j] = d[j] % m;
				e[j] = e[j-1] + dm[j];
				if (e[j] == e[j-1]) e[j] += m;
			}
			long e0 = (e[k-1]%m == e[0])?m:0;
			
			long sum = (x%m) + (e[k-1] + e0)*( (n-2)/k )+e[(n-2)%k];
			long c = sum/m;
			System.out.println(n-1-c);
		}
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
