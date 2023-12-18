import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();
      int     K    = scan.nextInt();
      int     coun = 0;

      for(int i = 1; i <= N; i++){
          for(int j = 1; j <= N; j++){
              if(i % j >= K){
                 coun++;
                 }
              }
          }
      System.out.println(coun);
   }
}
