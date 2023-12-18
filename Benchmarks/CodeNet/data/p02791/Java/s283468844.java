import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      // 順列
	  int N = sc.nextInt();
      // Pnの値
      int[] P = new int[N];
      for(int i=0;i<N;i++){
        P[i] = sc.nextInt();
      }
      //カウント
      int count = 0;
      //条件を満たすi
      for(int i=1;i<=N;i++){
        int j=1;
         for(j=1;j<=i;j++){
           if(P[i-1]<=P[j-1]){
             break;
           }
         }
        if(j==i){
          count++;
        }
      }
      System.out.println(count);
    }
}