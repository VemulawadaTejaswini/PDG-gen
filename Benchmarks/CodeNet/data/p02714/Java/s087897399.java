import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.substring(i, i + 1).equals(s.substring(j, j + 1))) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (s.substring(i, i + 1).equals(s.substring(k, k + 1))
                            || s.substring(j, j + 1).equals(s.substring(k, k + 1))) {
                        continue;
                    }
                    if (j - i != k - j) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}