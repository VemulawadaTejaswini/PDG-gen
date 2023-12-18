import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  static Integer arr[];
  static int b[];
  static class FastReader{
    StringTokenizer st;
    BufferedReader in;
    public FastReader() {
    in = new BufferedReader(new InputStreamReader(System.in));
    }
    
    String next() {
      while (st == null|| !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(in.readLine());
        } catch(IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }
    
    int nextInt(){
      return Integer.parseInt(next());
    }
    
    long nextLong(){
      return Long.parseLong(next());
    }
    
    double nextDouble(){
      return Double.parseDouble(next());
    }
    
    String nextLine(){
      String str = "";
      try {
        str = in.readLine();
      } catch(IOException e){
        e.printStackTrace();
      }
      return str;
    }
  }
  
  public static void main(String[] args){
    FastReader sc = new FastReader();
    String s = sc.next();
    if(s.contains("7"))
    {
      System.out.println("Yes");
    }else System.out.println("No");
    
  }
}