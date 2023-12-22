import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      String line = buf.readLine();
      double x1 = Integer.parseInt(line.split(" ")[0]);
      double y1 = Integer.parseInt(line.split(" ")[1]);
      double x2 = Integer.parseInt(line.split(" ")[2]);
      double y2 = Integer.parseInt(line.split(" ")[3]);
      double delta_x = x2-x1;
      double delta_y = y2-y1;
      double answer = Math.sqrt(Math.pow(delta_x, 2)+Math.pow(delta_y, 2));

      System.out.println(answer);
    }
  }