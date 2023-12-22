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
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long n = parseLong(sc.next());
		sc.close();
		long x=Math.min(b-1,n);
		out.println((long)floor((double)a*x/b)-a*(long)floor((double)x/b));
	}
}
