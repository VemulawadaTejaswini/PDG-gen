import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int maxn=(int)(3501);
	
	static long gcd(long a,long b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	
    public static void main(String args[]) throws Exception
    {
		long n=sc.nextLong();long val1=-1,val2=-1,val3=-1;
		
		outer:
		for(long i=maxn-1;i>=1;i--)
		{
			for(long j=maxn-1;j>=1;j--)
			{	
				long lcm=(n*i)/gcd(n,i);
				
				long num=(4*(lcm/n))-(lcm/i),den=lcm;
				
				long curr2=(gcd(num,den));
				
				num/=curr2;den/=curr2;
				
				lcm=(j*den)/gcd(den,j);
				
				long num2=(num*(lcm/den))-(lcm/j),den2=lcm;
				
				long now=gcd(num2,den2);
				
				num2/=now;den2/=now;
				
				if(num2==1 && den2>0)
				{
					val1=i;val2=j;val3=den2;
					
					break outer;
				}
				
				else if(den2<0)
				{
					break;
				}
			}
		}
		
		out.println(val1+" "+val2+" "+val3);out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}