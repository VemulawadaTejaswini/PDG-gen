import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    char c = 'a';
    for (int i = 0; i < s.length(); i++) {
      if (!s.contains(String.valueOf(c))) {
        System.out.println(c);
        System.exit(0);
      }
      c++;
    }
    System.out.println("None");
  }

}
