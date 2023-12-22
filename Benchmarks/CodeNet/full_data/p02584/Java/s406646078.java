import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long k = sc.nextLong();
	long d = sc.nextLong();
	if (Math.abs(x) - k*d >= 0) {
	    System.out.print(Math.abs(Math.abs(x) - k*d));
	} else {
	    long near = (long)Math.abs(x)/d;
	    if ((k-near)%2==0) {
		if (Math.abs(x)-near*d <= Math.abs(Math.abs(x)-(near+2)*d))
		    System.out.print(Math.abs(Math.abs(x)-near*d));
		else { System.out.print(Math.abs(Math.abs(x)-(near+2)*d)); }
	    } else {
		if (Math.abs(x)-(near-1)*d <= Math.abs(Math.abs(x)-(near+1)*d))
		    System.out.print(Math.abs(Math.abs(x)-(near-1)*d));
		else { System.out.print(Math.abs(Math.abs(x)-(near+1)*d)); }
	    }
	}
    }
}
