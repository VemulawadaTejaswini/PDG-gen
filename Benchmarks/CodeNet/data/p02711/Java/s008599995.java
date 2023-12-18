import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = x % 10;
       if(y == 7)
       {
         System.out.println("Yes");
       }
      else
      {
        System.out.println("No");
      }
    }
}