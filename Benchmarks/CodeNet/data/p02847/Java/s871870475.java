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
    final String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    public void solve(String S) {
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(S)) {
                System.out.println(7 - i);
                return;
            }
        }
    }
}

