import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    
    int[] A = new int[N+1];
    for(int i = 0; i < N+1; i++){
      A[i] = scanner.nextInt();
    }
    
    int[] B = new int[N];
    for(int i = 0; i < N; i++){
      B[i] = scanner.nextInt();
    }
    
    /*
    * 勇者はn番目から倒していくと効率が良い
    * 次の勇者はn番目を倒すことができないから
    */
    
    int total = 0;
    
    for(int n = 0; n < N; n++){
      int amount = Math.min(A[n], B[n]);
      A[n] -= amount;
      B[n] -= amount;
      total += amount;
      
      amount = Math.min(A[n+1], B[n]);
      A[n+1] -= amount;
      total += amount;
    }
 
    System.out.println(total);
  }
}