import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        String T;
        T = sc.next();

        final Solver solver = new Solver();
        solver.solve(S, T);
    }
}

class Solver {
    public void solve(String S, String T) {
        System.out.println(T + S);
    }
}

