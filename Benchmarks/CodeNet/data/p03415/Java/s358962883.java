import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String a, b, c;
      String d, e, f;

      a = reader.readLine();
      d = a.substring(0, 1);
      b = reader.readLine();
      e = b.substring(1, 2);
      c = reader.readLine();
      f = c.substring(2);

      System.out.println(d + e + f);
      
    }
    catch (Exception e) {
      
    }
  }
}