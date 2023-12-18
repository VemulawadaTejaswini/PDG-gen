import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(S);
    }
}

class Solver {
    static final String YES = "Yes";
    static final String NO = "No";

    public void solve(String S) {
        if (S.length() % 2 != 0) {
            System.out.println(YES);
            return;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (i % 2 == 0 && c != 'h') {
                System.out.println(NO);
                return;
            }
            if (i % 2 != 0 && c != 'i') {
                System.out.println(NO);
                return;
            }
        }
        System.out.println(YES);
    }
}

