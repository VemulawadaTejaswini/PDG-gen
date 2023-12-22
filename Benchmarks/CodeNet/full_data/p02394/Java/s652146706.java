import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] listStr = reader.readLine().split(" ");
    int w = Integer.parseInt(listStr[0]);
    int h = Integer.parseInt(listStr[1]);
    int x = Integer.parseInt(listStr[2]);
    int y = Integer.parseInt(listStr[3]);
    int r = Integer.parseInt(listStr[4]);

    if (x + r <= w && y + r <= h && x - r >= 0 && y - r >= 0)
      System.out.println("Yes");
    else
      System.out.println("No");

  }

}