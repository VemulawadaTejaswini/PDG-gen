import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUp = sc.nextInt();
        int mUp = sc.nextInt();
        int qUp = sc.nextInt();
        int[][] lrArray = makeArray(mUp, sc);
        int[][] pqArray = makeArray(qUp, sc);
        for (int i = 0; i < qUp; i++) {
            int p = pqArray[i][0];
            int q = pqArray[i][1];
            int result = 0;
            for (int j = 0; j < mUp; j++) {
                int l = lrArray[j][0];
                int r = lrArray[j][1];
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
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        return array;
    }
}