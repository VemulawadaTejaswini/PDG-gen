import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int n = 0;
    String[] input = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      n = Integer.parseInt(br.readLine());
      input = br.readLine().split("\\s");
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      boolean b = true;
      for (int j = 0; j < i; j++) {
        if (Integer.parseInt(input[i]) < Integer.parseInt(input[j])) {
          b = false;
          break;
        }
      }
      if (b) {
        sum++;
      }
    }

    System.out.print(sum);
  }
}
