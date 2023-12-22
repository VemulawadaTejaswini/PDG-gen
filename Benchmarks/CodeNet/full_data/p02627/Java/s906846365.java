import java.util.Scanner; 
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.next();
      if(Character.isLowerCase(input.charAt(0))){
         System.out.println("a");
      } else {
         System.out.println("A");
      }
   }
}