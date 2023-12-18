import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] ary = new char[n][10];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ary[i] = s.toCharArray();
            Arrays.sort(ary[i]);
        }
        long ans = 0L;
        s:for (int i = 0; i < n; i++) {
            d:for (int j = i + 1; j <= n - 1; j++) {
                boolean isMatch = true;
                t:for (int k = 0; k < 9; k++) {
                    if (ary[i][k] != ary[j][k]) {
                        isMatch = false;
                        continue t;
                    }
                }
                if (isMatch) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}