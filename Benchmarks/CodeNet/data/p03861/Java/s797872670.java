import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long a = scan.nextLong();
        long b = scan.nextLong();
        long x = scan.nextLong();
        long answer = (long)Math.floor(b / x) - (long)Math.floor((a - 1) / x);
        System.out.println(answer);
    }
}
