import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long r = Math.round(Math.sqrt(n));
        System.out.println(r * r);
    }
}
