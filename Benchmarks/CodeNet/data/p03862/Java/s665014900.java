import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ary[i] + ary[i + 1] > x) {
                int temp = ary[i] + ary[i + 1] - x;
                ans += temp;
                if (ary[i + 1] < temp) {
                    ary[i + 1] = 0;
                } else {
                    ary[i + 1] -= temp;
                }
            }
        }
        System.out.println(ans);
    }
}