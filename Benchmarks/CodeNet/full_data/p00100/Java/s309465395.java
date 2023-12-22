import java.util.*;

class Main {

    public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
	final long[] sum = new long[4001];
	final boolean[] ok = new boolean[4001];
	
	while ( true )  {
	    Arrays.fill(sum, 0);
	    Arrays.fill(ok, false);
	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }
	    for (int i = 0; i < n; i++) {
		final int cn = stdin.nextInt();
		final long su = stdin.nextLong();
		final long sn = stdin.nextLong();
		if (!ok[cn]) {
		    sum[cn] += su * sn;
		}
		if (sum[cn] >= 1000000L) {
		    ok[cn] = true;
		}
	    }
	    
	    boolean flag = false;
	    for (int i = 0; i < sum.length; i++){
		if (ok[i]){
		    System.out.println(i);
		    flag = true;
		}
	    }
	    if (!flag) {
		System.out.println("NA");
	    }
	}	
    }
}