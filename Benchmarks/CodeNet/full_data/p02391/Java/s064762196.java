import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         a = scan.nextInt();
         b = scan.nextInt();
         
         StringBuffer s = new StringBuffer();
         
         if (a>b) s = ">";
         else if (a<b) s = "<";
         esle s= "=";

         System.out.println(a + " " + s + " " + b);
     }
}