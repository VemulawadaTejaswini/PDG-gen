import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(solve2(N));
    }

    private static long solve2(int N) {
        long count = 0;

        int[][] list = new int[10][10];
        for (int i=1; i<=N; i++) {
            int top = String.valueOf(i).charAt(0) - '0';
            list[top][i%10]++;
        }

        for (int a=0; a<10; a++) {
            for (int b=0; b<10; b++) {
                count += list[a][b]*list[b][a];
            }
        }

        return count;
    }
}