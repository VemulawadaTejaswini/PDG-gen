import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] L = new int[N];
    
    for(int i=0; i<N; i++) {
      L[i] = scan.nextInt();
    }
    Arrays.sort(L);
    
    int ans = 0;
    for(int start=0; start<N; start++) {
      for(int end=N-1; start<end; end--) {
        for(int target = end-1; target>start; target--) {
          if(L[start]+L[target] > L[end]) {
            ans++;
          } else {
            break;
          }
        }
      }
    }
    System.out.println(ans);
  }
}