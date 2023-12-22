
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    int angle = 0;
    double x = 0;
    double y = 0;

    while (true) {
      String[] strs = reader.readLine().split(",");
      int forwardLength = Integer.parseInt(strs[0]);
      int rotateAngle = Integer.parseInt(strs[1]);
      if (forwardLength == 0 && rotateAngle == 0)
        break;
      x += Math.sin(Math.toRadians(angle)) * forwardLength;
      System.out.println(Math.sin(Math.toRadians(angle)) * forwardLength);
      y += Math.cos(Math.toRadians(angle)) * forwardLength;
      angle += rotateAngle;
    }

    System.out.println((int) x);
    System.out.println((int) y);

  }

}