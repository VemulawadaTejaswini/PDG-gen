import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        long ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    continue;
                }
                int sub = j - i;
                for (int k = j + 1; k < n; k++) {
                    if (k - j == sub) {
                        continue;
                    }
                    if (s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k)) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}