import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int left = Integer.parseInt(str.substring(0, 2));
    int right = Integer.parseInt(str.substring(2, 4));
    if (1 <= left && left <= 12) {
      if (1 <= right && right <= 12) {
        System.out.println("AMBIGUOUS");
      } else {
        System.out.println("MMYY");
      }
    } else {
      if (1 <= right && right <= 12) {
        System.out.println("YYMM");
      } else {
        System.out.println("NA");
      }
    }
  }
}