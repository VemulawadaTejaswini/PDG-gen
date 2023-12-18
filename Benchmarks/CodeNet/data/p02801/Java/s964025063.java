import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);

        final Solver solver = new Solver();
        solver.solve(C);
    }
}

class Solver {
    public void solve(char C) {
        System.out.println((char) (C + 1));
    }
}

