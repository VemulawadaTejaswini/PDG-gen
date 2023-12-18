import java.util.*;

class main
{
     public static void main (String [] args)
     {
       int[] vals = new int[]{1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51}; 
       Scanner keyboard = new Scanner(System.in);
      
      int input = keyboard.nextInt();
       System.out.println (vals[input - 1]);     
     }
}
 