import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int[] times = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(scanner.next());
            sum += times[i];
        }

        int M = Integer.parseInt(scanner.next());
        int[][] drinks = new int[M][2];
        for (int i = 0; i < M; i++) {
            int index = Integer.parseInt(scanner.next()) - 1; // 0基準にする
            int v = Integer.parseInt(scanner.next());

            drinks[i][0] = index;
            drinks[i][1] = v;
        }
        scanner.close();

        for (int i = 0; i < M; i++) {
            int timeIndex = drinks[i][0];
            int time = times[timeIndex];
            int newTime = drinks[i][1];

            System.out.println(sum - time + newTime);
        }
    }
}
