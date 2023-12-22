import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args){
	
	MyScanner sc = new MyScanner();
	out = new PrintWriter(new BufferedOutputStream(System.out));
	
	/**/
	
	String input = sc.next();
	
	if(input.equals("RSS")){
		System.out.println(1);
	}else if(input.equals("SRS")){
		System.out.println(1);
	}else if(input.equals("SSR")){
		System.out.println(1);
	}else if(input.equals("RRS")){
		System.out.println(2);
	}else if(input.equals("SRR")){
		System.out.println(2);
	}else if(input.equals("RSR")){
		System.out.println(1);
	}else if(input.equals("RRR")){
		System.out.println(3);
	}else{
		System.out.println(0);
	}
	  
	  
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
