
import java.util.Scanner;
 class  a {

   public static void main(String[] args){
     Scanner stdIn = new Scanner(System.in);

     int D = stdIn.nextInt();
     int T = stdIn.nextInt();
     int S = stdIn.nextInt();

     if(T*S>D){
       System.out.println("YES");
     }else{
       System.out.println("NO");

     }

   }


}
