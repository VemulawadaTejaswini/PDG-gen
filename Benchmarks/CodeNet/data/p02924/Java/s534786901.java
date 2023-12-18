import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        if (N < 4){
            switch (N) {
                case 1:
                    System.out.println(0); return;
                case 2:
                    System.out.println(1); return;
                case 3:
                    System.out.println(3); return;
            }
        }

        System.out.println(IntStream.rangeClosed(3, N - 1).sum() + 4);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}