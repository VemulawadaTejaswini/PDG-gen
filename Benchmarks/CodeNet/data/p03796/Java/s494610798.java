import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long N;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
        }
        long E = 1000_000_007;
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result = (result * i) % E;
        }

        System.out.println(result);

    }

}
