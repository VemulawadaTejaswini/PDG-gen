import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[][] x = new int[N][N]; 
    int[][] y = new int[N][N]; 
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
      for(int j=0;j<A[i];j++){
        x[i][j] = sc.nextInt();
        y[i][j] = sc.nextInt();
      }
    }
    int ans = 0;
    for(int i=0;i<Math.pow(2,N);i++){
      int count = 0;
      boolean check = true;
      for(int j=0;j<N;j++){
        if((1&i>>j)==1){
          count++;
          for(int k=0;k<A[j];k++){
            if(y[j][k]==1){
              if(!((1&i>>(x[j][k]-1))==1)){
                check = false;
              }
            }else{
              if(!((1&i>>(x[j][k]-1))==0)){
                check = false;
              }
            }
          }
        }
      }
      if(check){
        ans = Math.max(ans,count);
      }
    }  
      System.out.println(ans);
  }
}