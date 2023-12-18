

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
public static class FastReader {
	BufferedReader br;
	StringTokenizer st;
	//it reads the data about the specified point and divide the data about it ,it is quite fast
	//than using direct 

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
static ArrayList<String>list1=new ArrayList<String>();
static void combine(String instr, StringBuffer outstr, int index,int k)
{
	if(outstr.length()==k)
	{
		list1.add(outstr.toString());return;
	}
	if(outstr.toString().length()==0)
	outstr.append(instr.charAt(index));
    for (int i = 0; i < instr.length(); i++)
    {
        outstr.append(instr.charAt(i));
       
        combine(instr, outstr, i + 1,k);
        outstr.deleteCharAt(outstr.length() - 1);
    }
   index++;
} 
static ArrayList<ArrayList<Integer>>l=new ArrayList<>();
static void comb(int n,int k,int ind,ArrayList<Integer>list)
{
	if(k==0)
	{
		l.add(new ArrayList<>(list));

		return;
	}
	
	
	for(int i=ind;i<=n;i++)
	{
		list.add(i);
		comb(n,k-1,ind+1,list);
		
		list.remove(list.size()-1);
		
	}
	
	
	
	
	

}
static long sum(long n)
{
	long sum=0;
	while(n!=0)
	{
		sum+=n%10;
		n/=10;
	}
	return sum;
}


static boolean check(HashMap<Integer,Integer>map)
{
	for(int h:map.values())
		if(h>1)
			return false;
	return true;
}

static class Pair implements Comparable<Pair>{
    int x;int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
      //  this.i=i;
    }
	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return x-o.x;
		
	}
}
static long ncr(long n, int k) 
{ long m=(long)1e9+7;
    long C[] = new long[k + 1]; 
     
    // nC0 is 1 
    C[0] = 1;   
   
    for (int i = 1; i <= n; i++) 
    { 
        // Compute next row of pascal  
        // triangle using the previous row 
        for (int j = Math.min(i, k); j > 0; j--) 
            C[j] = (C[j]%m + C[j-1]%m)%m; 
    } 
    return C[k]%m; 
} 
static boolean isPrime(int n) 
{ 
    // Corner cases 
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 
  
    // This is checked so  
    // that we can skip 
    // middle five numbers 
    // in below loop 
    if (n % 2 == 0 ||  
        n % 3 == 0) 
        return false; 
  
    for (int i = 5; 
             i * i <= n; i = i + 6) 
        if (n % i == 0 || 
            n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 
  

static long gcd(long a, long b) 
{ 
  if (b == 0) 
    return a; 
  return gcd(b, a % b);  
} 

public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FastReader in=new FastReader();
	TreeMap<Long,Integer>map=new TreeMap<Long,Integer>();
	ArrayList<Integer>list=new ArrayList<Integer>();
	HashSet<Integer>set=new HashSet<Integer>();
	HashSet<Integer>dis=new HashSet<Integer>();
	
	int n=in.nextInt();
	int k=in.nextInt();
	int a[]=new int[n];
	int dp[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=in.nextInt();
	dp[0]=0;
	for(int i=1;i<Math.min(n, k);i++)
	{
		dp[i]=dp[0]+Math.abs(a[i]-a[0]);
	}
	
	for(int i=k;i<n;i++)
	{dp[i]=Integer.MAX_VALUE;
		for(int j=Math.max(0, i-k);j<i;j++)
		dp[i]=Math.min(dp[i-j]+Math.abs(a[i]-a[i-j]), dp[i]);
	}
	
	System.out.println(dp[n-1]);
	
	
	}
}
