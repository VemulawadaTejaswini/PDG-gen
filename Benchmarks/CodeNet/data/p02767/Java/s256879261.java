import java.util.Scanner;
import java.util.Math;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] K = new int[];
    int L = 100;
    int R = 0;
    int ans = Integer.MAX_VALUE;
    for(int i=0; i<N; i++){
      K[i] = sc.nextInt();
      L = Math.min(L, K[i]);
      R = Math.max(R, K[i]);
    }
    for(int i=L; i<=R; i++){
      int tmp = 0;
      for(int i=0; i<N; i++){
        tmp += (K[i]-i)*(K[i]-i);
      }
      ans = Math.min(ans, tmp);
    }
    System.out.print(ans);
  }
}
    
       
    