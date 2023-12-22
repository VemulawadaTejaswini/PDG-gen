import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();
    String X = "";
    if(D/S <= T) {
      X="Yes";
    } else if(D/S > T) {
      X="No";
    }
    System.out.println(X);
  }
}