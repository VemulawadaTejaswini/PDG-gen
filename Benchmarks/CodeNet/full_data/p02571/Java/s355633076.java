import java.io.*;
import java.util.*;


public class Main{
	
	public static void main(String[] args){
	
	MyScanner sc = new MyScanner();
	out = new PrintWriter(new BufferedOutputStream(System.out));
	
	/**/

	String s = sc.next();
	String t = sc.next();
	int counter = 0;
	int min = t.length();
	
	for(int i = 0; i <= s.length() - t.length(); i++){
		
		for(int i2 = 0; i2 < t.length(); i2++){
			
			if(s.charAt(i + i2) == t.charAt(i2)){
				
			}else{
				counter++;
			}
				
		}
		
		min = Math.min(counter, min);
		counter = 0;
	}
	
	System.out.println(min);
	
	/**/
	 
	 out.close();	
	}
	
	
	
	public static PrintWriter out;
	
	public static class MyScanner{
		
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
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
 
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }

   }
	
}
