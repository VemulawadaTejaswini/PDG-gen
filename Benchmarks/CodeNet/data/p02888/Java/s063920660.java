import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N];
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val);
    
    long ans = 0;
    for(int i = 0; i < N-2; i++){
      for(int j = i+1; j < N-1; j++){
        long A = val[i];
        long B = val[j];
        int ub = N-1;
        int lb = j+1;
        if(ub == lb){
          if(A+B > val[ub]){
            ans++;
          }
        }else{
          while(ub != lb+1){
            int M = (ub+lb)/2;
            if(A+B > val[M]){
              lb = M;
            }else{
              ub = M;
            }
          }
          if(A+B > val[ub]){
            ans += ub-j;
          }else if(A+B > val[lb]){
            ans += lb-j;
          }
        }
      }
    }   
    System.out.println(ans);
  }
}