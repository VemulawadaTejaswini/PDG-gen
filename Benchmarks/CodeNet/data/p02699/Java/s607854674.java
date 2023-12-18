import java.io.*;

public class Main {

  static int s, w;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    s = Integer.parseInt(in[0]);
    w = Integer.parseInt(in[1]);

    br.close();

    System.out.println(w >= s ? "unsafe" : "safe");
    
  }
}