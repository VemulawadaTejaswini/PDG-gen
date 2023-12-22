import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int x = Integer.parseInt(sn.next());
      if (x == 0) {
         System.out.println(1);
      } else {
         System.out.println(0);
      }
   }
}
