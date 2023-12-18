import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] tt = new int[n];
        for (int i = 0; i < n; i++) {
            tt[i] = sc.nextInt();
        }
        int pos = 0;
        int ans = 0;
        int time = 0;
        while (pos < n) {
            int on = tt[pos] + t;
            if (time <= tt[pos]) {
                time = on;
                ans += t;
                pos++;
            } else {
                ans += on - time;
                time = on;
                pos++;
            }
        }
        System.out.println(ans);
    }
}