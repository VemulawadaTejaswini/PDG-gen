import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();
       if (S.isUpperCase(S.charAt(0))) {
         System.out.println("A");
       } else if (S.isLowerCase(S.charAt(0))) {
         System.out.println("a");
       }
   }
}