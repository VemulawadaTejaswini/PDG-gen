import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready()) {
      final int num = Integer.valueOf(input.readLine());
      int ans = 0;
      for (int i = num; i >= 0; i--) {
        for (int j = num - i; j >= 0; j--) {
          for (int k = num - (i + j); k >= 0; k--) {
            for (int l = num - (i + j + k); l >= 0; l--) {
              if (i + j + k + l == num) {
                ans += 1;
              }
            }
          }
        }
      }
      System.out.println(ans);
    }
  }
}