import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        long ans = Long.MAX_VALUE;
        for(int i = l; i < r; i++) {
            for(int j = i + 1; j <= r; j++) {
                ans = Math.min(ans, (i * j) % 2019);
            }
        }

        System.out.println(ans);
    }
}
