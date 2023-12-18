
import java.util.Scanner;
public class Main { 
    public static void main(String args[])
   {
       int j;
      String str, rev ="" , rev1="", rev2= "";
      Scanner sc = new Scanner(System.in);
 
      str = sc.nextLine();
 
      int length = str.length();
      
      int n1 = (length-1)/2;
      int n2 = (length+3)/2;
      
      String st = "";
      String st1 = "";
      st = str.substring(0,n1);
      st1 = str.substring(n2-1,length);
        
    for ( j = n1 - 1; j >= 0; j-- ){
         rev1 = rev1 + st.charAt(j);
         rev2 = rev2 + st1.charAt(j);
    }
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev) && st.equals(rev1) && st1.equals(rev2))
         System.out.println("YES");
      else
         System.out.println("No");
     
   }
} 