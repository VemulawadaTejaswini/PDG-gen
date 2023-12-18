import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int answer = accept(reader.readLine(), reader.readLine());
      System.out.println(answer);
    }
  }

  static int accept(String nl, String hsl) {
    int n = Integer.parseInt(nl);
    int[] h = new int[n];

    String[] hValues = hsl.split(" ");
    Arrays.setAll(h, i -> Integer.parseInt(hValues[i]));
    return eval(h);
  }

  static int eval(int... h) {
    int c = 0;
    int max = 0;
    for (int n : h) {
      if (max <= n) {
        max = n;
        ++c;
      }
    }
    return c;
  }

}
