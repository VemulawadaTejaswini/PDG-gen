import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    int A = scan.nextInt();
    int B = scan.nextInt();
    String U = scan.next();
    scan.close();

    System.out.print(S.equals(U) ? A-1 : A);
    System.out.print(" ");
    System.out.println(S.equals(U) ? B : B-1);
  }
}