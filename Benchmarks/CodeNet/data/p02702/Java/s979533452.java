import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    int sum = 0;
    for (int i = 0; i < n.length() - 4; i++) {
      for (int j = i + 4; j < n.length() + 1; j++) {
        long a = Long.parseLong(n.substring(i, j));
        if (a % 2019 == 0) {
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}
