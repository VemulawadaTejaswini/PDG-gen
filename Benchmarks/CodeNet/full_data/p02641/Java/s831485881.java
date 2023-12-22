import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int X = scanner.nextInt();
      int N = scanner.nextInt();
      
      int[] array = new int[N];
      
      for (int i = 0; i < N; i++)
      {
         array[i] = scanner.nextInt();
      }
      
      boolean checkBelow = true;
      
      for (int i = 0; i <= N ; i++)
      {
         if (!search(X - i, array))
         {
            System.out.println(X - i);
            return;
         } 
            
         if (!search(X + i, array))
         {
            System.out.println(X + i);
            return;
         }
               
      }
      
   }
   
   public static boolean search(int num, int[] array)
   {
      for (int i = 0; i < array.length; i++)
      {
         if (array[i] == num)
         {
            return true;
         }
      }
      
      return false;
   }
}
      
      
            
      
      
         