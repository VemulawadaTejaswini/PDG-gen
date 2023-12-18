import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int ans = 0;
        boolean f = true;
        while (f) {
            f = false;
            boolean m = true;
            for (int i = 0; i < n; i++) {
                if (h[i] > 0) {
                    h[i]--;
                    ans += (m) ? 1 : 0;
                    f = true;
                    m = false;
                } else {
                    m = true;
                }
            }
        }
        System.out.println(ans);
    }
}