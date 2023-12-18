import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] obuget = new int[100010];
		int[] ebuget = new int[100010];
		int E = 0;
		int O = 0;
		int m = n/2;
		boolean f  = true;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 1; i < n; i++) {
			if (a[i] != a[i-1]) {
				f = false;
			}
		}
		if (f) {
			System.out.println(n/2);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				ebuget[a[i]]++;
			} else {
				obuget[a[i]]++;
			}
		}
		Arrays.sort(ebuget);
		Arrays.sort(obuget);
		E = ebuget[100009];
		O = obuget[100009];
		int ei = 0;
		int oi = 0;
		for (int i = 0; i < n; i++) {
			if (ebuget[i] == E) {
				ei = i;
			}
			if (obuget[i] == O) {
				oi = i;
			}
		}
		
		if (ei == oi) {
			if (E >= O) {
				O = obuget[100008];
			} else {
				E = ebuget[100008];
			}
		}
		
		int emax = E;
		int omax = O;
		int eans = m-emax;
		int oans = m-omax;
		System.out.println(eans+oans);
	}
}
