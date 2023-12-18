import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int max = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      max = Math.max(max, a[i]);
      min = Math.min(min, a[i]);
    }
    String ans = "No";
    if(max == min) {
      if((max + 1 == N) || (N >= 2 * max)) ans = "Yes";
    } else {
      int s = 0;
      for(int i = 0; i < N; i++) {
        if(a[i] == min) s++;
      }
      if(N >= s + 2 * (max - s)) ans = "Yes";
    }
    System.out.println(ans);
  }
}