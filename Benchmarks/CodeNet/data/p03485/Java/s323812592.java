import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    double a = Double.parseDouble(str[0]);
    double b = Double.parseDouble(str[1]);
    System.out.println((int)Math.ceil((a+b)/2));
  }
}
       