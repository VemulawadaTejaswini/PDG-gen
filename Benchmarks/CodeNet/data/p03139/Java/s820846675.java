import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int a = Integer.parseInt(in[1]);
    int b = Integer.parseInt(in[2]);

    br.close();

    int mx = Math.min(a, b);
    int mn = Math.max(a + b - n, 0);
    System.out.println(mx + " " + mn);
  }
}