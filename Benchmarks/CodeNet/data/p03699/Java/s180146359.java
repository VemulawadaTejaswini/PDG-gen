import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] s = new int[N];
    int total =0;
    for (int i =0; i<N; i++) {
      s[i] = sc.nextInt();
      total += s[i];
    }
    Arrays.sort(s);
    int a =0;
    while (total % 10 == 0) {
      if (s[a] % 10 != 0) {
        total -= s[a];
      }
      a++;
      if (a == N) {
        total = 0;
        break;
      }
    }
    System.out.println(total);
  }
}