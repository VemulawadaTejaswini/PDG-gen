import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      String input = console.next();
      int N = input.length() - 1;
      if(isPalindrome(input.substring(0, (N / 2))) &&
         isPalindrome(input.substring((N + 3) / 2))){
            System.out.println("Yes");
         }else{
            System.out.println("No");
         }
   }
   
   public static boolean isPalindrome(String s){
      int N = s.length() - 1;
      int constant = N + 1;
      for(int i = 0; i < constant / 2 ; i++){
         if(s.charAt(i) != s.charAt(N)){
            return false;
         }
         N--;
      }
      return true;
   }
}