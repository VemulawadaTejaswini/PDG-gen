import java.util.*;
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ans = 0;
      int K = sc.nextInt();
      int[] A = new int[1000001];
      A[0]=7%K;
      for(int i=0; i<K; i++) {
        A[i]=A[i-1]*10+7;
        if(A[i]%K == 0) {
          ans = i;
          break;
        } else {
          continue;
        }
      }
      
     System.out.println(ans);
    }
  }