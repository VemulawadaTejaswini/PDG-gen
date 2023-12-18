import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int ans = 0;
    while (X > 0 || Y >0) {
      if (X >= 1 && Y >= 1) {
        
        int num = Math.min(X, Y);
        if (2*C < A + B) {
          ans += 2*C*num;
        } else {
          ans += (A+B)*num;
        }
        X -= num;
        Y -= num;
      } else if (X >= 1) {
        if (2*C < A) {
          ans += 2*C*X;
        } else {
          ans += A*X;
        }
        X -= X;
      } else if (Y >= 1) {
        if (2*C < B) {
          ans += 2*C*Y;
        } else {
          ans += B*Y;
        }
        Y -= Y;
      }
    }

    System.out.println(ans);
  }
}