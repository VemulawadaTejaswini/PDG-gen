import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a1_1;
      int a1_2;
      int[][] a2 = new int[n][2];
      double pow1 = 0;
      double sqrt1 = 0;
      double all_qty = 0;

      for (int i = 0;  i < n  ; i ++ ) {
          a1_1 = scanner.nextInt();
          a1_2 = scanner.nextInt();
          a2[i][0] = a1_1;
          a2[i][1] = a1_2;
      }

      for (int i = 0;  i < n ; i ++ ) {
          for (int j = i + 1;  j < n ; j ++ ) {
             pow1 = (Math.pow((a2[i][0] - a2[j][0]), 2) + Math.pow((a2[i][1] - a2[j][1]), 2));
             sqrt1 = Math.sqrt(pow1);

             all_qty = all_qty + sqrt1;

          }
      }

      System.out.println(all_qty / ((double)n/2));
      
      return;
    }

 }
