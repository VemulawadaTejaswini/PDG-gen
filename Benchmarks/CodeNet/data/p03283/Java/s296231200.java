import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUp = sc.nextInt();
        int mUp = sc.nextInt();
        int qUp = sc.nextInt();
        int[][] lrArray = makeArray(mUp, sc);
        int[][] pqArray = makeArray(qUp, sc);
        for (int i = 0; i < mUp; i++) {
            int p = pqArray[i][0];
            int q = pqArray[i][1];
            int result = 0;
            for (int j = 0; j < 2;j++) {
                int l = lrArray[i][0];
                int r = lrArray[i][1];
                if (p <= l && r <= q) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    private static int[][] makeArray(int max, Scanner sc) {
        int[][] array = new int[max][2];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
}