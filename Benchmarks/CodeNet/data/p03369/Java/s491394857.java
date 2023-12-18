import java.io.*;

public class A {
  public static void main (String[] args) {
    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String s = new String(in.readLine());

      int ans = 700;
      if(s.charAt(0) == 'o') {
        ans += 100;
      }
      if(s.charAt(1) == 'o') {
        ans += 100;
      }
      if(s.charAt(2) == 'o') {
        ans += 100;
      }

      System.out.println(ans);
    } catch (IOException e) {
    }
  }
}