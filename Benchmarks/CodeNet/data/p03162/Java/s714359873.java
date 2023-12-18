import java.util.*;
import java.io.*;
import java.math.*;
class Main{
	static int mod = (int)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long dp[][] = new long[n][3];
		long arr[][] = new long[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextLong();
			}
		}
		for(int i=0;i<3;i++){
			dp[0][i] = arr[0][i];
		}
		
	
		for(int i=1;i<n;i++){
			for(int j=0;j<3;j++){
				dp[i][(j+1)%3] = Math.max(dp[i][(j+1)%3], arr[i][(j+1)%3]+dp[i-1][j]);
				dp[i][(j+2)%3] = Math.max(dp[i][(j+2)%3], arr[i][(j+2)%3]+dp[i-1][j]);
			}
		}
	
		long ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1] , dp[n-1][2]));
		System.out.println(ans);
	}
	
	
	
	public static class pair{
		long a;
		long b;
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return Long.valueOf(o2.a-o2.b).compareTo(Long.valueOf(o1.a-o1.b));
		}
	}
	
	
	
	public static long sum(long a, long d, long n){
		
		long total = ((n)*((2*a)+(n-1)*d))/2;
		return total;
	}
	
	public static class trie{
		char ch;
		HashMap<Character,trie> hm = new HashMap<>();
		int count;
		boolean isterminal;
	}
	
	
	public static int partition(int [] arr, int s, int e){
		
		int index=s;
		int pivot = arr[e];
		for(int i=s;i<=e-1;i++){
			if(arr[i]<=pivot){
				arr = swap(arr, index, i);
				index++;
			}
		}
		swap(arr,index,e);
		print(arr);
		return index;
	}
	
	public static int[] swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		return arr;
	}
	
	
	public static long gcd(long a, long b){
		if(a==0)
			return b;
		
		return gcd(b%a,a);
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
 
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
}