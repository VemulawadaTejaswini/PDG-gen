import java.io.*;
 
public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String r = br.readLine();
      String[] in = r.split(" ");
      int x = Integer.parseInt(in[0]);
      int y = Integer.parseInt(in[1]);
      System.out.print(x * x);
      System.out.print(" ");
      System.out.println((x + y) * 2);
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}