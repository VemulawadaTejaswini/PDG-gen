import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int plugs = in.nextInt();
        int expected = in.nextInt();
        System.out.println((int) Math.ceil(expected / (double) plugs));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}