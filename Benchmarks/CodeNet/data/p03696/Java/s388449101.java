import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int rightCnt = 0;
        boolean rightOk = false;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                rightOk = true;
                rightCnt++;
            }
            if (rightOk && s.charAt(i) == '(') {
                rightCnt--;
            }
        }
        if (rightCnt < 0) {
            rightCnt = 0;
        }

        int leftCnt = 0;
        boolean leftOk = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                leftOk = true;
                leftCnt++;
            }
            if (leftOk && s.charAt(i) == ')') {
                leftCnt--;
            }
        }
        if (leftCnt < 0) {
            leftCnt = 0;
        }

        String ans = "";
        for (int i = 0; i < rightCnt; i++) {
            ans += "(";
        }
        ans += s;

        for (int i = 0; i < leftCnt; i++) {
            ans += ")";
        }
        System.out.println(ans);
    }
}
