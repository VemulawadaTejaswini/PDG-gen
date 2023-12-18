import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int A, B, C, K;
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    K = sc.nextInt();
    //System.out.println(A+B+C+K);
    if (K <= A + B) {
      System.out.println(A);
    } else {
      System.out.println(A-(K-A-B));
    }
  }
}