import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     n    = scan.nextInt();
      long    abs  = 0;

      long[] A   = new long[n + 2];
      long   sum = 0;
      A[0] = A[n + 1] = 0;
      for(int i = 1; i < n + 1; i++){
          A[i] = scan.nextLong();
          }
      for(int i = 0; i < n + 1; i++){
          sum += Math.abs(A[i] - A[i + 1]);
          }
      for(int i = 1; i < n + 1; i++){
          abs = 0;
          if(A[i] > A[i - 1] && A[i] > A[i + 1]){
             abs  = Math.abs(A[i] - A[i - 1]) + Math.abs(A[i] - A[i + 1]);
             abs -= Math.abs(A[i - 1] - A[i + 1]);
             System.out.println(sum - abs);
             }
          else if(A[i] < A[i - 1] && A[i] < A[i + 1]){
                  abs  = Math.abs(A[i] - A[i - 1]) + Math.abs(A[i] - A[i + 1]);
                  abs -= Math.abs(A[i - 1] - A[i + 1]);
                  System.out.println(sum - abs);
                  }
          else{
              System.out.println(sum);
              }
          }


      //System.out.println(count);
   }
}
