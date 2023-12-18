import java.util.*;

public class Main{

     public static void main(String []args){
       int N, Y, x, y, z;
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       Y = sc.nextInt();
       
       for(x = 0; x <= N; x++){
           for(y = 0; y <= N-x; y++){
               if(10000 * x + 5000 * y + 1000 * (N-(x+y)) == Y){
                   System.out.println(x + " " + y + " " + (N-(x+y)));
                   return;
               }
           }
       }
       
       System.out.println(-1 + " " + -1 + " " + -1);
      
     }
}