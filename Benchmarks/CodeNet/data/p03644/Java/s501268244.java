import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int r = 1;
    for (int i = 2; i <= n; i++) {
      int current = 0;
      if (i % 2 == 1) {
        continue;
      }
      int j = i;
      while (true) {
        j = j / 2;
        ++current;
        if (j == 0 || j % 2 == 1) {
          break;
        }
      }
      if (current > count) {
        count = current;
        r = i;
      }
    }
    System.out.println(r);
    sc.close();
  }
}
