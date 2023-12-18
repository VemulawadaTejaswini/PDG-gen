import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] x = new long[n];
		long sum = 0;
		for (i = 0; i < x.length; i++) {
			x[i] = parseLong(sc.next());
			sum+=x[i];
		}
		sc.close();
		double ave = (double)sum/n;
		long p1 = (long)floor(ave);
		long p2 = (long)ceil(ave);
		long tot1=0,tot2=0;
		for (i = 0; i < n; i++) {
			tot1+=(x[i]-p1)*(x[i]-p1);
			tot2+=(x[i]-p2)*(x[i]-p2);
		}
		out.println(Math.min(tot1,tot2));
	}
}
