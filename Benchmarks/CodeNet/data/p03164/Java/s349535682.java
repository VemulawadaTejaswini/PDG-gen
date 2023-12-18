import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;





 class Main{
	
	

	public static void main(String[] args) throws IOException {
		
		
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		long capacity = sc.nextInt();
		dp = new long[n+1][(int) (capacity+1)];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=capacity; j++)
				dp[i][j] = -1;
		}
		long wights[] = new long[n];
		long value[] = new long[n];
		for(int i=0; i<n; i++) {
			wights[i] = sc.nextLong();
			value[i] = sc.nextLong();
		}
		long v = solve(wights,value,n,capacity);
		System.out.println(v);
	}
	
	
	
	static long dp[][];
	
 
	private static long solve(long[] wights, long[] value, int n, long capacity) {
		if(n == 0 || capacity==0)
			return 0;
		if(dp[n][(int) capacity] != -1)
			return dp[n][(int) capacity];
		if(wights[n-1] <= capacity) {
			return dp[n][(int) capacity] = Math.max(solve(wights, value, n-1, (int) (capacity-wights[n-1])) 
					+ value[n-1],
					solve(wights, value, n-1, capacity));
		}
		else {
			return dp[n][(int) capacity] =  solve(wights, value, n-1, capacity);
		}
		
	}





	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long[] readArrayLong(int n) {
        	long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
        }
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
	}
}
