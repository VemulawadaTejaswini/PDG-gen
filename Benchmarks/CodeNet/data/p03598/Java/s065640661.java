import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
	 static InputReader in = new InputReader(System.in);
	 static PrintWriter out = new PrintWriter(System.out);
	 
	 public static void main(String[] args) throws Exception {
		 int n = in.nextInt();
		 int b = in.nextInt();
		 int[] arr =in.intArr();
		 int dis =0;
		 for(int i=0; i<n; i++)
		 {
			 dis+=Math.min(arr[i],Math.abs(b-arr[i]));
		 }
		 
		 out.println(dis*2);
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
	}
}