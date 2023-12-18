import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[3][n];

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    Arrays.sort(a[0]);
    Arrays.sort(a[1]);
    Arrays.sort(a[2]);
    int sum =0;

    for(int i = 0; i < n; i++) {
      int index1 = Arrays.binarySearch(a[0],a[1][i]);
      int index2 = Arrays.binarySearch(a[2],a[1][i]);
      if(index1 < 0) index1 = 0 - index1 - 1;
      if(index2 < 0) index2 = 0 - index2 - 2;
      sum += index1*(n-index2-1);
    }

    System.out.println(sum);
  }
}
