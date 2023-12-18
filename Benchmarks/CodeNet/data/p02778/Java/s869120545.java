import java.util.*;
public class Test {

   public static void main(String args[]) {
     Scanner scn=new Scanner(System.in);
     System.out.println("enter the string");
      String Str=scn.next();
      for(int i=0;i<=Str.length()-1;i++)
      {
      
        
     System.out.print(Str.replace(Str,"x"));
    
      }
   } 
}
