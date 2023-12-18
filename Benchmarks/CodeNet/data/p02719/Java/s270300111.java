import java.util.*;
import java.util.Collections;
 
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
      
        int answer = n;
      
      int na = Math.abs(n-k);
      
      if(na<answer){
          answer = na;
        }
      
      do{
        na = Math.abs(na-k);
        
        if(na<answer){
          answer = na;
        }
        
        
        }while(n == na || na == 0);
        
      
   
         System.out.println(answer);
      
    
      
    }
  
 
  
}