import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long x = sc.nextLong();
	    long k = sc.nextLong();
	    long d = sc.nextLong();
	    if (x == d) {
	    	if (k % 2 == 0)  System.out.println(x);
	    	if (k % 2 == 1)  System.out.println(0);
	    } else if (Math.abs(k * d) < Math.abs(x)) {
	    	if (x < 0) System.out.println(Math.abs(x + k*d));
	    	if (x >= 0) System.out.println(Math.abs(x - k*d));
	    } else {
	    	boolean flag = false;
	    	long wk1 = 0; // 1個前の値
	    	long wk2 = 0; // 2個前の値
	    	long wk = 0;
		    for (long i = 0; i < k; i++) {
		    	if (i == 0) wk1 = x;
		    	if (i == 1) wk2 = x;
		    	if (Math.abs(x - d) > Math.abs(x + d)) {
		    		x = x + d;
		    	} else {
		    		x = x - d;
		    	}
		    	if (flag) {
		    		break;
		    	}
		    	// 同じ場所の往復
		    	if (i > 2) {
		    		if (i % 2 == 0) wk = wk1;
		    		if (i % 2 == 1) wk = wk2;
			    	if (wk == x) {
			    		if ((k - i - 1) % 2 == 0) {
			    			break;
			    		} else {
			    			flag = true;
			    		}
			    	}
		    	}
		    }
		    System.out.println(Math.abs(x));
	    }
	}
}
