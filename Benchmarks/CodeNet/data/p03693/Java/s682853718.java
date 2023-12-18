import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        int x = 100 * r + 10 * g + b;
        boolean answer = x % 4 == 0;
        System.out.println(answer ? "YES" : "NO");
    }
}
