import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
	 static InputReader in = new InputReader(System.in);
	 static PrintWriter out = new PrintWriter(System.out);
	 
	 public static void main(String[] args) {
		 int n = in.nextInt();
		 int result = 0;
		 int a =0;
		 int b =0;
		 while (n -- >0)
		 {
			 a = in.nextInt();
			 b = in.nextInt();
			 result+= (b-a)+1;
		 }
		 
		
		 out.println(result);
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
	    }
	}