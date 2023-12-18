import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[3][2];
      for(int i = 0; i < 3; i++)
        arr[i][0] = sc.nextInt();
      for(int i = 0; i < 3; i++)
        arr[i][1] = sc.nextInt();

      Arrays.sort(arr, (a1, a2) -> (a2[1] - a2[0]) - (a1[1] - a1[0]));
      int cnt = 0;
      for(int i = 0; i < 3 && n > 0; i++) {
        if(arr[i][1] - arr[i][0] <= 0) break;
        if(n < arr[i][0]) continue;
        int num = n / arr[i][0];
        n -= num * arr[i][0];
        cnt += arr[i][1] * num;
      }
      n += cnt;

      cnt = 0;
      Arrays.sort(arr, (a1, a2) -> (a2[0] - a2[1]) - (a1[0] - a1[1]));
      for(int i = 0; i < 3 && n > 0; i++) {
        if(arr[i][0] - arr[i][1] <= 0) break;
        if(n < arr[i][1]) continue;
        int num = n / arr[i][1];
        n -= num * arr[i][1];
        cnt += arr[i][0] * num;
      }
      n += cnt;
      System.out.println(n);
  }
}