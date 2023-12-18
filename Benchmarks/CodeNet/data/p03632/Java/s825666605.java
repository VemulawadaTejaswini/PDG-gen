import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      for (int j = c; j <= d; j++) {
        if (i == j) {
          count++;
        }
      }
    }
    if (count == 0) {
      System.out.println(count);
    } else {
      System.out.println(count - 1);
    }
  }
}