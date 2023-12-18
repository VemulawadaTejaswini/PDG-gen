import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextInt();
    long B = sc.nextInt();
    long C = sc.nextInt();
    long X = sc.nextInt();
    long Y = sc.nextInt();

    long ans;
    if (C*2 < A+B) {
      if (X > Y) {
        ans = (X-Y)*Math.min(A,C*2) + 2*Y*C;
      } else {
        ans = (Y-X)*Math.min(B,C*2) + 2*X*C;
      }
    } else {
      ans = A*X + B*Y;
    }
    System.out.println(ans);
  }
}
