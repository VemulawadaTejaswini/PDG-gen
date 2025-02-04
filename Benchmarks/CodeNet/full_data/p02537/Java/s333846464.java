
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main{
	static int len=0;
	static long[] a=new long[10];
	static long[] segment_tree=new long[10];
	static int d=0;
	static int left(int p)
	{
		return 2*p;
	}
	static int right(int p)
	{
		return 2*p+1;
	}
	static int parent(int p)
	{
		return (int) Math.floor(p/2.0);
	} 
	static void build_segment_tree(int p,int L,int R)
	{
		if(L==R)
			segment_tree[p]=a[L]; 
		else
		{
			build_segment_tree(left(p),L,(L+R)/2);
			build_segment_tree(right(p),((L+R)/2)+1,R);
			long x=segment_tree[left(p)];
			long y=segment_tree[right(p)];
			if(x<=y)
				segment_tree[p]=y;
			else
				segment_tree[p]=x;
		}
	}
	static long rmq(int i,int j)
	{
		return rmq_helper(1,0,len-1,i,j);
	}
	static long rmq_helper(int p,int L,int R,int i,int j)
	{
		if(j<L || i>R)
		{
			return -1;
		}
		if(i<=L && j>=R)
			return segment_tree[p];
		else
		{
			long x=rmq_helper(left(p),L,(L+R)/2,i,j);
			long y=rmq_helper(right(p),(L+R)/2+1,R,i,j);
			if(x==-1)
				return y;
			if(y==-1)
				return x;
			return Math.max(x,y);
		}
	}
	static void update(int index,long value)
	{
		a[index]=value;
		d=0;
		update_helper1(1,0,len-1,index);
		segment_tree[d]=value;
		update_helper2(d);
	}
	static void update_helper2(int d)
	{
		while(true)
		{
			d=parent(d);
			if(d==0)
				break;
			long x=segment_tree[right(d)];
			long y=segment_tree[left(d)];
			if(x<=y)
				segment_tree[d]=y;
			else
				segment_tree[d]=x;
		}
	}
	static void update_helper1(int p,int L,int R,int index)
	{
		if(L==index && R==index)
		{
			d=p;
			return;
		}
		else if(L<=index && index<=(L+R)/2)
			update_helper1(left(p),L,(L+R)/2,index);
		else if((L+R)/2+1<=index && index<=R)
			update_helper1(right(p),(L+R)/2+1,R,index);
	}
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine().replaceAll("\\s", ""));
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}                                              
		return ans;
	} 
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static long mod=1000000007;
	static long power(long x,long y) 
    { 
        long res = 1; 
        x = x % mod; 
        while (y > 0) { 
            if (y % 2 == 1) 
                res = (res * x) % mod; 
            y = y >> 1;
            x = (x * x) % mod; 
        } 
        return res%mod; 
    } 
    static long modInverse(long n) 
    { 
        return power(n, mod-2); 
    } 
    static long gcd(long a,long b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b)
			return gcd(a%b,b);
		return gcd(a,b%a);
	}
    public static void main(String[] args) throws Exception {
    	br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	int[]ar=split();
    	int n=ar[0];
    	int k=ar[1];
    	int[]arr=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=cin();
    	}
    	len=300000;
    	a=new long[len];
    	Arrays.fill(a, (long)1);
    	segment_tree=new long[4*len+1];
        build_segment_tree(1,0,len-1);
        long[]dp=new long[len+1];
        Arrays.fill(dp, (long)1);
        int[] max=new int[n];
        int[] min=new int[n];
        max[0]=arr[0];
        min[0]=arr[0];
        for(int i=1;i<n;i++)
        {
        	max[i]=Math.max(max[i-1],arr[i]);
        	min[i]=Math.min(min[i-1],arr[i]);
        }
        for(int i=0;i<n;i++)
        {
        	int x=arr[i];
        	int l=Math.max(0,x-k-1);
        	int r=Math.max(x+k-1,0);
        	if(l<min[i])
        		l=min[i];
        	if(r>max[i])
        		r=max[i];
//        	System.out.println(x+" "+l+" "+r+" "+rmq(l,r));
        	dp[x]=Math.max(dp[x],1+rmq(l,r));
        	update(x-1,dp[x]);
        }
        long ans=0;
        for(int i=0;i<=len;i++)
        {
        	ans=Math.max(dp[i], ans);
        }
        System.out.println(ans-1);
    }
}