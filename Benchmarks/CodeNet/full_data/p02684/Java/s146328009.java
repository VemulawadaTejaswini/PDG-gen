import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int t;
        t = a[1];
        // 1 6 2 5 3 2 5 3 2...
        int[] check = new int[n+1];
        check[1]++;
        for (long j = 2; j <= k; j++) {
            if (check[t] == 2) {
                // ループし始めている
                break;
            }
            check[t]++;
            t = a[t];
        }
        
        int count1 = 0, count2 = 0;
        for (int i = 1; i <= n; i++) {
            if (check[i] == 1) {
                count1++;
            }
            else if (check[i] == 2) {
                count2++;
            }
        }

        // 動かすのはcount1 + (k - count1) % count2 でよい
        long max = count1 + (k - count1) % count2;
        if (count1 == 0) {
            max++;
        }
        t = a[1];
        for (long j = 2; j <= max; j++) {
            t = a[t];
        }

        // 出力
        System.out.println(t);
    }
}
