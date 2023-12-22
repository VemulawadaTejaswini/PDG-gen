import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (in.hasNext()) {
            int a = in.nextInt(), b = in.nextInt();
            String s = (a + b) + "";
            System.out.println(s.length());
        }
    }
}