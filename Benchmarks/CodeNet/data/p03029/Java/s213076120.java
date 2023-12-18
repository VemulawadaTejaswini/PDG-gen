import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int apple = Integer.parseInt(str[0]);
    int piece = Integer.parseInt(str[1]);
    System.out.println((apple * 3 + piece) / 2);
  }
}