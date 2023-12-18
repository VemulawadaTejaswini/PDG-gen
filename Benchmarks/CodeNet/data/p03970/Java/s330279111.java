import java.util.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);                                            
      
      String S = sc.next();       
      
      String target = "CODEFESTIVAL2016";
           
      int count = 0;
      for(int i = 0;i < S.length();i++){
          if(target.charAt(i) != target.charAt(i)){
              count++;
          }
      }
      
      System.out.println(count);
          
            
   }
}