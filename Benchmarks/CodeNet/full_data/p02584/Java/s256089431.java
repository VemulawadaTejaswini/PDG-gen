import java.util.*;
 
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long k = sc.nextLong();
	long d = sc.nextLong();
	if (x < 0) x = -x;
	if (x/d >= k) {
	    System.out.print(x - k*d);
	} else {
	    k = k - x/d;
	    x = x - x/d * d;
	    if (k%2 == 1) System.out.print(Math.abs(x - d));
	    else { System.out.print(x); }
	}
    }
}
