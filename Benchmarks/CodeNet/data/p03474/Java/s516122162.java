import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        char[] ans = S.toCharArray();
        int A1 = 0;
        int A2 = 0;
        if ('-' == S.charAt(A + 1)) {
            for (int i = 0; A > i; i++) {
                if (0 <= ans[i] && 9 >= ans[i]) {

                } else {
                    A1 = 1;
                    break;
                }
            }
            for (int j = 0; B > j; j++) {
                if (0 <= ans[A + 1 + j] && 9 >= ans[A + 1 + j]) {

                } else {
                    A2 = 1;
                    break;
                }
            }
        } else {
            A1 = 1;
            A2 = 1;
        }
        if (A1 == 0 && A2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}