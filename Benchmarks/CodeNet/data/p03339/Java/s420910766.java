import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char dir[] = new char[N];
    for (int i = 0; i < N; i++) {
      dir[i] = S.charAt(i);
    }

    int ans = N;
    for (int k = 0; k < N; k++) {
      int w = 0;
      int e = 0;
      for (int i = 0; i < k; i++) {
        if (dir[i] == 'W')
          w++;
      }
      for (int j = k + 1; j < N; j++) {
        if (dir[j] == 'E')
          e++;
      }
      ans = Math.min(w + e, ans);
    }
    System.out.println(ans);
  }
}