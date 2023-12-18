import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);   		
    	int N = sc.nextInt();
    	int min = 200;
    	int max = 0;
    	int[] arr = new int[N];
    	for(int i=0;i<N;i++) {
    		int x= sc.nextInt();
    		arr[i]=x;
    		if(x >max)
    			max=x;
    		if(x <min)
    			min = x;
    	}
    	int minStamina = 100000;
    	for(int j=min;j<=max;j++) {
    		int stamina=0;
    		for(int k=0;k<arr.length;k++) {
    			stamina += Math.pow((arr[k]-j),2);
    		}
    		if (stamina < minStamina) {
    			minStamina = stamina;
    		}
    	}
    	System.out.println(minStamina);
    	
    		}
    }

class Pair
{
	long x;
	long y;
	
	public Pair(long x,long y) {
		this.x=x;
		this.y=y;
		
	}
}

class Scanner 
{
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

	public String next() throws IOException 
	{
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {return Integer.parseInt(next());}
	
	public long nextLong() throws IOException {return Long.parseLong(next());}

	public String nextLine() throws IOException {return br.readLine();}
	
	public double nextDouble() throws IOException
	{
		String x = next();
		StringBuilder sb = new StringBuilder("0");
		double res = 0, f = 1;
		boolean dec = false, neg = false;
		int start = 0;
		if(x.charAt(0) == '-')
		{
			neg = true;
			start++;
		}
		for(int i = start; i < x.length(); i++)
			if(x.charAt(i) == '.')
			{
				res = Long.parseLong(sb.toString());
				sb = new StringBuilder("0");
				dec = true;
			}
			else
			{
				sb.append(x.charAt(i));
				if(dec)
					f *= 10;
			}
		res += Long.parseLong(sb.toString()) / f;
		return res * (neg?-1:1);
	}
	
	public boolean ready() throws IOException {return br.ready();}
}
