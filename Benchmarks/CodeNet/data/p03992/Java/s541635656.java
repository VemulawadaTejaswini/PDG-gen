import java.util.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);                                            
      
      String S = sc.next();       
      
      String ans = S.substring(0,4) + " " + S.substring(4,12);
      
      System.out.println(ans);
      
   }
}
        
        
