import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long q = parseLong(sc.next());
		long h = parseLong(sc.next());
		long s = parseLong(sc.next());
		long d = parseLong(sc.next());
		long n = parseLong(sc.next());
		sc.close();
		long l1 = 100000000000000000L;
		l1 = Math.min(l1, 4*q);
		l1 = Math.min(l1, 2*h);
		l1 = Math.min(l1, s);
		long l2 = 100000000000000000L;
		l2 = Math.min(l1*2, d);
		out.println((n/2)*l2+(n%2)*l1);
	}
}
