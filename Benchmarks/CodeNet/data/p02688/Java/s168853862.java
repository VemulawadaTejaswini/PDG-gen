    import java.util.*;
     
    public class Main {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < k; i++) {
          int d = sc.nextInt();
          for (int j = 0; j < d; j++) {
              int p = sc.nextInt();
              a[p-1]++;
          }
        }
        
        for (int j = 0; j < n; j++) {
          if (a[j] == 0) {
            cnt++;
          }
        }
        System.out.println(cnt);
      }
    }  