import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static long n, m;
  static long ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    m = (in[1].charAt(0) - '0') * 100 + (in[1].charAt(2) - '0') * 10 + (in[1].charAt(3) - '0');

    br.close();

    out.println((m * n) / 100);

    out.flush();
  }
}
