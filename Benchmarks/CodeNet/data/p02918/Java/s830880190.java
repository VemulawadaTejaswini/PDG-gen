import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        char[] ary = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ary[i] == ary[i + 1]) {
                ans++;
            }
        }
        ans += k * 2;
        if (n - 1 < ans) {
            ans = n - 1;
        }
        System.out.println(ans);
    }
}