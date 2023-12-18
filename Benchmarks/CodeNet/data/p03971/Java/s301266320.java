import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    int N, A, B, apass = 0, bpass = 0;
    String S;
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    A = scanner.nextInt();
    B = scanner.nextInt();
    scanner.nextLine();
    S = scanner.nextLine();
    for (int i = 0; i < S.length(); i++) {
        if (S.charAt(i) == 'c' || apass + bpass == A + B) {
            System.out.println("No");
        } else if (S.charAt(i) == 'a') {
            apass++;
            System.out.println("Yes");
        } else if (S.charAt(i) == 'b' && bpass < B) {
            bpass++;
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    scanner.close();
  }
}