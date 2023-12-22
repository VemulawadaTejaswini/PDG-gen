import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
       long x=sc.nextLong(),k=sc.nextLong(),d=sc.nextLong();
       x=Math.abs(x);
       
       long div=x/d;
       long rem=x%d;
       long ans=Long.MAX_VALUE;
       if(div<k) {
    	   if(div>1)
    	   ans=Math.min(rem, d-rem);
    	   else {
    		   if(k%2==0) ans=x-d;
    		   else ans=rem;
    	   }
       }
       else if(div==k) ans=rem;
       else {
    	   ans=x-k*d;
       }
       System.out.println(ans);
         
       
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}