
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int array[][] = new int[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = sc.nextInt();
                }
            }

            int n = sc.nextInt();

            int target[] = new int[n];
            for (int i = 0; i < n; i++) {
                target[i] = sc.nextInt();
            }

            String result = "No";

            int check[][] = new int[3][3];
            a: for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k : target) {
                        if (array[i][j] == k) {
                            check[i][j] = 1;

                            if (bingo(check)) {
                                result = "Yes";
                                break a;
                            }
                        }
                    }
                }
            }

            System.out.println(result);

        }
    }

    private static boolean bingo(int[][] data) {

        boolean result = false;

        for (int[] a : data) {
            // 横
            boolean test = true;
            for (int b : a) {
                if (b == 0) {
                    test = false;
                    break;
                }
            }
            if (test) {
                return true;
            }

        }

        // 縦
        for (int i = 0; i < 3; i++) {
            boolean test = true;
            for (int j = 0; j < 3; j++) {
                if (data[j][i] == 0) {
                    test = false;
                    break;
                }
            }
            if (test) {
                return true;
            }
        }

        // 斜め
        boolean test = true;
        for (int i = 0; i < 3; i++) {
            if (data[i][i] == 0) {
                test = false;
                break;
            }
        }
        if (test) {
            return true;
        }

        int cnt = 0;
        test = true;
        for (int i = 2; i >= 0; i--) {
            if (data[i][cnt] == 0) {
                test = false;
                break;
            }
            cnt++;
        }
        if (test) {
            return true;
        }

        return result;
    }
}
