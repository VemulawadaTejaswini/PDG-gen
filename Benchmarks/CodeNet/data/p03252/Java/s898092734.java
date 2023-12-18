import java.util.*;
public class Main {
   static Scanner sc = new Scanner(System.in);
   static Scanner sc2 = new Scanner(System.in);
   public static void main(String[] args) {
      char[] S = toCharArray(sc.next());
      char[] T = toCharArray(sc.next());
      String msg = "Yes";

      if (S.equals(T)) {
         System.out.println("No");
         return;
      }
      for (int i = 0; i < S.length; i++ ) {

         if (S[i] != T[i]) {
            String str = String.valueOf(T);
            int num = str.indexOf(S[i]);
            if (num != -1 && (S[num] != T[num] || S[num] != T[i])) {
               msg = "No";
               break;
            }
         }
      }

      System.out.println(msg);
   }
}