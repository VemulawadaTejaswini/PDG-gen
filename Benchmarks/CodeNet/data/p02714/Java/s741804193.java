
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import com.sun.xml.internal.ws.message.ByteArrayAttachment;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long sum = 0;
    String[] s = scanner.next()
        .split("");

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int dist = -1;
        final String c1 = s[i];
        final String c2 = s[j];
        if (!s[i].equals(s[j])) {
          dist = j - i;
          sum += Stream.of(s)
              .skip(j)
              .filter(e -> !e.equals(c1) && !e.equals(c2))
              .count();
          if(j + dist < n && !s[j+dist].equals(c1) && !s[j+dist].equals(c2)) {
            sum--;
          }
        }
      }
    }
    System.out.println(sum);
  }
}
