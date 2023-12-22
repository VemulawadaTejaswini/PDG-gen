import java.io.*;

public class Main {

  static int a, b;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    a = Integer.parseInt(in[0]);
    b = Integer.parseInt(in[1]);

    br.close();

    System.out.println(a * b + " " + (2 * (a+b)));

  }
}
