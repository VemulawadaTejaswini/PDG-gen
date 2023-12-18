import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long x = scan.nextLong();
        long a = x / 11;
        long b = x % 11;
        long answer = a * 2 + (b <= 6 ? 1 : 2);
        System.out.println(answer);
    }
}
