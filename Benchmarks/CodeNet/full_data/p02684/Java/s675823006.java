import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      int[] arr = new int[n+1];
      for(int i = 1; i <= n; i++)
        arr[i] = sc.nextInt();

      int fast = 1;
      int slow = 1;
      int moves = 0;
      do {
        fast = arr[arr[fast]];
        slow = arr[slow];
        moves++;
      } while(arr[fast] != arr[slow]);
      long step = k % moves;
      int res = arr[1];
      for(long i = 0; i < step; i++)
        res = arr[arr[res]];
      System.out.println(res);
  }
}