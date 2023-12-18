import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    while (true) {
      int evenCount = 0;
      for (int i = 0; i < N; i++) {
        if (a[i] % 2 == 0 && evenCount == 0) {
          a[i] = a[i] / 2;
          evenCount++;
          ans++;
          continue;
        }
        a[i] = a[i] * 3;
      }
      if (evenCount == 0) {
        break;
      }
    }
    System.out.println(ans);

  }
}