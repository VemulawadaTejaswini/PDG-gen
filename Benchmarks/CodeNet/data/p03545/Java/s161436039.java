import java.util.*;

public class Main {

    static int A;
    static int B;
    static int C;
    static int D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        A = s.charAt(0) - '0';
        B = s.charAt(1) - '0';
        C = s.charAt(2) - '0';
        D = s.charAt(3) - '0';
        System.out.println( solve() );
    }

    private static String solve() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if( calc(calc(calc(A, B, i), C, j), D, k) == 7 ) {
                        return mkFormula(i, j, k);
                    }
                }
            }
        }
        throw new RuntimeException("wtf");
    }

    private static String mkFormula(int i, int j, int k) {
        StringBuilder b = new StringBuilder();
        b.append(Integer.toString(A));
        b.append(i == 0 ? "+" : "-");
        b.append(Integer.toString(B));
        b.append(j == 0 ? "+" : "-");
        b.append(Integer.toString(C));
        b.append(k == 0 ? "+" : "-");
        b.append(Integer.toString(D));
        b.append("=7");
        return b.toString();
    }

    private static int calc(int a, int b, int op) {
        if( op == 0 ) {
            return a + b;
        } else {
            return a - b;
        }
    }
}
