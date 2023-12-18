

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static final int N=(int)5005;
	static long gcd(long x,long y) {
		return y==0?x:gcd(y,x%y);
	}
    public static void main(String[] args) {  
        InputStream sys=System.in;
        InputReader in=new InputReader(sys);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        long ans=1,gc=1;
        BigInteger sum=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++) {
        	long t=in.nextLong();
        	if(i==1) ans=t;
        	else {
        	   gc=gcd(ans,t);
        	   ans=ans/gc*t;
        	}
        }
      //  System.out.println(sum);
        out.println(ans);
        out.flush();
    }
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
        
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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