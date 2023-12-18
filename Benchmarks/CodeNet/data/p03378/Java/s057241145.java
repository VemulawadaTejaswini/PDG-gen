import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int [M];
    int cnt_right = 0;
    int cnt_left = 0;
    for(int i=0; i<M; i++){
      A[i]=sc.nextInt();
      for(int j = X-1; j<N; j++){
        if(A[i]==j+1){
          cnt_right++;
        }
      }
      for(int j = X-1; j<0; j--){
        if(A[i]==j+1){
          cnt_left++;
        }
      }
    }
    System.out.println(Math.min(cnt_right, cnt_left));
  }
}
    
    
    