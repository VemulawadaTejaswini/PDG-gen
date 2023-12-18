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
	    while (true) {
	        double z = Math.pow(y + base, 5) - Math.pow(base, 5);
	        if (x == z) {
    	        System.out.println((y + base) + " " + base);
    	        System.exit(0);
	        }
	        if (x < z) {
	            return;
	        }
	        base++;
	    }
	}
}
