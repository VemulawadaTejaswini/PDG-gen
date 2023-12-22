import java.util.*;
 public class Main {
	public static void main(String[] args){

      int X = 3;
      int Y = 8;
      boolean exists = false;
     
      for(int i = 0;i <= X;i++){
         if(2 * i + 4 * (X - i) == Y){
            exists = true;
         }
            
      }

      if(exists){
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }
      
   }
 }


