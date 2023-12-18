import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int I = sc.nextInt();
    int O = sc.nextInt();
    int T = sc.nextInt();
    int J = sc.nextInt();
    int L = sc.nextInt();
    int S = sc.nextInt();
    int Z = sc.nextInt();
    long ans = O;
    if (J > 0 && L > 0) {
      ans += I + 2;
      I = 0;
      --J;
      --L;
    }
    ans += I / 2 * 2;
    ans += J / 2 * 2;
    ans += L / 2 * 2;

    System.out.println(ans);
  }

}
