import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        int r = 0, g = 0, b = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equals("R")) {
                r++;
            } else if (s.substring(i, i + 1).equals("G")) {
                g++;
            } else {
                b++;
            }
            for (int j = i + 1; j < n; j++) {
                int k = j + j - i;
                if (!s.substring(i, i + 1).equals(s.substring(j, j + 1))
                        && !s.substring(i, i + 1).equals(s.substring(k, k + 1))
                        && !s.substring(j, j + 1).equals(s.substring(k, k + 1))) {
                    ans++;
                }
            }
        }
        System.out.println(r * g * b - ans);
    }
}