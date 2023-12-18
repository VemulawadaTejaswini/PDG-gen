import java.util.*;
class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     n     = scan.nextInt();
      int     count = 1;

      int[] array = new int[n];
      for(int i = 0; i < n; i++){
          array[i] = scan.nextInt();
          }
      Arrays.sort(array);
      for(int i = 1; i < n; i++){
          if(array[i - 1] != array[i]){
             count++;
             }
          }
      System.out.println(count);
   }
}
