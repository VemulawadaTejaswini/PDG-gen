
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    int count = Integer.parseInt(reader.readLine());
    for (int i = 0; i < count; i++) {
      BigInteger l = new BigInteger(reader.readLine());
      BigInteger r = new BigInteger(reader.readLine());
      if (l.toString().length() > 80 || r.toString().length() > 80) {
        System.out.println("overflow");
        continue;
    }
      BigInteger result = l.add(r);
      System.out.println(result.toString());
    }
  }

}