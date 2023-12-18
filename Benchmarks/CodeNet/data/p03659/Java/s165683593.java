import java.util.*;
class Main {
  static int N;
  static int[] a;

  static int saiki(int i, int diff, boolean ronly) {
    if (i >= N) {
      if (ronly)
        return -1;
      else
        return Math.abs(diff);
    }
    int l = saiki(i+1, diff - a[i], false);
    int r = saiki(i+1, diff + a[i], ronly);
    if (r < 0)
      return l;
    else
      return Math.min(l,r);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    System.out.println(saiki(1, a[0], true));
  }
}