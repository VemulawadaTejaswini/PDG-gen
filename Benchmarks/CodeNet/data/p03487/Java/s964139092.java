import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int num = 0;
    for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
      int key = entry.getKey();
      int count = entry.getValue();
      if (count < key) {
        num += count;
        continue;
      }
      num += Math.min(count, count - key);
    }
    System.out.println(num);
  }
}
