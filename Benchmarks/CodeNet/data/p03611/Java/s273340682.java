import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    double avg = list.stream().mapToInt(x -> x).sum() / N - 1;
    for (int i = 0; i < N; i++) {
      if (list.get(i) + 1 == avg || list.get(i) - 1 == avg || list.get(i) == avg) {
        cnt++;
      }
    }
    System.out.println(cnt);
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
