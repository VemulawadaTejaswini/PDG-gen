import java.util.*;
import java.io.*;
import java.math.*;
class Main{
	static int mod1 = (int)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long w = sc.nextLong();
		ArrayList<pair> al = new ArrayList<>();
		for(int i=1;i<=n;i++){
			pair p = new pair();
			p.l=sc.nextLong();
			p.r=sc.nextLong();
			al.add(p);
		}
		long dp[][] = new long[n+1][(int)w+1];
		long total = -1;
		for(int i=1;i<=n;i++){
			long val = al.get(i-1).l;
			long profit = al.get(i-1).r;
			for(int j=1;j<=w;j++){
				dp[i][j] = dp[i-1][j];
				dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
				if(j-(int)val>=0){
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-(int)val] + profit);
				}
			}
		}
		System.out.println(dp[n][(int)w]);
		
	}
	
	
	static boolean prime[] = new boolean[(int)1e6+1];
	public static void prime(){
		for(int i=2;i<=Math.sqrt((int)1e6);i++){
			if(prime[i]==false){
				for(int j=i*i;j<=(int)1e6;j+=i){
					prime[j]=true;
				}
			}
		}
	}
	
	
	

	public static char[] swap(int a, int b, char arr[]){
		for(int i=a, j=b; i<=j;i++, j--){
			char hold = arr[i];
			arr[i] = arr[j];
			arr[j] = hold;
		}
		return arr;
	}


	
	
	
	public static class pair{
		long l;
		long r;
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