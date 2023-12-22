import java.util.Scanner;
public class Main {

  public static boolean find(int[] ary, int n) {
    int low = 0;
    int high = ary.length-1;
    while (low <= high) {
      int mid = high - low / 2;
      if (ary[mid] == n)
        return true;
      if (n < ary[mid])
        high = mid - 1;
      else if (n > ary[mid])
        low = mid + 1;
    }
    return false;
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

