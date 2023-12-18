import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  

       String s= sc.next();

       if(s.charAt(3)==s.charAt(4))
       {
         if(s.charAt(5)==s.charAt(6))
         {
           System.out.print("Yes");
         }
          
       }else
       {
			System.out.print("No");
		}
    }
}
