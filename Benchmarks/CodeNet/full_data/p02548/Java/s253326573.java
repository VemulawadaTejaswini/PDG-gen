import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i < n; i++) {
      int a = i;
      for (int j = 1; i * j < n; j++) {
        int b = j;
        if (n - a * b > 0) {
          int c = n - a * b;
          count++;
        }
      }
    }
    System.out.println(count);
  }
}