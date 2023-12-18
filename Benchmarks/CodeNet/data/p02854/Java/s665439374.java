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
    for (int i = 0; i < irons.length; i++) {
      if (half > irons[i]) half -= irons[i];
      else if (half <= irons[i]) {
        System.out.println(Math.min(half, irons[i]-half) + carry);
        return;
      }
    }
  }
}
