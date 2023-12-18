import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                if (left == 0) {
                    right++;
                } else {
                    left--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < right; i++) {
            sb.append("(");
        }
        sb.append(s);
        for (int i = 0; i < left; i++) {
            sb.append(")");
        }
        System.out.println(sb.toString());
    }
}