import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 42;

    for (int tag = 1; tag <= n; tag++) {
      int cnt = 0;
      for (int i = 1; i <= max; i++) {
        for (int j = i; j <= max; j++) {
          for (int k = j; k <= max; k++) {
            long tmp = (long) Math.pow(i + j + k, 2) - (i * j) - (j * k) - (k * i);
            if (tmp == tag) {
              if ((i == j) && (j == k)) {
                cnt++;
              } else {
                cnt += 3;
              }
            }
          }
        }
      }
      System.out.println(cnt);
    }

  }
}