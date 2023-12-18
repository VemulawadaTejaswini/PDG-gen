import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    String[] T = sc.nextLine().split(" ");
    
    int[] A = new int[N+1];
    int[] B = new int[N];
    for(int i = 0; i < N; i++){
      A[i] = Integer.parseInt(S[i]);
      B[i] = Integer.parseInt(T[i]);
    }
    A[N] = Integer.parseInt(S[N]);
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      if(A[i] <= B[i]){
        ans += A[i];
        B[i] -= A[i];
        if(A[i+1] <= B[i]){
          ans += A[i+1];
          A[i+1] = 0;
        }else{
          ans += B[i];
          A[i+1] -= B[i];
        }
      }else{
        ans += B[i];
      }
    }
    System.out.println(ans);
  }
}