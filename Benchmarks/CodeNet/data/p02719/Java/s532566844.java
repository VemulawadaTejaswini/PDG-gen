import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();
    String[] params = in.split(" ");
    int n = Integer.parseInt(params[0]);
    int k = Integer.parseInt(params[1]);
    if (n < k) {System.out.println(n);}
    else {
      System.out.println(n / k);
    }
  }
}
