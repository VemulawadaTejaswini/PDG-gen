import java.io.*;

public class Main {

  static int n, m;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    br.close();

    for(int x = 1; x <= m; x++){
      System.out.println(x + " " + (2 * m + 1 - x));
    }
    
  }

}