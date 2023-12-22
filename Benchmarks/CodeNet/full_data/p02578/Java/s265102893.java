package atcoder.beginnercontest.r176;

import java.util.Scanner;

/**
 * @author pribic (Priyank Doshi)
 * @since 29/08/20
 */
public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      long ans = 0;
      
      for(int i = 0; i < n - 1; i++) {
        if(arr[i+1] < arr[i]) {
          ans += arr[i] - arr[i+1];
          arr[i+1] = arr[i];
        }
      }
      System.out.println(ans);
    }
  }
}