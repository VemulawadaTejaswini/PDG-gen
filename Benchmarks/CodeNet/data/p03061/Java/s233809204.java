import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  static Map<String, Integer> map = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.nextLine());
    List<Integer> b = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());

    Integer max = 1;
    for (int i = 0; i < n; i++) {
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if (j != i) {
          list.add(b.get(j));
        }
      }

      max = Math.max(max, gcd(list));
    }
    System.out.println(max);
  }

  public static int gcd(List<Integer> list) {
    int value = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      String key = "" + value + "," + list.get(i);
      if (map.containsKey(key)) {
        value = map.get(key);
      } else {
        value = gcd(value, list.get(i));
        map.put(key, value);
      }
    }
    return value;
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }

    String key = "" + a + "," + b;
    if (map.containsKey(key)) {
      return map.get(key);
    } else {
      int value =  gcd(b, a % b);
      map.put(key, value);
      return value;
    }
  }
}
