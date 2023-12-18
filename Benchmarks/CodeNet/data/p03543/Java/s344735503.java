import java.util.*;
public class TaskA {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int count = 0;
      for(int i = 0; i < s.length(); i++){
         count = 0;
         for(int j = i; j < s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
               count++;
            }
            if(count == 3){
               System.out.println("Yes");
               System.exit(0);
            }
         }
      }
      System.out.println("No");
   }
}