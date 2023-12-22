import java.io.*;
import java.util.*;
// i want to become the best
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    long mod = (long)1e9+7;
	    long[] suffmod = new long[n];
	    suffmod[n-1]=list[n-1]%mod;
	    for(int k = n-2;k>=0;k--){
	    	suffmod[k] = (suffmod[k+1]+list[k])%mod; 
	    }
	    long ans = 0;
	    for(int i = 0;i<n-1;i++){
	    	ans = (ans + (list[i]*(suffmod[i+1]))%mod)%mod;
	    }
	    System.out.println(ans);	
	}
}
class pair implements Comparable<pair>{
		long a = 0;
		int b = 0;
		public pair(long a,int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(pair p){
			if(this.a == p.a) return -(Integer.compare(this.b,p.b));
			else return -(Long.compare(this.a,p.a));
		}
		@Override
		public String toString(){
			return a+" "+b;
		}
	}
