import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int v[] = new int[n];
    int c[] = new int[n];
    int s[] = new int[n];
    int ans = 0;

    for (int i=0; i<n; i++) {
      v[i] = Integer.parseInt(sc.next());
    }
    for (int i=0; i<n; i++) {
      c[i] = Integer.parseInt(sc.next());
    }
    for (int i=0; i<n; i++) {
      s[i] = v[i] - c[i];
      if (s[i] > 0) {
        ans += s[i];
      }
    }
    
    System.out.println(ans);
  }
}
