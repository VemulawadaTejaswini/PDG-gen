import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		for (i = 0; i < n; i++) {
			x[i] = parseInt(sc.next());
			y[i] = parseInt(sc.next());
		}
		sc.close();
		int fa = 1;
		for (i = 1; i < n; i++) {
			fa *= i;
		}
		double ll = 0.0d;
		for (i = 0; i < n-1; i++) {
			for (j = i+1; j < n; j++) {
				ll += sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])) * fa *2;
			}
		}
		out.println(ll/(fa*n));
	}
}
