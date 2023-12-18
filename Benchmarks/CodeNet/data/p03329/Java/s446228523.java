import java.util.Scanner;

public class Main{
    public static void main(Strings[] args){
          Scanner input = new Scanner(System.in);
          final int[] yen = {1, 6, 9};
          int[] ways = new int[100000 + 1];

          for(int i = 0; i < yen.length; ++i){
               ways[yen[i]] = 1;
          }

         for(int i = 0; i < ways.length; ++i){
              for(int j = 0; j < yen.length; ++i){
                   if(i - yen[j] > 0){
                       ways[i] = Math.min(ways[i], ways[i - yen[j]] + 1);
                   }
               }
         }
         
         while(input.hasNext()){
              int N = input.nextInt();
              
              System.out.println(ways[N]);
          }
     }
}
