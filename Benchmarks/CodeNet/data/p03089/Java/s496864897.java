import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    List<Integer> list = new ArrayList<>();
    for (long i = 0; i < N; i++) {
      list.add(scan.nextInt());
    }

    List<Integer> result = new LinkedList<>();
    for (int j = 1; j <= N; j++) {
      Integer max = list.stream()
          .max((a, b) -> a.compareTo(b)).get();
      for (int i = 0; i < max; i--) {

        if (max > list.size()) {
          System.out.println(-1);
          return;
        }
        if (max.equals(list.get(max - 1))) {
          result.add(max);
          list.remove(max);
          break;
        }
        max--;
      }
    }

    Collections.reverse(result);
    result.stream().forEach(System.out::println);
  }
}
