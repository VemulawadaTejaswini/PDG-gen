import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    int ans = 0; 
    int c = 1;
    for (int i = 0; i < N; i++) {
      if (a[i] == c) {
        c++;
      } else {
        ans++;
      }
    }
    if (c == 1) ans = -1;
    System.out.println(ans);
  }
}