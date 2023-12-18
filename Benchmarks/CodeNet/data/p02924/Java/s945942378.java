import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        System.out.println(N * (N - 1) / 2);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}
