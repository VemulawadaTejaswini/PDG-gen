import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<String> list = new ArrayList<String>();
    String ans = "Yes";
    for (int i = 0; i < N; i++) {
      list.add(sc.next());
    }
    List<String> list2 = list.stream().distinct().collect(Collectors.toList());
    if (list.size() != N - 1) {
      ans = "No";
    } else {
      for (int i = 1; i < N; i++) {
        String formar = list.get(i - 1);
        String latter = list.get(i);
        if (formar.charAt(formar.length() - 1) != latter.charAt(0)) {
          ans = "No";
          break;
        }
        ;
      }
    }
    System.out.println(ans);
  }

  public static void primeFactorization(int num) {
    int Z = 0;
    for (int i = 2; num > i; i++) {
      while (num % i == 0) {
        System.out.println(i);
        num /= i;
        Z = num;
      }
    }
    System.out.println(Z);
  }

  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    else if (num == 2)
      return true;
    else if (num % 2 == 0)
      return false;

    for (int i = 3; i < num; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
