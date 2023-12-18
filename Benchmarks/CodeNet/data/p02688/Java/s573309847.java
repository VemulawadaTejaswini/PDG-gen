import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] sunukes = new int[N];

        for (int i = 0; i < K; i++) {
            int temp = scanner.nextInt();
            for (int j = 0; j < temp; j++) {
                int sunuke = scanner.nextInt();
                sunukes[sunuke - 1]++;
            }
        }

        scanner.close();

        int ans = 0;
        for (int index : sunukes) {
            if (index == 0) {
                ans++;
            }
        }

        System.out.println(ans);

    }
}
