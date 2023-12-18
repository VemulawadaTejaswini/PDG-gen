import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();
        final int A = Integer.parseInt(S.substring(0, 1));
        final int B = Integer.parseInt(S.substring(1, 2));
        final int C = Integer.parseInt(S.substring(2, 3));
        final int D = Integer.parseInt(S.substring(3, 4));

        for (int i=8; i<Math.pow(2.0, 3.0)+8; i++) {
            int sum = A;
            StringBuilder sb = new StringBuilder(A + "+2+3+4=7");
            if ("1".equals(Integer.toBinaryString(i).substring(3, 4))) {
                sum += B;
                sb.replace(1, 3, "+" + B);
            } else {
                sum -= B;
                sb.replace(1, 3, "-" + B);
            }
            if ("1".equals(Integer.toBinaryString(i).substring(2, 3))) {
                sum += C;
                sb.replace(3, 5, "+" + C);
            } else {
                sum -= C;
                sb.replace(3, 5, "-" + C);
            }
            if ("1".equals(Integer.toBinaryString(i).substring(1, 2))) {
                sum += D;
                sb.replace(5, 7, "+" + D);
            } else {
                sum -= D;
                sb.replace(5, 7, "-" + D);
            }
            if (sum==7) {
                System.out.println(sb);
                return;
            }
        }
    }
}