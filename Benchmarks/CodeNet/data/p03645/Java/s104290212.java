import java.util.*;
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
  
    for(int i = 0 ; i < M; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    
    if(M < 2){
      System.out.println("IMPOSSIBLE");
      return;
    }
   
    for(int i = 0 ; i < M; i++){
      if(a[i] == 1){
        int tmp = b[i];
        for(int j = 0 ; j < M; j++){
          if(a[j] == tmp && b[j] == N){
            System.out.println("POSSIBLE");
            return;
          } 
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}