import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		long N = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();

		long ar = N/a;
		if (N%a!=0) {
			ar++;
		}
		long br = N/b;
		if (N%b!=0) {
			br++;
		}
		long cr = N/c;
		if (N%c!=0) {
			cr++;
		}
		long dr = N/d;
		if (N%d!=0) {
			dr++;
		}
		long er = N/e;
		if (N%e!=0) {
			er++;
		}

		long[] list = new long [5];
		list[0]=ar;
		list[1]=br;
		list[2]=cr;
		list[3]=dr;
		list[4]=er;
		Arrays.sort(list);

		long time = list[4]+4;

		System.out.println(time);

	}
}