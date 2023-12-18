import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] count = new int[1];
            dfs(1, N, 0, count, new int[8]);
            System.out.println(count[0]);
        }
    }

    private static void dfs(long i, long N, long number, int[] count, int[] used) {
        if (number > N) {
            return;
        }

        if (number >= 100 && number <= N && used[3] >= 1 && used[5] >= 1 && used[7] >= 1) {
            count[0]++;
        }

        for (int j = 3; j <= 7; j += 2) {
            used[j]++;
            dfs(i * 10, N, number + j * i, count, used);
            used[j]--;
        }
    }
}
