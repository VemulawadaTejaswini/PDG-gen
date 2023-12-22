
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static double gravity = 9.8;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    while ((in = reader.readLine()) != null) {
      double minVelocity = Double.parseDouble(in);
      double minHeight = Math.pow(minVelocity, 2) / (2 * gravity);
      System.out.println((int) Math.ceil((minHeight + 5) / 5));
    }
  }

}