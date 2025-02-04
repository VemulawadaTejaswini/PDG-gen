import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	PrintWriter out;
    StringTokenizer st;
    BufferedReader br;
 	
 	class Pair implements Comparable<Pair>
	{
	    int f;
	    int s;
 
	    Pair(int t, int r) {
	       f = t;
	       s = r;
	    }
	    public int compareTo(Pair p)
	    {
	    	if(this.f!=p.f)
	    		return this.f-p.f;
 
	    	return this.s-p.s;
	    }
 	}
 	class Sort implements Comparator<Integer> 
	{ 
	    public int compare(Integer a, Integer b) 
	    { 
	    	if(a < 0)
	    		a *= -1;
	    	if(b < 0)
	    		b *= -1;
	    	return a.compareTo(b);
	    } 
	}
 
	String ns() {
        while (st == null || !st.hasMoreElements()) {
 
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    String nextLine() throws Exception {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            throw new Exception(e.toString());
        }
        return str;
    }
 
    int nextInt() {
        return Integer.parseInt(ns());
    }
 
    long nextLong() {
        return Long.parseLong(ns());
    }
 
    double nextDouble() {
        return Double.parseDouble(ns());
    }
	
	int upperBound(long a[],long key)
	{
		int l=0,r=a.length-1;
		int i=-1;
 
		while(l<=r)
		{
			int mid=(l+r)/2;
 
			if(a[mid]<key)
				l=mid+1;
 
			else{
				i=mid;	
				r=mid-1;
			}
			
		}
		return i;
	}
	int lowerBound(Pair[] a , long key)
	{
		int l = 0, r = a.length- 1;
		int i = -1;
 	
		while(l<=r)
		{
			int mid=(l+r)/2;
 
			if(a[mid].f<key)
			{
				i=mid;
				l=mid+1;	
			}
 
			else
				r=mid-1;
			
		}
		return i;
	}
 
	long power(long x,long y)
	{
	    long ans=1;
	    
	    while(y!=0)
	    {
	        if(y%2==1) ans=(ans*x)%mod;
	        x=(x*x)%mod;
	        y/=2;
	    }
	    return ans%mod;
	}
	
 
	int mod= 1000000007;
	long gcd(long x ,long y)
	{
		if(y==0)
			return x;
		return gcd(y,x%y);
	}
 
	// ArrayList a[];
	// int vis[],cnt=0;
	// void dfs(int ver)
	// {
	// 	ArrayList<Integer> l=a[ver];
	// 	if(l.size()==1)
	// 		cnt++;
	// 	for(int v:l)
	// 	{
	// 		if(vis[v]==0){
	// 			vis[v]=vis[ver]+1;
	// 			dfs(v);
	// 		}
	// 	}
	// }
 
 	int countSetBits(long n) 
    { 
        int count = 0; 
        while (n > 0) { 
            n &= (n - 1); 
            count++; 
        } 
        return count; 
    }

    int ans(int n)
    {
    	int cnt = 0;
    	for(int i = 1; i < 100; i++)
		{
			if(i * i >= n)
				break;
			for(int j = 1; j < 100; j ++)
			{
				if(i * i + j * j >= n)
					break;
				for(int k = 1; k < 100; k++)
				{
					int m = i*i + j*j + k*k + i*j + j*k + i*k;
					if(m == n)
						cnt++;
					if(m > n)
						break;
				}
			}
		}
		return cnt;
    }

	void solve() throws IOException{
		int n = nextInt();
		for(int i = 1; i <= n; i++)
			out.println(ans(i));
	}
 	
    void run() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
		solve();
		out.flush();
 
		out.close();
	}
 
	public static void main(String args[]) throws IOException {
		new Main().run();
	}		
}
 