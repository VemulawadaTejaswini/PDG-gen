import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static int[] readInts(String cad) {
		String read[] = cad.split(" ");
		int res[] = new int[read.length];
		for (int i = 0; i < read.length; i++) {
			res[i] = Integer.parseInt(read[i]);
		}
		return res;
	}
	
	static void printArrayInt(long[] array) {
		if (array == null || array.length == 0)
			return;
		for (int i = 0; i < array.length; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	static void printMatrixInt(long[][] array) {
		if (array == null || array.length == 0)
			return;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (j > 0)
					System.out.print(" ");
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}
	
	public static class Item {
		
	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader in;
		
			in = new BufferedReader(new InputStreamReader(System.in));

		int values[] = readInts(in.readLine());
		int n = values[0];
		int w = values[1];
		
		int items[][] = new int[n][];
		
		for( int i =0; i < n; i++ )
			items[i] = readInts(in.readLine());
		
		Arrays.sort(items, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		} );
		int m = n* 1000 + 1;
		long dp[][] = new long[n][m];
		
		
		for( int i =0; i < n ; i++ ) {
			Arrays.fill(dp[i], INF);
		}
		
		for( int i = 0; i < m; i++ )
			if( i <= items[0][1])
				dp[0][i] = items[0][0];

		for( int i = 1; i < n; i++ ) {
			for( int j = 0; j < m; j++ ) {
				if(j >= items[i][1]) 
					dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j - items[i][1]] + items[i][0]);
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		long min = INF;
		for( int i = 0; i < m; i++ ) {
			if( dp[n-1][i] <= w) {
				min = i;
			}
		}
		
		//printMatrixInt(dp);
		System.out.println(min);
	}
	
}
