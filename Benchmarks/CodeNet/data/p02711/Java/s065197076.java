import java.util.*;
public class Main{
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         
         boolean flag = true;
         while ( a != 0 ){
            if ( a % 10 == 7 ){
                flag = false;
                break;
            }
            
            a/=10;
         }
         
         if ( !flag ){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
     }
}