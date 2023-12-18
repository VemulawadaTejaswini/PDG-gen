
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int K = Integer.parseInt(scan.next());

	int[] a = new int[N];
	for (int i = 0; i < N; i++) {
	    a[i] = Integer.parseInt(scan.next());
	}

	int need = 0;
	for (int i = 0; i < N; i++) {
	    int k = K - a[i];
	    if(k < 0) {
		need++;
		continue;
	    }
	    
	    int index = 0;

	    boolean[][] dp = new boolean[N][K];
	    for (int x = 0; x < N; x++) {
		dp[x][0] = true;
	    }

	    for (int x = 1; x < N; x++) {
		if(index == i) index++;
		
		for (int y = 0; y < K; y++) {
		    if(dp[x-1][y]) {
			dp[x][y] = true;
			int tmp = y + a[index];
			if(tmp < K) dp[x][tmp] = true;
		    }
		}
		index++;
	    }

	    for (int y = k; y < K; y++) {
		if(dp[N-1][y]) {
		    need++;
		    break;
		}
	    }
	}

	System.out.println(N - need);
	scan.close();
	}
    }
