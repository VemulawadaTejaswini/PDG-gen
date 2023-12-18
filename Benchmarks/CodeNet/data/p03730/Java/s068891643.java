import java.util.*;

public class Main {    
    
    public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);       
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       
       for(int k = 0;k <= B;k++){
           if((k*A)%B == C){
               System.out.println("YES");   
               return;
           }           
       }
              
       System.out.println("YES");                     
       
    }      
}
   