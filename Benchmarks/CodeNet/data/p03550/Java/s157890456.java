import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();
      long    X    = scan.nextLong();
      long    Y    = scan.nextLong();

      long[] A = new long[N];

      for(int i = 0; i < N; i++){
          A[i] = scan.nextLong();
          }
      long max = A[0];
      if(A.length != 1){
         for(int i = 1; i < N; i++){
             max = Math.max(A[i - 1], A[i]);
             }
         }
      max = Math.max(max, Y);
      long score = 0;
      if(A.length == 1){
         score = Math.abs(A[0] - Y);
         }
      else{
          score = Math.max(Math.abs(Y - A[N - 1]), Math.abs(A[N - 2] - A[N - 1]));
          }
      System.out.println(score);
   }
}
