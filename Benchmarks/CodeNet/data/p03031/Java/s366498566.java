import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        scanner.nextLine();

        final int[][] switchIndices = new int[m][n];
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();

            for (int j = 0; j < k; j++) {
                switchIndices[i][scanner.nextInt() - 1] = 1;
            }

            scanner.nextLine();
        }

        final int[] mods = new int[m];
        for (int i = 0; i < m; i++) {
            mods[i] = scanner.nextInt();
        }

        int successCount = 0;

        for (int i = 0; i < Math.pow(2, n); i++) {
            boolean lightAll = true;
            for (int j = 0; j < m; j++) {
                lightAll &= checkLight(switchIndices[j], mods[j], i);
            }

            successCount += lightAll ? 1 : 0;
        }

        System.out.println(successCount);
    }

    private static boolean checkLight(int[] switchIndex, int mod, int switchStatus) {
        int switchCount = 0;
        for (int i = 0; i < switchIndex.length; i++) {
            if (switchIndex[i] == 0) continue;

            if ((switchStatus >> i) % 2 == 1) {
                switchCount++;
            }
        }

        return switchCount % 2 == mod;
    }
}