import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] H = new int[N];

      for (int i = 0; i < H.length; ++i) {
        H[i] = in.nextInt();
      }

      int countDecrease = 0;
      int decreaseIdx = -1;
      for (int i = 1; i < H.length; ++i) {
        if (H[i - 1] > H[i] ) {
          ++countDecrease;
          decreaseIdx = i - 1;
        }
      }

      if (countDecrease == 0) {
        System.out.println("Yes");
      } else if (countDecrease == 1) {
         --H[decreaseIdx];

         if (H[decreaseIdx] <= H[decreaseIdx + 1]) {
           if (decreaseIdx > 0 && H[decreaseIdx - 1] <= H[decreaseIdx]) {
             System.out.println("Yes");
           } else if (decreaseIdx == 0) {
             System.out.println("Yes"); 
           } else {
             System.out.println("No");
           }
         } else {
             System.out.println("No");
         }
      } else {
        System.out.println("No");
      }
    }
  }
}