import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long cnt = (b-a) / x;
        cnt += a % x == 0 ? 1 : 0;

        System.out.println(cnt);
    }
}
