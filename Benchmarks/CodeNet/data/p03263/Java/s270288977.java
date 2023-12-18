
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //		new Main().solveA();
        //		new Main().solveB();
//		new Main().solveC();
        new Main().solveD();
//        new Main().solveDSample();
    }

    private void solveA() {
        Scanner scanner = null;
        int numA = 0;
        int numB = 0;

        try {
            scanner = new Scanner(System.in);
            numA = scanner.nextInt();
            numB = scanner.nextInt();
            for (int i = 1; i < 4; i++) {
                if (numA * numB * i % 2 != 0) {
                    System.out.println("Yes");
                    return;
                }
            }

            System.out.println("No");

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private void solveB() {
        Scanner scanner = null;
        int numN = 0;

        try {
            scanner = new Scanner(System.in);
            numN = scanner.nextInt();
            String[] wk = new String[numN];

            Set<String> wkSet = new HashSet<String>();
            for (int i = 0; i < wk.length; i++) {
                String wkI = scanner.next();
                wk[i] = wkI;
                if (wkSet.contains(wk[i])) {
                    System.out.println("No");
                    return;
                }
                wkSet.add(wk[i]);
                if (i != 0) {
                    String wkIm1 = wk[i - 1];
                    if (wkIm1.charAt(wkIm1.length() - 1) != wkI.charAt(0)) {
                        System.out.println("No");
                        return;
                    }

                }
            }

            System.out.println("Yes");

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private void solveC() {
        Scanner scanner = null;
        int numN = 0;
        int numX = 0;

        try {
            scanner = new Scanner(System.in);
            numN = scanner.nextInt();
            numX = scanner.nextInt();
            long[] wk = new long[numN + 1];

            wk[0] = numX;
            for (int i = 1; i < wk.length; i++) {
                wk[i] = scanner.nextInt();
            }

            Arrays.sort(wk);
            long[] wkSa = new long[numN];
            for (int i = 0; i < wk.length; i++) {
                if (i != 0) {
                    wkSa[i - 1] = wk[i] - wk[i - 1];
                }
            }

            System.out.println(maxKouyakusu(wkSa));

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private long maxKouyakusu(long[] wk) {

        long res = 0;
        for (int i = 0; i < wk.length; i++) {
            if (i == 0) {
                res = wk[i];
                continue;
            }
            res = maxKouyakusu(res, wk[i]);
        }
        return res;

    }

    private long maxKouyakusu(long i1, long i2) {

        long w1 = Math.min(i1, i2);
        long w2 = Math.max(i1, i2);

        while (w2 > 0) {
            long temp = w1 % w2;
            w1 = w2;
            w2 = temp;
        }

        return w1;

    }

    private void solveDSample() {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            int[][] a = new int[w][h];
            int[][] b = new int[w][h];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    a[j][i] = sc.nextInt();
                    b[j][i] = a[j][i];
                }
            }

            int c = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w - 1; j++) {
                    if (a[j][i] % 2 == 1) {
                        a[j][i]--;
                        a[j + 1][i]++;
                        c++;
                    }
                }
            }

            for (int i = 0; i < h - 1; i++) {
                if (a[w - 1][i] % 2 == 1) {
                    a[w - 1][i]--;
                    a[w - 1][i + 1]++;
                    c++;
                }
            }

            System.out.println(c);

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w - 1; j++) {
                    if (b[j][i] % 2 == 1) {
                        b[j][i]--;
                        b[j + 1][i]++;
                        System.out.println((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
                    }
                }
            }

            for (int i = 0; i < h - 1; i++) {
                if (b[w - 1][i] % 2 == 1) {
                    b[w - 1][i]--;
                    b[w - 1][i + 1]++;
                    System.out.println((i + 1) + " " + w + " " + (i + 2) + " " + w);
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    private void solveD() {
        Scanner scanner = null;
        int h = 0;
        int w = 0;

        try {
            scanner = new Scanner(System.in);
            h = scanner.nextInt();
            w = scanner.nextInt();
            int[][] grid = new int[h][w];
            int[] odd = new int[h];
            for (int i = 0; i < h; i++) {
                int num = 0;
                for (int j = 0; j < w; j++) {
                    grid[i][j] = scanner.nextInt();
                    num += (grid[i][j] % 2);
                }
                odd[i] = num;
            }
            int cnt = 0;

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < h; i++) {

                boolean isStart = false;
                for (int j = 0; j < w - 1; j++) {
                    if (grid[i][j] % 2 != 0) {
                        isStart = true;
                    }
                    if (isStart) {
                        grid[i][j]--;
                        grid[i][j + 1]++;
                        cnt++;
                        builder.append(getResStr(i, j, i, j + 1));
                        if (grid[i][j + 1] % 2 == 0)
                            isStart = false;
                    }
                }
            }
            boolean isStart = false;
            for (int i = 0; i < h - 1; i++) {

                if (grid[i][w - 1] % 2 != 0) {
                    isStart = true;
                }
                if (isStart) {
                    grid[i][w - 1]--;
                    grid[i + 1][w - 1]++;
                    cnt++;
                    builder.append(getResStr(i, w - 1, i + 1, w - 1));
                    if (grid[i + 1][w - 1] % 2 == 0)
                        isStart = false;
                }
            }
            System.out.println(cnt);
            System.out.println(builder.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private String getResStr(int i, int j, int wI, int wJ) {
        StringBuilder builder = new StringBuilder();
        return builder.append(i + 1).append(" ").append(j + 1).append(" ").append(wI + 1).append(" ").append(wJ + 1).append(System.lineSeparator()).toString();
    }
}