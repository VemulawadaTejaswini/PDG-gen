import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i < n; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int[] b = new int[n+1];
        for(int i = n; i >= n / 2; i--) {
            b[i] = a[i];
        }
        for(int i = n / 2 - 1; i >= 1; i--) {
          int aNum = a[i * 2];
          if(a[i] == 1) {
            if(aNum == 1) b[i] = 0;
            else b[i] = 1;
          } else {
            if(aNum == 2) b[i] = 1;
            else b[i] = 0;
          }
        }
        System.out.println(n);
      for(int i = 1; i <= n; i++) {
        System.out.println(b[i]);
      }
    }
}
