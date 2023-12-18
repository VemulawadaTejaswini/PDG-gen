import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int age = Integer.parseInt(reader.readLine());
      switch (age) {
        case 7:
        case 5:
        case 3:
          System.out.println("YES");
          break;
        default:
          System.out.println("NO");
          break;
      }
    }
  }

}
