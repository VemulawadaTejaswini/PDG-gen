import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a1;
      int[][] a2 = new int[n][2];

      for (int i = 0;  i < n  ; i ++ ) {
          a1 = scanner.nextInt();
          a2[i][0] = i + 1;
          a2[i][1] = a1;
      }

      quick_sort(a2, 0, n - 1);

      for (int i = 0;  i < n ; i ++ ) {
         System.out.print(a2[i][0]);
         System.out.print(" ");
      }

      return;
    }

    static void quick_sort(int[][] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2][1];
        int l = left, r = right;
        int a3_1;
        int a3_2;
        while(l<=r) {
            while(d[l][1] < p) { l++; }
            while(d[r][1] > p) { r--; }
            if (l<=r) {
                a3_1 = d[l][0];
                a3_2 = d[l][1];
                d[l][0] = d[r][0];
                d[l][1] = d[r][1];
                d[r][0] = a3_1;
                d[r][1] = a3_2;
                l++; r--;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }

  }
