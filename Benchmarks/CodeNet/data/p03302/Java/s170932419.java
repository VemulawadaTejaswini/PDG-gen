import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solve(a, b));
    }
    public static String solve(int a, int b) {
        if (a + b == 15) {
            return "+";
        }
        if (a * b == 15) {
            return "*";
        }
        return "x";
    }
}
