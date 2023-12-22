import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            long mod = n % 26;
            sb.append((char) ('a' + mod));
            n /= 26;
        }
        System.out.println(sb.reverse().toString());
    }
}