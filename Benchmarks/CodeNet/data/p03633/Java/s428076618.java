import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] t = new long[n];
		for(i=0;i<n;i++) {
			t[i] = parseLong(sc.next());
		}
		sc.close();
		long a = t[0];
		for (i = 1; i < n; i++) {
			a = lcm(a,t[i]);
		}
		out.println(a);
	}
	public static long lcm(long a, long b) {
		return (a / gcm(a, b)) * b;
	}
	public static long gcm(long a, long b) {
		long tmp;
		while((tmp = a % b) != 0) {
			a = b;
			b = tmp;
		}
		return b;
	}
}
