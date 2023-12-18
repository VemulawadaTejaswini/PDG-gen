import java.util.*;
import java.*;
class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     H     = scan.nextInt();
      int     W     = scan.nextInt();
      int     D     = scan.nextInt();
      long    power = 0;
      int     u     = 0;


      int[] A = new int[H * W + 1];
      int[] B = new int[W * H + 1];
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
          if(L[i] != R[i]){
             for(int a = L[i]; a < R[i]; a += D){
                 power += A[a] - A[a + D] >= 0 ? A[a] - A[a + D] : -A[a] + A[a + D];
                 //System.out.println(power);
                 power += B[a] - B[a + D] >= 0 ? B[a] - B[a + D] : -B[a] + B[a + D];
                 }
             }
          else{
              }
          System.out.println(power);
          power = 0;
          }
   }
}
