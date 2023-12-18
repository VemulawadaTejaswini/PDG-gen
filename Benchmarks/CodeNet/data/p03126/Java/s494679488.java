import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int mat[][] = new int[N][M];
    for(int i=0;i<N;i++){
     int tmp = sc.nextInt();
      for(int j=0;j<tmp;j++){
        mat[i][j]=sc.nextInt();
      }
    }
    int answer = 0;
    for(int i=1;i<=M;i++){
      if(isAllLike(mat,i,N,M)){
        answer = answer +1;
      }
    }


    System.out.println(answer);
    
  }
  
  //食べ物Xが全員好きか判定するメソッド
  public static boolean isAllLike(int mat[][],int x,int N , int M){
      boolean isLike = false;
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        if(mat[i][j]==x){
          isLike = true;
        }
      }
      if(!isLike){
        return false;
      }
      isLike = false;
    }
    return true;
  }
  

  
}