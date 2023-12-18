import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    int count = Math.max(Math.max(i, j), k);
                    while (count > 0) {
                        if (i % count == 0 && j % count == 0 && k % count == 0) {
                            sum += count;
                            break;
                        }
                        count--;
                    }
                }
            }
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}