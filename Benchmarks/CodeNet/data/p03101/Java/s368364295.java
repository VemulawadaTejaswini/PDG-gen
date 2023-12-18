import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
		int total = c * b;
		total += (a-c)*d;
		total = (a*b) - total;
		System.out.println(total);
	}
	
	static int ca(int n, String s) {
		boolean[] b = new boolean[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '<') count++;
			else break;
		}
		return count;
	}
	
	static int cb(int n, String s) {
		boolean[] b = new boolean[n];
		int count = 0;
		for(int i = n-1; i >= 0; i--) {
			if(s.charAt(i) == '>') count++;
			else break;
		}
		return count;
	}
	
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

}
