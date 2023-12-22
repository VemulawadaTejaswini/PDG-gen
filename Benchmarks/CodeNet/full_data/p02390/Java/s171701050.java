import java.util.Scanner;

public class Main {
    static final long MOD = 1_000_000_000 + 7;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int S = in.nextInt();
        int hh = S / 3600;
        int mm = (S % 3600) / 60;
        int ss = S % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}