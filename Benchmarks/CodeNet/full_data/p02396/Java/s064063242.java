import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        for (int i = 1, x = in.nextInt(); 
                x != 0; 
                i++, x = in.nextInt()) {
            System.out.printf("Case %d: %d\n", i, x);
        }
    }
}