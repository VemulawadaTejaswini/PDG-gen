
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int[] x = new int[N];
	int[] y = new int[N];

	boolean[] notlinked = new boolean[N];
	
	for (int i = 0; i < N; i++) {
	    notlinked[i] = true;
	    x[i] = Integer.parseInt(scan.next());
	    y[i] = Integer.parseInt(scan.next());
	}

	int[][] cost = new int[N][N];
	for (int i = 0; i < N; i++) {
	    for (int j = i+1; j < N; j++) {
		int tmp = min(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j]));
		cost[i][j] = cost[j][i] = tmp;
	    }
	}

	notlinked[0] = false;
	int total = 0;
	for (int i = 0; i < N-1; i++) {
	    int to = 0;
	    int tmp = Integer.MAX_VALUE;
	    
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

    private static int min(int x, int y) {
	return x < y ? x : y;
    }
}
