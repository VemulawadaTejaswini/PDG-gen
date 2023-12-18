import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] sheet = new int[3][3];
        boolean[][] result = new boolean[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Integer[] vals = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            for (int j = 0; j < 3; j++) {
                sheet[i][j] = vals[j];
            }
        }
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int sheetVal = sheet[j][k];
                    if (sheetVal == val) {
                        result[j][k] = true;
                    }
                }
            }
        }

        sc.close();

        if ((result[0][0] == result[0][1] == result[0][2] == true)
                || (result[1][0] == result[1][1] == result[1][2] == true)
                || (result[2][0] == result[2][1] == result[2][2] == true)
                || (result[0][0] == result[1][0] == result[2][0] == true)
                || (result[0][1] == result[1][1] == result[2][1] == true)
                || (result[0][2] == result[1][2] == result[2][2] == true)
                || (result[0][0] == result[1][1] == result[2][2] == true)
                || (result[0][2] == result[1][1] == result[2][0] == true)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}