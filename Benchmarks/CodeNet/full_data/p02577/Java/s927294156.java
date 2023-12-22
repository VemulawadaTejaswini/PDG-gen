import java.util.Scanner;

class DivisibleBy9 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);

      String num = sc.nextLine();

      int digitSum = 0;

      for(int i = 0; i<num.length(); i++)
      {
         digitSum = digitSum + num.charAt(i)-'0';
      }

      if(digitSum % 9 == 0)
      {
         System.out.println("Yes");
      } 
      else 
      {
         System.out.println("No");
      }
   }
}