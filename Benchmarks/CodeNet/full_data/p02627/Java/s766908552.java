import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class Main {

  static int n;
  static long[] ans;
  static List<Long> x, y, p;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");

    br.close();

    out.println(in[0].charAt(0) - 'a' >= 0 ? "a" : "A");

    out.flush();
  }
}
