import java.util.*;
import java.util.stream.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    List<Long> A = Arrays.stream(sc.nextLine().split(" "))
      .map(Long::parseLong)
      .collect(Collectors.toList());
    long ans = A.get(0);
    if (A.contains(0L)) {
      ans = 0;
    } else {
      for (int i = 1; i < N; i++) {
        ans *= A.get(i);
        if (ans > (long)Math.pow(10,18) || ans < 0) {
          ans = -1;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}