import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int S, T;
	static void f(int sum, int[] a, int[] b) {
		if (a.length == 0) {
			if (sum >= 0)
				S++;
			T++;
			return;
		}
		int[] na = new int[a.length - 1];
		for (int i = 0; i < a.length - 1; i++)
			na[i] = a[i + 1];
		for (int i = 0; i < b.length; i++) {
			int[] nb = new int[b.length - 1];
			int p = 0;
			for (int k = 0; k < b.length; k++) {
				if (i == k)
					continue;
				nb[p] = b[k];
				p++;
			}
			int win = a[0] > b[i] ? a[0] + b[i] : -(a[0] + b[i]);
			f(sum + win, na, nb);
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int[] a = new int[9], b = new int[9];
			for (int j = 0; j < 9; j++)
				a[j] = sc.nextInt();
			for (int j = 0; j < 9; j++)
				b[j] = sc.nextInt();
			S = 0;
			T = 0;
			f(0, a, b);
			double p = (double)S / (double)T;
			System.out.printf("%.5f %.5f", p, (1.0 - p));
			System.out.println();
//			System.out.println(new Stringp + " " + (1.0 - p));
		}
	}
}