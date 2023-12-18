import java.util.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);                                            
      
      String S = sc.next();
     
      String target = "";
      for(int i = 0;i < S.length();i++){
          if(S.charAt(i) == 'C'){
              target = S.substring(i+1);
          }
      }
      
      if(target.contains("F")){
          System.out.println("Yes");
      }else{
          System.out.println("No");          
      }
      
      
   }
        
 }