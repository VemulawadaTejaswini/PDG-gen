import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String s = sc.next();
        System.out.println(s.matches("[RUD]([LUD][RUD])+?[LUD]?") ? "Yes" : "No");
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}