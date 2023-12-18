import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] array = new int[n+1][3];
    int[][] DP = new int[n+1][3];
    DP[0][0] = 0;
    DP[0][1] = 0;
    DP[0][2] = 0;
    int total = 0;

    for(int i=1; i<=n; i++){
      array[i][0] = sc.nextInt();
      array[i][1] = sc.nextInt();
      array[i][2] = sc.nextInt();
    }

     for(int i=1; i<=n; i++){
       DP[i][0] = Math.max(DP[i-1][1]+array[i][0],DP[i-1][2]+array[i][0]);
       DP[i][1] = Math.max(DP[i-1][0]+array[i][1],DP[i-1][2]+array[i][1]);
       DP[i][2] = Math.max(DP[i-1][0]+array[i][2],DP[i-1][1]+array[i][2]);
     }

     // for(int i =0; i<=n; i++){
     //   for(int j=0; j<3; j++){
     //     System.out.print(DP[i][j]+" ");
     //   }
     //   System.out.println("******");
     // }

     System.out.println(Math.max(Math.max(DP[n][0],DP[n][1]),DP[n][2]));

  }
}