import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n == 1) {
        System.out.println(1);
        return;
      }
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      int cnt = 0;
      int prev = 0;
      for(int i = 1; i < n; i++) {
        if(arr[i] - arr[i-1] == 0) continue;
        if(prev * (arr[i] - arr[i-1]) < 0) {
          cnt++;
          prev = 0;
        } else
            prev = arr[i] - arr[i-1];
      }
      System.out.println(cnt + 1);
  }
}