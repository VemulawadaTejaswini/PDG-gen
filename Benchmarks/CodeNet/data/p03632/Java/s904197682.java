import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Main {	
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class Task {
		
        public void solve(int testNumber, InputReader in, PrintWriter out) {

        	int a = in.nextInt();
        	int b = in.nextInt();
        	int c = in.nextInt();
        	int d = in.nextInt();
        	
        	if(b < c){
        		out.println(0);
        	}
        	else{
        		out.println(Math.max(0 , Math.min(b, d) - Math.max(a, c) ) );
        	}

        }
        
	}
	
	static class InputReader {
		
		BufferedReader in;
		StringTokenizer tok;
		
		public InputReader(InputStream stream){
			in = new BufferedReader(new InputStreamReader(stream), 32768);
			tok = null;
		}
		
		String nextToken() 
		{
			String line = "";
			while(tok == null || !tok.hasMoreTokens()) {
				try {
					if((line = in.readLine()) != null)
						tok = new StringTokenizer(line);
					else 
						return null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}
			return tok.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(nextToken());
		}
		long nextLong()	{
			return Long.parseLong(nextToken());
		}
		double nextDouble()	{
			return Double.parseDouble(nextToken());
		}	
		
	}	
	
}






