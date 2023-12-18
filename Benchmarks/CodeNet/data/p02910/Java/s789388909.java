import java.util.*;

public class Main {
 public static void main(String... args) {
   Scanner scan = new Scanner(System.in);
   String S = scan.next();

   boolean res = true;
   char target=0;
   for(int i=0; i<S.length(); i++) {
     target = S.charAt(i);
     if((i%2 != 0) && (target == 'R') ||
        (i%2 == 0) && (target == 'L')) {
       res = false;
       break;
     }
   }
   System.out.println(res ? "Yes" : "No");
 }
}