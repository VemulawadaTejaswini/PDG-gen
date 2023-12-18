import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalDiff = 0;
    int maxDiff = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt());
      if (list.get(i) % 10 <= 9 && list.get(i) % 10 != 0) {
        totalDiff += 10 - list.get(i) % 10;
        maxDiff = Math.max(maxDiff, 10 - list.get(i) % 10);
      }
    }
    System.out.println(list.stream().mapToInt(x -> x).sum() + totalDiff - maxDiff);
  }
}
