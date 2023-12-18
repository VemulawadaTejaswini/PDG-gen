import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] chars = S.toCharArray();
        int zeroNum = 0;
        int oneNum = 0;
        for (char ch : chars) {
            if (ch == '0') {
                zeroNum++;
            }
            else {
                oneNum++;
            }
        }
        int min = Math.min(zeroNum, oneNum);
        int ans = min * 2;
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}