import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int t = sc.nextInt();
		int u = sc.nextInt();
		int v = sc.nextInt();
		int l = sc.nextInt();

		int d[] = new int[n + 1];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		d[n] = l;

		int index = 0;
		int nc = 0;
		int cn = 0;
		long boost = t * v;

		
		int bl = 0;
		for (int i = 0; i < l; i++) {
			if (d[index] <= i) {
				if (cn == 0) {
					nc = i;
				}
				if (cn == k+1) {
					nc = i;
				} else {
					cn++;
				}
				index++;
			}
			
			if (cn !=0 &&i - nc == boost) {
				nc = i;
				cn--;
			}
			if(cn > 0){
				bl++;
			}
		}
		int nbl = l-bl;
		
		System.out.println((double)bl/v + (double)nbl/u);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}