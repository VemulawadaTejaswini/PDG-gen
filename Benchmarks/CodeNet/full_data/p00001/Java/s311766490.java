import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      final int SIZE = 10;

      int[] height = new int[SIZE];
      for (int i = 0; i < SIZE; i++) {
         height[i] = scanner.nextInt();
      }

      int[] valueMax = max3(height);

      for (int i = 0; i < 3; i++) {
         System.out.println(valueMax[i]);
      }
   }

   static int[] max3(int[] args) {
      final int MIN = Integer.MIN_VALUE;
      int[] valueMax = { MIN, MIN, MIN };

      for (int value : args) {
         int tmp;
         for (int i = 0; i < 3; i++) {
            if (value > valueMax[i]) {
               tmp = valueMax[i];
               valueMax[i] = value;
               value = tmp;
            }
         }
      }

      return valueMax;
   }

}