import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); 
    int[] A = new int[N+1];  
    int[] B = new int[N];  
    for (int i=0; i < N+1 ;i++) {
      A[i] = Integer.parseInt(sc.next()); 
    }
    for (int i=0; i < N ;i++) {
      B[i] = Integer.parseInt(sc.next()); 
      }
    int count = 0;
    for(int i=N-1;i>=0;i--){
      if(B[i]>=A[i+1]){
        int tmp = B[i] - A[i+1];
        if(tmp>=A[i]){
          count += A[i] + A[i+1];
          A[i] = 0;
        }else{
          count += B[i];
          A[i] -= tmp; 
        }
      }else{
        A[i+1] -= B[i]; 
        count += B[i];

      }
    }
    System.out.println(count);
  }
  
}

