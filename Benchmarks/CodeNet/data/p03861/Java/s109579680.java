import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    long a = 0;
    long b = 0;
    long x = 0;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] tmp = br.readLine().split("\\s");
      a = Long.parseLong(tmp[0]);
      b = Long.parseLong(tmp[1]);
      x = Long.parseLong(tmp[2]);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    long sum = (b / x) + 1;
    long diff = (a == 0 || a == b)? 0 : ((a-1) / x) + 1;

    System.out.print(sum - diff);

  }
}
