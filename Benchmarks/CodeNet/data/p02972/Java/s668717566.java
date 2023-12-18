import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n+1];
      for(int i = 1; i <= n; i++)
        arr[i] = sc.nextInt();
      int[] res = new int[n+1];
      
      int resCnt = 0;
      for(int i = n; i > 0; i--) {
        int cnt = 0;
        for(int j = i*2; j <= n; j += i)
          cnt += res[j];
        if(cnt % 2 != arr[i]) {
          res[i] = 1;
          resCnt++;
        }
      }
      System.out.println(resCnt);
      if(resCnt != 0)
      for(int i = 1; i <= n; i++){
        if(res[i] > 0)
            System.out.print(res[i] + " ");
      }
      System.out.println();
  }
}