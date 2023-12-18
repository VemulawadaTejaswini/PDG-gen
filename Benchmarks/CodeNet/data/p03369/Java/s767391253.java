import java.util.*;
import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      String str = sc.next();
      int i = str.split("x").length;
      out.println(700 + i * 100);

   }

}