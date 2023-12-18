import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int n = sc.nextInt();
        int ans = 0;
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (k - j == j - i) continue;
                    if (s[k] == s[j] || s[j] == s[i] || s[i] == s[k]) continue;
//                    System.out.printf("%d %d %d", i, j, k);
//                    System.out.println("");
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
