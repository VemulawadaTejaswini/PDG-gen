import java.util.*;
  public class Main {
  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
          arr[i][0] = sc.nextInt();
          arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a[1] == b[1] ? a[0] - b[0] : b[1] - a[1]);
        int[] benifits = new int[m];
        for(int i = 0; i < n; i++) {
          int idx = m - arr[i][0];
          for(; idx >= 0; idx--) {
            if(benifits[idx] == 0) {
              benifits[idx] = arr[i][1];
              break;
            }
          }
        }
        long cnt = 0L;
        for(long b : benifits)
          cnt += b;
        System.out.println(cnt);
    }
  }  