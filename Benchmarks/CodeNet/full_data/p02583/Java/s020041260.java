import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    if (n < 3) {
      System.out.println("0");
    }
    int sum = 0;
    for (int i = 0; i < n - 2; i++) {
      int a = l[i];
      for (int j = i + 1; j < n - 1; j++) {
        int b = l[j];
        for (int k = j + 1; k < n; k++) {
          int c = l[k];
          if (a == b || a == c || b == c) {
            continue;
          }
          if (a + b > c && b + c > a && a + c > b) {
            sum++;
          }
        }
      }
    }
    System.out.println(sum);
  }
}