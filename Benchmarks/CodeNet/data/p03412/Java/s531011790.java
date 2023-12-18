import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for (int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }

    for (int i=0; i<n; i++){
      b[i] = sc.nextInt();
    }

    int[] binary = new int[30];
    int sum = 0;

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        sum = a[i] + b[j];

        for (int k=29; k >= 0; k--) {
          if (sum - Math.pow(2, k) >= 0) {
            sum -= Math.pow(2, k);
            binary[k]++;
          }
        }
      }
    }

    int ans = 0;

    for (int i=0; i<30; i++) {
      ans += (binary[i] % 2) * Math.pow(2, i);
    }

    System.out.println(ans);
  }
}
