import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     H    = scan.nextInt();
      int     W    = scan.nextInt();
      int     D    = scan.nextInt();

      int u = 0;


      int[] A = new int[90000 + 1];
      int[] B = new int[90000 + 1];
      A[0] = B[0] = 0;
      for(int i = 1; i <= H; i++){
          for(int j = 1; j <= W; j++){
              u    = scan.nextInt();
              A[u] = i;
              B[u] = j;
              }
          }
      int   Q = scan.nextInt();
      int[] L = new int[Q];
      int[] R = new int[Q];
      for(int i = 0; i < Q; i++){
          L[i] = scan.nextInt();
          R[i] = scan.nextInt();
          }
      int[] power = new int[90000 + 1];
      for(int i = 1 + D; i <= H * W; i++){
          power[i] = power[i - D] + Math.abs(A[i] - A[i - D]) + Math.abs(B[i] - B[i - D]);
          }
      power[0] = 0;
      for(int i = 0; i < Q; i++){
          System.out.println(power[R[i]] - power[L[i]]);
          }
   }
}
