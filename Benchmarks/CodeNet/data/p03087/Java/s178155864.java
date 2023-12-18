import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int Q = scan.nextInt();
    scan.nextLine();
    String S = scan.nextLine();

    for (int i = 0; i < Q; i++) {
      int i1 = scan.nextInt();
      int i2 = scan.nextInt();

      int count = 0;
      for (int j = i1 - 1; j < i2; j++) {
        if (S.charAt(j) == 'A') {
          if (j + 1 != i2 && S.charAt(j + 1) == 'C') {
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}
