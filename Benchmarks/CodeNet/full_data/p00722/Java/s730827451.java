import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);
	
	int a, d, n;
	while(kbd.hasNext()) {
	    a = kbd.nextInt();
	    d = kbd.nextInt();
	    n = kbd.nextInt();
	    if(a!=0 && d!=0 && n!=0)
		solve(a,d,n);
	}
    }

    static void solve(int a, int d, int n) {
	while(n>0) {
	    if(a!=1)
		if(isPrime(a)) n--;
	    if(n == 0) System.out.println(a);
	    a = a+d;
	}
    }

    static boolean isPrime(int a) {
	int f = (int)Math.sqrt(a);
	while(a%f > 0) f--;
	return f == 1;
    }
}

	