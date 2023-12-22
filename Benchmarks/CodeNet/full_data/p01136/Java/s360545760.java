import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[][] schedule = new boolean[32][50];
        long[][] map = new long[32][50];
        for (int i = 0; i < n; i++) {
            map[0][i] = 1 << i;
            int days = scan.nextInt();
            for (int j = 0; j < days; j++) {
                int day = scan.nextInt();
                schedule[day][i] = true;
            }
        }
        scan.nextInt();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < n; j++) {
                if (schedule[i][j]) {
                    for (int k = 0; k < n; k++) {
                        if (schedule[i][k])
                            map[i][j] |= map[i][k];
                    }
                }
                map[i+1][j] = map[i][j];
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == Math.pow(2, n)-1) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}