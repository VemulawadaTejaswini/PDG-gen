import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cityCount = sc.nextInt();
            int trainCount = sc.nextInt();
            int queryCount = sc.nextInt();

            int[] startPoint = new int[cityCount + 2];
            int[] endPoint = new int[cityCount + 2];
            // int[] cityPoint = new int[cityCount + 2];
            int[][] range = new int[cityCount + 2][cityCount + 2];
            for (int t = 0; t < trainCount; t++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                for (int i = 0; i <= l; i++) {
                    for (int j = r; j <= cityCount; j++) {
                        range[i][j]++;
                    }
                }
            }

            for (int q = 0; q < queryCount; q++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(range[l][r]);
            }

        }
    }
}
