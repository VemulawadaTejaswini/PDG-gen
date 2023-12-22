import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       new Main().main();
   }

//   void main() {
//       Scanner sc = new Scanner(System.in);
//       while(true) {
//           int n = sc.nextInt();
//           if(n==0) break;
//           char[][] c = new char[n][n];
//           for(int i=0;i<n;i++) {
//               String s = sc.next();
//               c[i] = s.toCharArray();
//           }
//           for(int i=0;i<n;i++) {
//               for(int j=0;j<n;j++) {
//                   System.out.print(c[i][j] + " ");
//               }
//               System.out.println();
//           }
//       }
//   }

   
   void main() {
	   Scanner sc = new Scanner(System.in);
	   int N = sc.nextInt();
	   int W = sc.nextInt();
	   int[] v = new int[N+1];
	   int[] w = new int[N+1];
	   for(int i=1;i<=N;i++) {
		   v[i] = sc.nextInt();
		   w[i] = sc.nextInt();
	   } 
	   
	   int[][] dp = new int[N+1][W+1];
	   for(int i=1;i<=N;i++) {
		   for(int j=1;j<=W;j++) {
			   if(w[i]<=j) {
				   dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
			   }else {
				   dp[i][j] = dp[i-1][j];
			   }
		   }
	   }
	   System.out.println(dp[N][W]);
   }
}
