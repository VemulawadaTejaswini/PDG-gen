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
		int m = parseInt(sc.next());
		int[] a = new int[n+m-1];
		int[] b = new int[n+m-1];
		for (i = 0; i < n+m-1; i++) {
			a[i] = parseInt(sc.next());
			b[i] = parseInt(sc.next());
		}
		sc.close();
	}
}
