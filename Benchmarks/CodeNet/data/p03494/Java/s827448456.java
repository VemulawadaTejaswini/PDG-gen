import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      int num = s.nextInt();
      int cnt = count(num);
      if (cnt < min) min = cnt;
    }
    System.out.println(min);
  }

  private static int count(int num) {
    int cnt = 0;
    while (num > 0 && num % 2 == 0) {
      num /= 2;
      cnt++;
    }
    return cnt;
  }
}
