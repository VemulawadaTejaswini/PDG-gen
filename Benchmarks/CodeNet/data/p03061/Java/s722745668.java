import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] aset = new int[n];
      int[] aset_tmp = new int[n];
      int i,j;
      int x,y;
      int ans = 0;
      int count = 0;
      for (i = 0; i < n; i++) {
         aset[i] = sc.nextInt();
         aset_tmp[i] = aset[i];
      }
      sort(aset);
      int tmp;
      for (j=0; j<n-1; j++) {
         aset[j] = aset_tmp[j];
         aset[j+1] = aset_tmp[0];
         for (i=0; i<n-1; i++) {
            x = aset[i];
            y = aset[i+1];
            while ((tmp = x % y) != 0) {
               x = y;
               y = tmp;
            }
            count = y;
         }
         if (ans < count) {
            ans = count;
         }
      }
      System.out.println(ans);
   }
   static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
             }
   }
}
}
