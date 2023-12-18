import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    int[] o = new int[100001];
    int[] e = new int[100001];
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) e[v[i]]++;
      else o[v[i]]++;
    }
    int o1 = 0, o2 = 0, e1 = 0, e2 = 0, o1i = 0, o2i = 0, e1i = 0, e2i = 0;
    for (int i = 1; i <= 100000; i++) {
      if (o2 < o[i]) {
        o2 = o[i];
        o2i = i;
      }
      if (o1 < o2) {
        int temp = o1;
        o1 = o2;
        o2 = temp;
        temp = o1i;
        o1i = o2i;
        o2i = temp;
      }
      if (e2 < e[i]) {
        e2 = e[i];
        e2i = i;
      }
      if (e1 < e2) {
        int temp = e1;
        e1 = e2;
        e2 = temp;
        temp = e1i;
        e1i = e2i;
        e2i = temp;
      }
    }
    if (o1i != e1i) System.out.println(n - o1 - e1);
    else System.out.println(Math.min(n - o1 - e2, n - o2 - e1));
  }
}