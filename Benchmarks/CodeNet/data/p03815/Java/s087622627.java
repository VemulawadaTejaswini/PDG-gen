import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println( solve(x) );
    }

    private static long solve(long x) {
        // 6 -> 5 -> 6 -> 5と実行するのがよい
        long d11 = x / 11;
        long r11 = x % 11;
        if( r11 == 0 ) return d11 * 2;

        if( r11 <= 6 ) {
            return d11 * 2 + 1;
        } else {
            return d11 * 2 + 2;
        }
    }
}
