import java.io.*;
import java.util.*;
public class Main
{
	static StringBuilder ans = new StringBuilder();
	public static void main(String[] args) throws IOException
	{
		Reader in=new Reader();
		long k = in.nextLong();
		System.out.println(pr("9",0));
		long r,n;
		String st = "";
		String ans[] = new String[(int)k];
		int index = (int)k-1;
		int temp = (int)k;
		while(k>0)
		{
			n = ((k-1)/9);
			st = pr("9",n);
			r =  k%9 == 0 ?9 :k%9 ;
			if(r<=9)
			{
				while(r>0)
				{
					// System.out.println(r + st);
					ans[index] = r+st;
					// System.out.println(ans[index]);
					index--;
					r--;
				}
			}
			r =  k%9 == 0 ?9 : k%9;
			k -= r;
		}

		for(int i=0;i<temp;i++)
		{
			System.out.println(ans[i]);
		}
	}


	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
	///////////////////////////////
    //String multiplication
	static String pr(String a, long b)
	{
		String c="";
		while(b>0)
		{
			if(b%2==1)
				c=c.concat(a);
			a=a.concat(a);
			b>>=1;
		}
		return c;
    }
    // (a^b)%m
    static long powm(long a, long b, long m)
	{
		long an=1;
		long c=a;
		while(b>0)
		{
			if(b%2==1)
				an=(an*c)%m;
			c=(c*c)%m;
			b>>=1;
		}
		return an;
	}
	static class Reader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
        	return Long.parseLong(next());
        }
        public double nextDouble() { 
            return Double.parseDouble(next());
        }
    }
}