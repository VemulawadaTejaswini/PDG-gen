import java.util.*;

public class Main {    
    
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
    
       int A = sc.nextInt();
       int B = sc.nextInt();
       
       int Alice = 0;
       int Bob   = 0;
       
       if(A == 1){
           Alice = 13;
       }else{
           Alice = A - 1;
       }
       
       if(B == 1){
           Bob = 13;
       }else{
           Bob =  B - 1;
       }
       
       if(Alice == Bob){
           System.out.println("DRAW");
       }else if(Alice > Bob){
           System.out.println("Alice");
       }else if(Bob   > Alice){
           System.out.println("Bob");
       }
       
   }   
}