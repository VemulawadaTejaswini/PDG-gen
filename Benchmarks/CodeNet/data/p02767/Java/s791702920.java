import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] K = new int[N];
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
      for(int j=0; i<N; j++){
        tmp += (K[j]-i)*(K[j]-i);
      }
      ans = Math.min(ans, tmp);
    }
    System.out.print(ans);
  }
}
    
       
    
