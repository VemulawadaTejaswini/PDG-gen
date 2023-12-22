import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      int[] a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
      int mask = Arrays.stream(a).reduce(0, (acc,v) -> acc ^ v);
      int[] b = Arrays.stream(a).map(v -> v ^ mask).toArray();
      String[] c = Stream.of(b).map(i -> String.valueOf(i)).toArray(String[]::new);
      System.out.println(String.join(" ", c));
    } finally {
      sc.close();
    }
  }
}
