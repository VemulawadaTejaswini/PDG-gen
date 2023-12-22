import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();
       if (S.toUpperCase() == S) {
         System.out.println("A");
       } else if (S.toLowerCase() == S) {
         System.out.println("a");
       }
   }
}