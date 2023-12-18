import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt(); scan.nextLine();
    String S = scan.nextLine();
    int K = scan.nextInt();
    String[] AR = S.split("");
    String C = AR[K];
    for (int i = 0; i < AR.length; i++) {
      if (AR[i] == C) {
        System.out.print(AR[i]);
      } else {
        System.out.print("*");
      }
    }
  }
}