import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] L = new int[n];
    for(int i = 0; i < n; i++) {
      L[i] = sc.nextInt();
    }
    Arrays.sort(L);
    int ans = 0;
    for(int i = 2; i < n; i++) {
      for(int j = 1; j < i; j++) {
        int d = L[i] - L[j];
        int left = 0;
        int right = j;
        int t = j;
        while(left < right) {
          int med = (left + right) / 2;
          if(L[med] > d) {
            t = med;
            right = med;
          } else {
            left = med + 1;
          }
        }
        ans += (j - t);
      }
    }
    System.out.println(ans);
  }
}