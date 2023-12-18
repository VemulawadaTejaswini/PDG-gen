import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
			sum+=a[i];
		}
		sc.close();
		out.println(h<=sum?"Yes":"No");
	}
}
