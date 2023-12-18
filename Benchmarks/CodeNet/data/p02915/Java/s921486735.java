import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        System.out.println(N * N * N);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}