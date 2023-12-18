import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    String[] in = line.split(" ");
    int r = Integer.parseInt(in[0]);
    System.err.println(r);
    int g = Integer.parseInt(in[1]);
    System.err.println(g);
    int b = Integer.parseInt(in[2]);
    System.err.println(b);
    int n = Integer.parseInt(in[3]);
    System.err.println(n);

    int ret = 0;
    for (int i=0; i <= n/r; i++) {
      for (int j=0; j <= (n-r*i)/g; j++) {
        for (int k=0; k <= (n-r*i-g*j)/b; k++) {
          if (r*i + g*j + b*k == n) {
          	ret++;
          }
        }
      }
    }
    System.out.println(ret);
  }
}