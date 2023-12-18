import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] irons = new int[len];
    int sum = 0;
    for (int i = 0; i < irons.length; i++) {
      irons[i] = sc.nextInt();
      sum += irons[i];
    }

    int half = sum/2;
    int carry = sum % 2 == 0 ? 0 : 1;
    int cur = 0;
    for (int i = 0; i < irons.length; i++) {
      if (cur + irons[i] < half) cur += irons[i];
      else {
        int out = Math.min(sum - (2*cur), sum - (2*(sum-cur-irons[i])));
        System.out.println(out);
        return;
      }
    }
  }
}
