import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Map<String, Integer> freq = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String S = scanner.next();
      freq.put(S, freq.getOrDefault(S, 0) + 1);
    }
    int max = freq.values().stream().max(Integer::compareTo).get();
    for (String s : freq.entrySet().stream().filter(e -> e.getValue() == max).map(Map.Entry::getKey).sorted().collect(Collectors.toList())) {
      System.out.println(s);
    }
  }
}
