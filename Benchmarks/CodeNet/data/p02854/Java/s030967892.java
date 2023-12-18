import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    long[] irons = new long[len];
    int sum = 0;
    for (int i = 0; i < irons.length; i++) {
      irons[i] = sc.nextLong();
      sum += irons[i];
    }

    long half = sum/2;
    long cur = 0;
    for (int i = 0; i < irons.length; i++) {
      if (cur + irons[i] <= half) cur += irons[i];
      else {
        long out = Math.min(sum - (2*cur), sum - (2*(sum-cur-irons[i])));
        System.out.println(out);
        return;
      }
    }
  }
}
