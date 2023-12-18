import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '1') {
				System.out.print(9);
			} else {
				System.out.print(1);
			}
		}
	}

	static class FastReader { 
      BufferedReader br; 
      StringTokenizer st; 
  
      public FastReader() { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
      } 

      String next() { 
        while (st == null || !st.hasMoreElements()) { 
          try { 
            st = new StringTokenizer(br.readLine()); 
          } catch (IOException  e) { 
            e.printStackTrace(); 
          } 
       } 
       return st.nextToken(); 
      } 
  
      int nextInt() { 
        return Integer.parseInt(next()); 
      } 
 
      long nextLong() { 
        return Long.parseLong(next()); 
      } 
  
      double nextDouble() { 
        return Double.parseDouble(next()); 
      } 
  
      String nextLine() { 
        String str = ""; 
        try{ 
          str = br.readLine(); 
        } catch (IOException e) { 
          e.printStackTrace(); 
        } 
        return str; 
      } 
    } 
}
