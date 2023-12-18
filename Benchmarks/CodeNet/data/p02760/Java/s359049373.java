import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (numbers[j][k] == b) {
                        numbers[j][k] = 0;
                        break;
                    }
                }
            }
        }

        // 横判定
        for (int i = 0; i < 3; i++) {
            if (numbers[i][0] == 0 && numbers[i][1] == 0 && numbers[i][2] == 0) {
                System.out.println("Yes");
                return;
            }
        }

        // 縦判定
        for (int i = 0; i < 3; i++) {
            if (numbers[0][i] == 0 && numbers[1][i] == 0 && numbers[2][i] == 0) {
                System.out.println("Yes");
                return;
            }
        }

        // 斜め判定
        if (numbers[0][0] == 0 && numbers[1][1] == 0 && numbers[2][2] == 0) {
            System.out.println("Yes");
            return;
        }
        if (numbers[2][0] == 0 && numbers[1][1] == 0 && numbers[0][2] == 0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}