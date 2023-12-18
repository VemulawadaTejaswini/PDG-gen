import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();

        long ans = Long.MAX_VALUE;
        for(long i = l; i <= r; i++) {
            for(long j = i + 1; j <= r; j++) {
                ans = Math.min(ans, (i * j) % 2019);
                if(ans <= 0) break;
            }
        }

        System.out.println(ans);
    }
}