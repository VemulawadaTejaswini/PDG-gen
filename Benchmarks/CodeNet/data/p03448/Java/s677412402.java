import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());
    int ans = 0;

    for (int i = 0; i <= a; i++) {
      for (int j = 0; j <= b; j++) {
        for (int j2 = 0; j2 <= c; j2++) {
          int total = 500*i + 100*j + 50*j2;
          if (total == x) ans++;
        }
      }
    }
    out.println(ans);
    out.close();
  }
}