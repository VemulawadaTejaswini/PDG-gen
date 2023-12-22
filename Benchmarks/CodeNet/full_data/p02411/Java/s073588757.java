import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

  String[] ans = new String[50];
  int x = 0;
    while(true) {
      int m, f, r;
      m = stdInt.nextInt();
      f = stdInt.nextInt();
      r = stdInt.nextInt();
      if (m == -1 && f == -1 && r == -1) break;
      if (m == -1 || f == -1) {
        ans[x] = "F";
      } else if (m + f >= 80) {
        ans[x] = "A";
      } else if (m + f >= 65) {
        ans[x] = "B";
      } else if (m + f >= 50) {
        ans[x] = "C";
      } else if (m + f >= 30 && r >= 50) {
        ans[x] = "C";
      } else if (m + f >= 30 && r < 50) {
        ans[x] = "D";
      } else {
        ans[x] = "F";
      }
     x++;
    }

    for (int i = 0; i < x; i++) {
      System.out.println(ans[i]);
    }

  }
}
