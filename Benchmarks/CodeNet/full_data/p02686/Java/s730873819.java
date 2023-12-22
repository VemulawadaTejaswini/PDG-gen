import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int left_zero = 0;
        int right_zero = 0;
        int double_zero = 0;
        long left_sum = 0;
        long right_sum = 0;
        for (int i=0;i<N;i++) {
            String S = sc.next();
            int len = S.length();
            char[] c = S.toCharArray();
            int left = 0;
            int right = 0;
            for (int j=0;j<len;j++) {
                if (c[j] == '(') {
                    left++;
                } else { // c[i] == ')'
                    if (left>0) left--;
                    else right++;
                }
            }
            if (left == 0 && right == 0) double_zero++;
            else if (left == 0) left_zero++;
            else if (right == 0) right_zero++;
            left_sum += left;
            right_sum += right;
            // System.out.println("left, right: "+left+" "+right);
        }

        // System.out.println("left_sum, right_sum: "+left_sum+" "+right_sum);
        // System.out.println(left_zero+" "+right_zero+" "+double_zero);
        if (N == 1) {
            if (double_zero == 1) System.out.println("Yes");
            else System.out.println("No");
            return;
        }

        if ((left_sum == right_sum) && (
            double_zero >= 2 ||
            (left_zero >= 1 && right_zero >= 1) ||
            (left_zero >= 1 && double_zero >= 1) ||
            (double_zero >= 1 && right_zero >= 1))
            ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}