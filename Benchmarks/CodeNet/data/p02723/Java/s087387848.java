import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  

       String s= sc.next();
       char terceraLetra= s.charAt(3);
       char cuartaLetra= s.charAt(4);
       char quintaLetra= s.charAt(5);
       char sextaLetra= s.charAt(6);
       if((terceraLetra==cuartaLetra))
       {
         if((quintaLetra==sextaLetra))
         {
           System.out.print("Yes");
         }
          
       }else
       {
			System.out.print("No");
		}
    }
}
