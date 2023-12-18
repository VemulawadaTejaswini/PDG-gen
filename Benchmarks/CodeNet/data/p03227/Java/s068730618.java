import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String str = br.readLine();
      if (str.length() == 2) {
        System.out.print(str);
      } else if (str.length() == 3) {
        System.out.print(new StringBuilder(str).reverse());
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
