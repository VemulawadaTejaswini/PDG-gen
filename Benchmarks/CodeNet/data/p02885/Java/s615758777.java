import java.util.*;

class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int yoko = 2 * b;
        
        if(a <= yoko) System.out.println(0);
        else System.out.println(a - yoko);
     }
}