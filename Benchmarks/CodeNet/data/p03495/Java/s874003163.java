import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n + 1];
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      a[num]++;
    }
    Arrays.sort(a);
    int count = 0;
    for (int i = 0; i < k; i++) {
      count += a[a.length - i - 1];
    }
    System.out.println(n - count);
  }
}