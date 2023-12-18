import java.util.*;

public class Main {
	static long[] pattyCounts = new long[51];
	static long[] burgerLengths = new long[51];
	static long layers;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		layers = in.nextLong();
		for( int i = 0; i <= 50; i++ ) {
			pattyCounts[i] = pattyCount(i);
		}
		for( int i = 0; i <= 50; i++ ) {
			burgerLengths[i] = burgerLength(i);
		}
		System.out.println(solve(n, 1, burgerLengths[n]));
	}
	public static long solve(int level, long min, long max) {
		long mid = (max-min)/2 + min;
		if(layers == mid || min == max) {
			//System.out.printf("Base Case: %d Level: %d\n",(long)Math.ceil((double)pattyCounts[level]/2),pattyCounts[level]);
			if( layers >= mid ) return (long) Math.ceil((double)pattyCounts[level]/2);
			else return 0;
		} else if(layers > mid) {
			//System.out.printf("Greater Case: %d\n", pattyCounts[level-1]);
			return (long) pattyCounts[level-1] + 1 + solve( level-1, mid+1, max-1 );
		} else {
			return solve( level-1, min+1, mid-1 );
		}
	}
	public static long pattyCount(int n) {
		if( n == 0 ) return 1;
		return pattyCount(n-1)*2 + 1;
	}
	public static long burgerLength(int n) {
		if( n == 0 ) return 1;
		return burgerLength(n-1)*2 + 3;
	}
}

// BPPPB
// BBPPPBPBPPPBB
// 0012334456777
// 1234567890123
// 2