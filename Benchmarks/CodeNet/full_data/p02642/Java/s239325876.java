import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int N = scanner.nextInt();
      int[] array = new int[N];
      
      for (int i = 0; i < N; i++)
      {
         array[i] = scanner.nextInt();
      }
      
      int total = 0;
      
      outer: for (int i = 0; i < N; i++)
      {
         int current = array[i];
         int notDivisible = 0;
         int equivalent = 0;
         
         inner : for (int j = 0; j < N; j++)
         {
            if (current != array[j])
            {
               if (array[i] % array[j] != 0)
               {
                  notDivisible++;
               }    
            }
           
            else 
            {
               equivalent++;
            }              
         } 
         
         if (notDivisible == N - equivalent && notDivisible > 0)
         {
            total++;
         }
         
      }
      
      System.out.println(total);
   }
}       
            
         