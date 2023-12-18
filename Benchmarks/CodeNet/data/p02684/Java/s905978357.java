import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		int a[] = new int[n];
		int d[] = new int[n];
		Arrays.fill(d, 0);
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int nc = 0;
		int ds = 1;
		while(true) {
			d[ds - 1] = 1;
			ds = a[ds - 1];
			nc++;
			if(d[ds - 1] == 1) {
				break;
			}
		}
		
		int lc = 1;
		int dd = ds;
		while(true) {
			ds = a[ds - 1];
			lc++;
			if(a[ds - 1] == dd) {
				break;
			}
		}
		
		int mc = nc - lc;
		long idx = (k - mc - 1) % lc;
		
		if(mc == 0) {
			ds = a[0];
			for(int i = 0; i < idx + 1; i++) {
				ds = a[ds - 1];
			}
		} else {
			ds = a[0];
			for(int i = 0; i < mc + idx; i++) {
				ds = a[ds - 1];
			}
		}
		
		System.out.println(ds);
		
	}
}