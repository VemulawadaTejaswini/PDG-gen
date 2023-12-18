import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int costOp1 = A * X + B * Y;
    int Same = Math.min(X, Y);
    int costOp2 = Same * 2 * C + A * (X - Same) + B * (Y - Same);
    int Max = Math.max(X, Y);
    int costOp3 = Max * 2 * C;
    int Best = Math.min(costOp1, costOp2);
    Best = Math.min(Best, costOp3);
    System.out.println(Best);
  }
}
