import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    IntStream.range(0, N).forEachOrdered(n -> list.add(sc.nextInt()));
    list.sort(Comparator.naturalOrder());

    double value = list.get(0);
    for (int i = 0; i < N - 1; i++) {
      value = (value + list.get(i + 1)) / 2.0;
    }

    System.out.println(value);
  }
}