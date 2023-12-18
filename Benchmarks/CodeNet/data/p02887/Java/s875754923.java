import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int sum = 0;
    for (int i = 0; i < n-1; i++) {
      String substring = s.substring(i, i + 1);
      String substring2 = s.substring(i + 1, i + 2);
      if (!substring.equals(substring2)) {
        sum++;
        if (i == n-2) {
          sum++;
        }
      }
    }
    System.out.println(sum == 0 ? 1 : sum);
  }
}