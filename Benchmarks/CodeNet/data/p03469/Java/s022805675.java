import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] x = sc.next().toCharArray();
        x[3] = '8';
        System.out.println(x);
    }
}