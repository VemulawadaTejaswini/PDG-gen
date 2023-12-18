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
    public void solve(String S) {
        for (int i = 0; i < S.length(); i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}

