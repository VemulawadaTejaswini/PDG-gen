import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] l = new int[N];
    int ans = 0;
    for (int i = 0; i < K; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
          int a = sc.nextInt();
          l[a-1]++;
      }
    }
    
    for (int k = 0; k < N; k++) {
      if (l[k] == 0) {
        ans += 1;
      }
    }
    System.out.println(ans);
  }
}  