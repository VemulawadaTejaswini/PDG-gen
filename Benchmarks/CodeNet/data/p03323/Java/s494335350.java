import java.util.*;
import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A > 8 || B > 8) {
      System.out.println("Yay!");
    } else {
      System.out.println(":(");
    }

   }
}