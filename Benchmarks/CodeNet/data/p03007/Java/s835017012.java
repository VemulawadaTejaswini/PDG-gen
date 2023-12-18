import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      long diff = arr[0];
      for(int i = 1; i < n - 1; i++)
        diff -= arr[i];
      diff = arr[n-1] - diff;

      System.out.println(diff);
      diff = arr[0];
      for(int i = 1; i < n - 1; i++) {
        System.out.println(diff + " " + arr[i]);
        diff -= arr[i];
      }
      System.out.println(arr[n-1] + " " + diff);
  }
}