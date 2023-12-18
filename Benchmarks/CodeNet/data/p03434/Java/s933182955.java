import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     N     = scan.nextInt();
      int     Alice = 0;
      int     Bob   = 0;

      int[] Card = new int[N];
      for(int i = 0; i < N; i++){
          Card[i] = scan.nextInt();
          }
      Arrays.sort(Card);
      for(int j = 0; j < N; j++){
          if(j % 2 == 0){
             Alice += Card[j];
             }
          else{
              Bob += Card[j];
              }
          }
      if(N % 2 == 0){
         System.out.println(-Alice + Bob);
         }
      else{
          System.out.println(Alice - Bob);
          }
   }
}
