import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    String s = br.readLine();
    String[] sa = s.split(" ");
    int[] na = Stream.of(sa).mapToInt(Integer::parseInt).toArray();
    int total = 0;
    for (int i = 1; i <= na[0]; i++) {
      int sum = sumDigits(i);
      if (sum >= na[1] && sum <= na[2]) {
        total += i;
      }
    }

    out.println(total);
    out.close();
  }

  public static int sumDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}