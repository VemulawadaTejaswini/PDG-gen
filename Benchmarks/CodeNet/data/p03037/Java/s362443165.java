import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();

    int Lmax = scn.nextInt();
    int Rmin = scn.nextInt();
    for (int i = 1; i < M; i++) {
      int L = scn.nextInt();
      if (L > Lmax) {
        Lmax = L;
      }
      int R = scn.nextInt();
      if (R < Rmin) {
        Rmin = R;
      }
    }

    System.out.println(Rmin - Lmax + 1);

  }
}