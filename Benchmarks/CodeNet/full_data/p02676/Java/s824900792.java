import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     
        //sec--1
        Scanner sc = new Scanner(System.in);
        String K = sc.nextLine();
        String S = sc.nextLine();
        
         //sec--2
         if(S.length() <= K.length()) {
           System.out.println("S");
         } else if (S.length() > K.length()) {
           System.out.println("K" + "...");
         }
   }
}