
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int N;
    private static int K;
    private static int[] a;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	K = Integer.parseInt(scan.next());

	a = new int[N];
	for (int i = 0; i < N; i++) {
	    a[i] = Integer.parseInt(scan.next());
	}
	Arrays.sort(a);

	int needless = binarySearch(0, N);
	System.out.println(needless);
	scan.close();
    }

    private static int binarySearch(int from, int to) {
	if(from == to) return from;

	int index = (from+to)/2;
	return isNeeded(index) ? binarySearch(from, index) : binarySearch(index+1, to);
    }

    private static boolean isNeeded(int target) {

	int k = K - a[target];
	if(k < 0) {
	    return true;
	}
	    
	int index = 0;

	boolean[][] dp = new boolean[N][K];
	for (int x = 0; x < N; x++) {
	    dp[x][0] = true;
	}

	for (int x = 1; x < N; x++) {
	    if(index == target) index++;
		
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
		return true;
	    }
	}
	
	return false;
    }
}
