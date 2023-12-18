
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

class temp2 {

	static long mod = (long) 998244353;
	static long time = 0, mp = Integer.MAX_VALUE, k = 0, cnt = 0, edge = 0, no = 0;

	static int[] goal;
	static int[] init;
	static int[] col;
	static char[][] g;
	static String sb = "";
	static ArrayList<Integer>[] a;

	public static class pair implements Comparable<pair> {
		int idx;
		int k;

		pair(int a, int b) {
			idx = a;
			k = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return o.idx - this.idx;
		}

	}

	static ArrayList<Integer> p = new ArrayList<>();

	static int N = 100001;
	static long pow[] = new long[N];
	static long inv[] = new long[N];

	static long pow(long a, long b, long m) {
		if (a == 0)
			return 0;
		if (b == 0)
			return 1;
		long temp = pow(a, b / 2, m);
		temp = ((temp % m) * (temp % m)) % m;
		if ((b & 1) > 0)
			temp = ((temp % m) * (a % m)) % m;
		return temp;
	}

	static void pre() {
		pow[0] = 1;
		for (int i = 1; i < N; i++) {
			pow[i] = (pow[i - 1] * 2) % mod;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		

		int n=scn.nextInt();
		int cost[]=new int[n];
		for(int i=0;i<n;i++){
			cost[i]=scn.nextInt();
		}
		int dp[]=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0]=0;
		for(int i=0;i<n;i++){
			for(int j=i-1;j>=i-2 && j>=0;j--){
				dp[i]=Math.min(dp[i], Math.abs(cost[i]-cost[j])+dp[j]);
			}
		}
		
		
		
		
		System.out.println(dp[n-1]);

	}

}