import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        System.out.println(IntStream.rangeClosed(1, N - 1).sum());
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}