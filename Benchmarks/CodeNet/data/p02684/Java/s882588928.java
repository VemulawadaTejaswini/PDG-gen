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
      int entryEle = arr[fast];
      int steps = 0;
      slow = 1;
      while(arr[slow] != entryEle && k > 0) {
        steps++;
        k--;
        slow = arr[slow];
      }
      int res = arr[slow];
      if(k > 0) {
        long step = (k - steps) % moves;
        for(int i = 0; i < step; i++)
          res = arr[arr[res]];
      }
      
      System.out.println(res);
  }
}