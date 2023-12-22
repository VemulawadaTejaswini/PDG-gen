import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] numbers = new long[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextLong();
    }

    long ans = 0;
    for (int i = 0; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        // System.out.println(numbers[i] + ", " + numbers[j]);
        ans += (numbers[i] * numbers[j]) % 1000000007;
      }
      ans %= 1000000007;
    }
    System.out.println(ans);
  }
}
