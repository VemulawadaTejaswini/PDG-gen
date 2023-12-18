import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int ans = solve(S);
        System.out.println(ans);

    }

    private static int solve(String s) {
        int ans = 0;
        char[] sn = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (sn[i - 1] == sn[i]) {
                ans++;
                sn[i] = sn[i] == '0' ? '1' : '0';
            }
        }
        return ans;
    }

}
