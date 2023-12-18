import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    ArrayList<Integer> v = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      v.add(scn.nextInt());
    }

    Collections.sort(v);
    double ans = v.stream().reduce(v.get(0), (average, elem) -> (elem + average) / 2);
    System.out.println(ans);
  }

}
