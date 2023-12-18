import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        int cnt = 0;
        // A[i+1]はもっとも小さいA[i]の倍数にする=2をかけていく
        for (double i = Y; (int) i >= X ; i = i / 2) {
            cnt++;
        }

        System.out.println(cnt);
    }
}
