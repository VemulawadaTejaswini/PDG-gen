import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N = scan.nextInt();
      int     K = scan.nextInt();
      long    n = 1, coun = 0;

      for(int i = 1; i <= N; i++){
          for(long j = n; j <= N; j++){
              if(i - j * (i / j) >= K){
                 //System.out.print(i);
                 //System.out.println(j);
                 coun++;
                 }
              if(coun == 1 && n == 1){
                 n = i - 1;
                 }
              }
          }
      System.out.println(coun);
   }
}
