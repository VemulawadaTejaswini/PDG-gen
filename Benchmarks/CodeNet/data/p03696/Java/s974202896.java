import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt() - 1;
        String s = scanner.next();
        int c1 = 0, c2 = 0;

        for (int i = n; i >= 0; i--) {
            if (s.charAt(i)== ')') {
                c1++;
            } else {
                c1 = Math.max(0, c1 - 1);
            }
            if (s.charAt(n - i) == '(') {
                c2++;
            } else {
                c2 = Math.max(0, c2 - 1);
            }
        }
        for (int i = 0; i < c1; i++)
            System.out.print('(');
        System.out.print(s);
        for (int i = 0; i < c2; i++)
            System.out.print(')');
        System.out.println();
    }
}