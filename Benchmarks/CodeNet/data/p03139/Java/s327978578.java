import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int max = Math.min(A, B);
    int min = 0;
    if (A + B - N > 0) min = A + B - N;
    System.out.println(max + " " + min);
  }
}
