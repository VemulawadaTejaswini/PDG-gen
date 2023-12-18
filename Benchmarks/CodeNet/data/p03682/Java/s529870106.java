
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	long[] x = new long[N];
	long[] y = new long[N];

	boolean[] notlinked = new boolean[N];
	
	for (int i = 0; i < N; i++) {
	    notlinked[i] = true;
	    x[i] = Long.parseLong(scan.next());
	    y[i] = Long.parseLong(scan.next());
	}

	long[][] cost = new long[N][N];
	for (int i = 0; i < N; i++) {
	    for (int j = i+1; j < N; j++) {
		long tmp = min(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j]));
		cost[i][j] = cost[j][i] = tmp;
	    }
	}

	notlinked[0] = false;
	long total = 0;
	for (int i = 0; i < N-1; i++) {
	    int to = 0;
	    long tmp = Long.MAX_VALUE;
	    
	    for (int j = 0; j < N; j++) {
		for (int k = 0; k < N; k++) {
		    if(j == k) continue;
		    
		    if(!notlinked[j] && notlinked[k] && cost[j][k] < tmp) {
			tmp = cost[j][k];
			to = k;
		    }
			    
		}
	    }
	    total += tmp;
	    notlinked[to] = false;
	}
	
	System.out.println(total);
	scan.close();
    }

    private static long min(long x, long y) {
	return x < y ? x : y;
    }
}
