import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
 public class Main {
   public static void main(String[] args) throws IOException {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(in.readLine());
     StringTokenizer stk = new StringTokenizer(in.readLine());
     in.close();
     String s = stk.nextToken();
     int diff = s.replaceAll("ABC","").length();
     System.out.println((n-diff)/3);
   }
 }