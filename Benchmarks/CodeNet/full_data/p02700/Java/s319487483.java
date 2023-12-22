import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();
    scan.close();

    System.out.println((C-1)/B<=(A-1)/D ? "Yes" : "No");
  }
}