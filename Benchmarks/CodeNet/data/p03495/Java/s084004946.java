// コードがきたないけど許して＞＜
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (a[num-1] == 0)
                cnt++;
            a[num-1]++;
        }

        int ans = 0;
        if (cnt > k) {
            int[] min = new int[cnt-k];
            for (int i = 0; i < min.length; i++) {
                min[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    int hoge = a[i];
                    for (int j = 0; j < min.length; j++) {
                        if (min[j] > hoge) {
                            int hoge1 = min[j];
                            min[j] = hoge;
                            hoge = hoge1;
                        } else {
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < min.length; i++) {
                if (min[i] != Integer.MAX_VALUE)
                    ans += min[i];
            }
        }

        System.out.println(ans);
    }
}