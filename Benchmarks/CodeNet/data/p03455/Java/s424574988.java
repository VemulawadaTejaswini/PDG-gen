import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String solve = solve(a, b);
        System.out.println(solve);
    }

    public static String solve(int a, int b) {
        int multi = a * b;
        if (multi % 2 == 1) {
            return "Odd";
        }
        return "Even";
    }

}