import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= Math.sqrt(x); i++) {
		    if (x % i == 0) {
		        check(x, i);
		        check(x, x / i);
		    }
		}
	}
	
	static void check(int x, int y) {
	    int base = - (y / 2);
	    if (x == Math.pow(y + base, 5) - Math.pow(base, 5)) {
	        System.out.println((y + base) + " " + base);
	        System.exit(0);
	    }
	    int left = 0;
	    int right = Integer.MAX_VALUE / 10;
	    while (right - left > 1) {
	        int m = (left + right) / 2;
	        double z = Math.pow(m + y + base, 5) - Math.pow(m + base, 5);
	        if (x == z) {
	            System.out.println((m + base + y) + " " + (m + base));
	            System.exit(0);
	        } else if (x < z) {
	            right = m - 1;
	        } else {
	            left = m;
	        }
	    }
	}
}
