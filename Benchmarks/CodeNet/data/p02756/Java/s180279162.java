import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                S = reverseString(S);
            } else {
                int F = sc.nextInt();
                String C = sc.next();
                S = (F == 1)? C + S : S + C;
            }
        }
        System.out.println(S);
    }

    public static String reverseString(String S) {
        StringBuffer str = new StringBuffer(S);
        return str.reverse().toString();
    }
}
