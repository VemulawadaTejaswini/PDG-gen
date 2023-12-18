import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int k = K;

    System.out.println(String.format("N %d  K %d ", N, K));
    Set<Integer> s = new HashSet<>();

    while (K-- > 0) {
      int i = sc.nextInt();
      Set<Integer> ns = new HashSet<>();
      while (i-- > 0) {
        ns.add(sc.nextInt());
      }

      ns.forEach(System.out::println);
      s.addAll(ns);
    }

    System.out.println(String.format("S = %s", s.toString()));
    Set<Integer> x = IntStream.range(1, k + 1).boxed().collect(Collectors.toSet());
    System.out.println(String.format("X = %s", x.toString()));

    x.removeAll(s);
    System.out.println(x.size());
  }
}