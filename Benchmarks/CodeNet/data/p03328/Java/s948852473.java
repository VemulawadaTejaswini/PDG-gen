 
 
import java.util.Scanner;

  class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();
         int  x  = 0 ;
         for(int i = 1;i<=999 ; i++){
             if((i*(i+1)) /2 > a ){
                 x   = i*(i+1)  /2 ; 
                 break;
            }
         }
           
         System.out.println(x-a);
     }
}
