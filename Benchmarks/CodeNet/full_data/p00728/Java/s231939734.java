import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int sum = 0;
      int a[] = new int[n];
      if (n == 0) return;
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        sum += a[i];
      }
      Arrays.sort(a);
      sum = sum - (a[0] + a[n-1]);

      System.out.println(sum / (n-2));
    }
  }
}

