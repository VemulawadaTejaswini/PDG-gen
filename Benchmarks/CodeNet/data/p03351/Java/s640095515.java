import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println(solve(a,b,c,d));
    }
    public static String solve(int a, int b, int c, int d) {
        if (Math.abs(c-a) <= d) {
            return "Yes";
        }
        if (Math.abs(b-a) <= d && Math.abs(c-b) <= d) {
            return "Yes";
        }
        return "No";
    }
}
