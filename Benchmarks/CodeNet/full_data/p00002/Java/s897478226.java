import java.util.*;
import java.io.*;
public class Main {

  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ln;
    StringTokenizer st;
    while((ln = br.readLine()) != null){
      st = new StringTokenizer(ln);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      System.out.println(((a+b)+"").length());
    }  
  }
}