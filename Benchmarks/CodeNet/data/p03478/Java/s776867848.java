import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N = scan.nextInt();
      int     A = scan.nextInt();
      int     B = scan.nextInt();
      long    sum = 0, mod = 0;
      long    n = 0;

      for(long j = 1; j <= N; j++){
          n = j;
          for(long i = 1; i <= 6; i++){
              mod += n % 10;
              n    = n / 10;
              }
          if(mod >= A && mod <= B){
             sum += j;
             }
          //System.out.println(j + "" + sum);
          mod = 0;
          }
      System.out.println(sum);
   }
}
