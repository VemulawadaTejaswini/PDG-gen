import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans = 0;
    int sumAlice = 0;
    int sumBob = 0;

    for (int cnt = 0; cnt < n; cnt++) {
      a[cnt] = sc.nextInt();
    }
    Arrays.sort(a);

    for (int cnt = 0; cnt < n; cnt++) {
      int tmp = a[n - cnt -1];
      if (cnt % 2 == 0) {
        sumAlice += tmp;
      }
      else{
        sumBob += tmp;
      }
    }
    ans = sumAlice - sumBob;
    System.out.println(ans);
    sc.close();
  }
}