import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i++) {
	  x[i] = sc.nextInt();
	  y[i] = sc.nextInt();
    }
    sc.close();
    
    double sum = 0;
    int[] idx = new int[N];
    long cnt = 0;
    while (next_permutation(idx)) {
      for (int i = 0; i < N - 1; i++) {
        int j = idx[i] - 1;
        int k = idx[i + 1] - 1;
        sum += Math.sqrt(
          (x[j] - x[k]) * (x[j] - x[k]) +
          (y[j] - y[k]) * (y[j] - y[k])
        );
      }
      cnt++;
    }
    
    System.out.println(sum / cnt);
  }
  
  private static boolean next_permutation(int[] ints) {
    if (ints[0] == 0) {
      for (int i = 0; i < ints.length; i++) ints[i] = i + 1;
      return true;
    }

    int l = -1;
    for (int i = ints.length - 2; l == -1 && l < i; i--)
      if (ints[i] < ints[i + 1]) l = i;
    if (l == -1) return false;

    int r = l;
    for (int i = ints.length - 1; r == l && l < i; i--)
      if (ints[l] < ints[i]) r = i;

    int t = ints[r];
    ints[r] = ints[l];
    ints[l] = t;
    l++;
    r = ints.length - 1;
    while (l < r) {
      t = ints[r];
      ints[r] = ints[l];
      ints[l] = t;
      l++;
      r--;
    }
    return true;
  }  
}