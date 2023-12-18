import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        System.out.println(solve(a, b, c, k));
    }

    static int solve(int a, int b, int c, int k) {
        int max = Math.max(Math.max(a, b), c);
        return (a + b + c - max) + max * (int)Math.pow(2, k);

    }
}