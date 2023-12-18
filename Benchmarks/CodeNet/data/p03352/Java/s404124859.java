import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;

        // iが1の場合は何度かけても1となるので、初期値は2とする
        for (int b = 2; b <= x; b++) {
            int power = b * b;

            // pの初期値も同様
            for (int p = 2; ; p++) {
                if (power > x) {
                    break;
                }

                ans = Math.max(ans, power);

                power *= b;

            }

        }

        System.out.println(ans);

    }
}