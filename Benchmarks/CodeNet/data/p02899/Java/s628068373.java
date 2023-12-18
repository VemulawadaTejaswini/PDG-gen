import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
    for (int i = 0; i < N; i++) {
      list.put(sc.nextInt(), i + 1);
    }
    // System.out.println(list.get(2));
    Object[] mapkey = list.keySet().toArray();
    Arrays.sort(mapkey);
    StringBuilder ans = new StringBuilder();
    for (Integer key : list.keySet()) {
      ans.append(list.get(key));
      ans.append(" ");

    }
    System.out.println(ans);
  }
}
