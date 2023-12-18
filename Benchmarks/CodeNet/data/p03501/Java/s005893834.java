import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int T = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      out.println(Math.min(A*T, B));
   }
}