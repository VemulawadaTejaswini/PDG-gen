import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long sum = 0;
      for(int i = 0; i < n; i++) {
        int min = arr[i];
        for(int j = i; j < n; j++) {
          min = Math.min(min, arr[j]);
          sum += min;
        }
      }
      System.out.println(sum);
  }
}