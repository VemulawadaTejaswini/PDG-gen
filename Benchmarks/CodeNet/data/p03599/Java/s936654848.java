
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
	 static InputReader in = new InputReader(System.in);
	 static PrintWriter out = new PrintWriter(System.out);
	 
	 public static void main(String[] args) throws Exception {
		 int a = in.nextInt()*100;
		 int b = in.nextInt()*100;
		 int c = in.nextInt();
		 int d = in.nextInt();
	 	 int e = in.nextInt();
		 int max = in.nextInt();
		 int sw = 0;
		 int sugar = 0;
		 
		 int min_w=Math.min(a,b);
		 int min_s=Math.min(c,d);
		 int max_w=Math.max(a,b);
		 //water 
		 if (min_w+min_s > max) {}
		 
		 else if ((min_w*e)/100 >= min_s)
		 {
				 sw=min_w + min_s;
				 sugar = min_s;	 
		
		 }
		 else if (max_w+min_s <= max && max_w*e/100 >= min_s )
		 {
			 sw = max_w + min_s;
			 sugar = min_s;
		 }
		 else 
		 {
			 sw=min_w;
		 }
		 
		 out.println(sw+" "+sugar);
		 out.close();
		 
	 
	 
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
	 
	        public String nextLine() {
	            try {
	                return reader.readLine();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            return null;
	        }
	 
	        public boolean hasNext() {
	            String next = null;
	            try {
	                next = reader.readLine();
	            } catch (Exception e) {
	            }
	            if (next == null) {
	                return false;
	            }
	            tokenizer = new StringTokenizer(next);
	            return true;
	        }
	 
	        public BigInteger nextBigInteger() {
	            return new BigInteger(next());
	        }
	        public int[] intArr() throws Exception {
	            String[] strarray = reader.readLine().trim().split(" ");
	            int[] intarray = new int[strarray.length];
	            for (int i = 0; i < intarray.length; i++) {
	                intarray[i] = Integer.parseInt(strarray[i]);
	            }
	            return intarray;
	        }
	     
	        /* long Array*/
	        public long[] longArr() throws Exception {
	            String[] strarray = reader.readLine().trim().split(" ");
	            long[] longarray = new long[strarray.length];
	            for (int i = 0; i < longarray.length; i++) {
	                longarray[i] = Long.parseLong(strarray[i]);
	            }
	            return longarray;
	    }
	}
}