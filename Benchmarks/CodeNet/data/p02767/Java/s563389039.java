import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int total = 0;
    int ans = Integer.MAX_VALUE;
    ;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
      min = Math.min(min, list.get(i));
      max = Math.max(max, list.get(i));
    }
    for (int i = min; i <= max; i++) {
      total = 0;
      for (int j = 0; j < N; j++) {
        total += Math.pow(i - list.get(j), 2);
      }
      ans = Math.min(ans, total);
    }
    System.out.println(ans);
  }
}
