import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
        //sec--1
        String[] ALFA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] alfa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        //sec--2
        for(int i=0; i<ALFA.length; i++){
          String S = sc.nextLine();
         if(S.equals(ALFA[i])) {
          System.out.println("A");
         } else if (S.equals(alfa[i])) {
          System.out.println("a");
         }
        }
   }
}