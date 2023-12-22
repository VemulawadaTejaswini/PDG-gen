import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
			long x = in.nextLong();
			long k = in.nextLong();
			long d = in.nextLong();
			long p = x/d;
			long r = x%d;
			long depend = k - p;
			if(depend >= 0){
				if(depend%2 == 0){
					System.out.println(Math.abs(r));
				}
				else{
					System.out.println(Math.min(Math.abs(r-d),Math.abs(r+d)));
				}
			}
			else{
				BigInteger w = new BigInteger(Long.toString(k));
				BigInteger y = new BigInteger(Long.toString(d));
				BigInteger z = w.multiply(y);
				BigInteger bigx = new BigInteger(Long.toString(x));
				BigInteger a = z.add(bigx),b = z.subtract(bigx);
				System.out.println((a.abs()).min(b.abs()));
			}
	}
}