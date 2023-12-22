import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int[] ans = new int[37];

      for (int a = 0; a < 10; a++) {
        for (int b = 0; b < 10; b++) {
          for (int c = 0; c < 10; c++) {
            for (int d = 0; d < 10; d++) {
                ans[a + b + c + d]++;
            }
          }
        }
      }

      int n;
      String line;
      while(true) {
        line = br.readLine();
        if((line == null) || line.isEmpty()) break;

        n = Integer.parseInt(line);
        System.out.println(n<37 ? ans[n] : 0);
      }
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
