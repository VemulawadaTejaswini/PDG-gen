import java.util.Scanner;

public class Main{
     public static void main(String[] args){
          Scanner kb = new Scanner(System.in);
          int i, N, x, y, z, longest;
          
          N = kb.nextInt();
          
          for(i = 0 ; i < N ; i++){
               x = kb.nextInt();
               y = kb.nextInt();
               z = kb.nextInt();
               longest = x;
               if (longest < y){
                    longest = y;
               }
               if (longest < z){
                    longest = z;
               }
               if (longest == x){
                    if ((x * x) == (y * y + z * z)){
                         System.out.println("YES");
                    }
                    else{
                         System.out.println("NO");
                    }
               }
               else if (longest == y){
                    if ((y * y) == (x * x + z * z)){
                         System.out.println("YES");
                    }
                    else{
                         System.out.println("NO");
                    }
               }
               else if (longest == z){
                    if ((z * z) == (x * x + y * y)){
                         System.out.println("YES");
                    }
                    else{
                         System.out.println("NO");
                    }
               }
          }
     }
}