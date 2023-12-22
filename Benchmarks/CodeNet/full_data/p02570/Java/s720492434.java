import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();
    String X = "";
    if(D/S <= T && 1<=D && D<=1000 && 1<=T && T<=1000 && 1<=S && S<=1000) {
      X="Yes";
    } else {
      X="No";
    }
    System.out.println(X);
  }
}