import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];	// i町の敵の数
    int[] B = new int[N];	// 各勇者の倒せる敵の数
    
    int[] Asum = new int[N];	//i町とi+1町の敵の合計
    for(int i=0; i<N+1; i++){
      A[i] = sc.nextInt();
      if (i != 0){
        Asum[i-1] = A[i] + A[i-1];
      }
    }
    
    int cntEnemy = 0;
    int remX, remY;
    for(int i=1; i<N+1; i++){
      B[i-1] = sc.nextInt();
      // (i-1)街の残りの敵
      remX = A[i-1] - B[i-1];
      if (remX <= 0){
      	cntEnemy += A[i-1];
        remX = -remX;
        remY = A[i] - remX;
        if (remY <= 0){
          cntEnemy += A[i];
          A[i] = 0;
        } else {
          cntEnemy += remX;
          A[i] = remY;
        }
      } else {
      	cntEnemy += B[i-1];
      }
    }
    
    System.out.println(cntEnemy);
		
  }
}