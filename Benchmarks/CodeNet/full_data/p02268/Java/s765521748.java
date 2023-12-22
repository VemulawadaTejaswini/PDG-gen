import java.util.Scanner;
public class Main {

  public static boolean find(int[] ary, int n) {
    return find(ary, n, 0, ary.length-1);
  }

  public static boolean find(int[] ary, int n, int low, int high) {
    if (high < low)
      return false;
    int mid = high - low / 2;
    if (ary[mid] == n)
      return true;
    if (n < ary[mid])
      return find(ary, n, low, mid-1);
    else
      return find(ary, n, mid+1, high);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] S = new int[n];
    for (int i = 0; i < n; i++) {
      S[i] = s.nextInt();
    }
    int q = s.nextInt();
    int[] T = new int[q];
    for (int i = 0; i < q; i++) {
      T[i] = s.nextInt();
    }
    s.close();
    int count = 0;
    for (int t : T) {
      if (find(S, t))
        count++;
    }
    System.out.println(count);
  }
}

