import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] r = new long[n+2];

        for(int i = 1; i <= n; i++) {
            r[i] = r[i-1] + sc.nextLong();
        }
        long ans = 0;
        int next = 1;
        main:for(int i = 1; i <= n; i++) {
            loop: for(int j = next; j <= n; j++) {
                long a = (r[i] - r[i-1]) & (r[j] - r[i-1]);
                if(a > 0) {
                    ans += j-i+1;
                    next = Math.max(j, i+1);
                    break loop;
                } else if(j==n) {
                    for(int m = j-i+1; m >= 1; m--) {
                        ans += m;
                    }
                    break main;
                }
            }
        }
        System.out.println(ans);
    }
}