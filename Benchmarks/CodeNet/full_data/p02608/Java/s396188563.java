
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(calcN(i));
        }

    }

    private static int calcN(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                for (int z = 1; z <= n; z++) {
                    if (((x * x) + (y * y) + (z * z) + ((x * y) + ((y * z) + (z * x)))) == n) {
                        sum++;
                    }
                }

            }
        }
        return sum;
    }

}
