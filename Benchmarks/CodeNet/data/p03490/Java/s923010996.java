import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String[] s = scanner.next().split("T");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        int i = 0;
        for (String t : s) {
            if (i++ % 2 == 0) {
                xList.add(t.length());
            } else {
                yList.add(t.length());
            }
        }
        boolean[][] dp1 = new boolean[xList.size() + 1][9000];
        dp1[0][0] = true;
        for (int j = 0; j < xList.size(); j++) {
            for (int k = 0; k < 9000; k++) {
                dp1[j + 1][k] |= dp1[j][k];
                if (k >= xList.get(j)) {
                    dp1[j + 1][k] |= dp1[j][k - xList.get(j)];
                }
            }
        }

        boolean[][] dp2 = new boolean[yList.size() + 1][9000];
        dp2[0][0] = true;
        for (int j = 0; j < yList.size(); j++) {
            for (int k = 0; k < 9000; k++) {
                dp2[j + 1][k] |= dp2[j][k];
                if (k >= yList.get(j)) {
                    dp2[j + 1][k] |= dp2[j][k - yList.get(j)];
                }
            }
        }
        System.out.println(dp1[xList.size()][x] && dp2[yList.size()][y] ? "Yes" : "No");
    }
}