
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import com.sun.javafx.image.IntPixelGetter;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    Map<String, Integer> s = new TreeMap<>();

    for (int i = 0; i < n; i++) {
      String tmp = scanner.next();
      if(!s.containsKey(tmp)) {
        s.put(tmp,1);
      } else {
        s.put(tmp, s.get(tmp) + 1);
      }
    }
    int max = s.values().stream().mapToInt(e -> e).max().getAsInt();
    s.entrySet().stream().filter(e->e.getValue() == max).forEach(e -> System.out.println(e.getKey()));
  }
}
