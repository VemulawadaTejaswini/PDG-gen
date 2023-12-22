import java.util.*;
 
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long k = sc.nextLong();
	long d = sc.nextLong();
	long X = Math.abs(x);
	//if (X - k*d >= 0) {
	if (X/d >= k) {
	    System.out.print(Math.abs(X - k*d));
	} else {
	    if (X - k*d >= 0) {
		System.out.print(Math.abs(X - k*d));
	    } else {
		long near = X/d;
		if ((k-near)%2==0) {
		    if (X-near*d >= Math.abs(X-(near+2)*d) && near+2<=k)
			System.out.print(Math.abs(X-(near+2)*d));
		    else { System.out.print(Math.abs(X-near*d)); }
		} else {
		    if (X-(near-1)*d >= Math.abs(X-(near+1)*d) && near+1<=k)
			System.out.print(Math.abs(X-(near+1)*d));
		    else { System.out.print(Math.abs(X-(near-1)*d)); }
		}
	    }
	}
    }
}