import java.util.*;

public class Main {
    
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String S = sc.next();   

   for(int i = 1;i < S.length();i++){      
      String A = S.substring(0,S.length() - i);                  
      if(isEven(A)){
          System.out.println(S.length() - i);
          return;
      }
   }         
            
  } 
  
  private static boolean isEven(String S){      
      String a = S.substring(0,S.length()/2);
      String b = S.substring(S.length()/2);
      if(S.length()%2 == 0 &&a.equals(b)){
          return true;
      }
      return false;
  }
  
}
