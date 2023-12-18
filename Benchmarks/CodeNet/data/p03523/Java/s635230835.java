import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String S = sc.next();
        System.out.println(S.matches("A?KIHA?BA?RA?") ? "YES": "NO");
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}