import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int N = Integer.parseInt(scanner.next());
    final int M = Integer.parseInt(scanner.next());
    final int C = Integer.parseInt(scanner.next());

    final List<List<Integer>> a = new ArrayList<>();
    final List<Integer> b = new ArrayList<>();

    for (int i = 0; i < M; i++) {
      b.add(Integer.parseInt(scanner.next()));
    }
    for (int i = 0; i < N; i++) {
      final List<Integer> tmp = new ArrayList<>();
      for (int j = 0; j < M; j++) {
        tmp.add(Integer.parseInt(scanner.next()));
      }
      a.add(tmp);
    }

    final int size = a.stream()
        .filter(e -> {
          int result = 0;
          for (int i = 0; i < M; i++) {
            result += e.get(i) * b.get(i);
          }
          result += C;
          return result > 0;
        })
        .collect(Collectors.toList())
        .size();
    System.out.println(size);
  }
}
