import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int Q = sc.nextInt();

        final Solver solver = new Solver();
        solver.solve(S, Q, sc);
    }
}

class Solver {
    public void solve(StringBuilder S, int Q, Scanner sc) {

        for (int i = 0; i < Q; i++) {
            int t = sc.nextInt();

            switch (t) {
                case 1:
                    S.reverse();
                    break;
                case 2:
                    int f = sc.nextInt();

                    switch (f) {
                        case 1:
                            S.insert(0, sc.next().charAt(0));
                            break;
                        case 2:
                            S.append( sc.next().charAt(0));
                            break;
                    }
                    break;
            }
        }

        System.out.println(S.toString());
    }
}


