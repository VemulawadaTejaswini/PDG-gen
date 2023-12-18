import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int a[] = new int[N];
    int count[] = new int[1000000001];
    int ans = 0;
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      count[a[i]]++;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] < i) ans += count[i];
      else if (count[i] > i) ans += count[i] - i;
    }
    System.out.println(ans);
  }
}
