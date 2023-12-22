import java.util.*;
import java.util.function.Function;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    // public static String[] <T> ToStringArray(T[] arr) {
    // String[] res = new String[arr.length];
    // for(int i = 0; i < arr.length; ++i) {
    // res[i] = String.valueOf(arr[i]);
    // }

    // return res;
    // }

    private static List<Integer> asIntergerList(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }

        return intList;
    }

    private static int[][] deepCopy(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; ++i) {
            res[i] = arr[i].clone();
        }

        return res;
    }

    private static String asString(int[][] arr) {
        String str = new String();

        for (int i = 0; i < 2; ++i) {
            str += "" + arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
        }

        return str;
    }

    public static class Pair<A, B> {
        public A left;
        public B right;

        public Pair(A a, B b) {
            this.left = a;
            this.right = b;
        }
    }

    private static int n;
    private static int[] walls;
    private static int[] areas;
    private static int[] rates;
    private static double[] height;
    private static int[] groups;

    private static void unify(int lh, int rh) {
        while (rh > 0 && groups[rh - 1] == groups[rh])
            --rh;

        int g = groups[rh];

        for (int i = rh; i < n + 3 && groups[i] == g; ++i) {
            groups[i] = groups[lh];
        }
    }

    private static double getHeight(int idx) {
        while (idx > 0 && groups[idx - 1] == groups[idx])
            --idx;

        return height[idx];
    }

    private static double dfs(int idx, double volume, int ignored) {
        while (volume != 0.) {
            int lh = idx, rh = idx;

            while (lh > 0 && groups[lh - 1] == groups[idx])
                --lh;
            while (rh < n + 2 && groups[rh + 1] == groups[idx])
                ++rh;

            // System.out.printf("%d %f %d %d\n", idx, volume, lh, rh);

            int area = 0;
            for (int i = lh; i <= rh; ++i) {
                area += areas[i];
            }
            // System.out.println(area);

            int minHeight = Math.min(walls[lh], walls[rh + 1]);

            // System.out.printf("%d\n", minHeight);

            if (height[lh] < minHeight) {
                if ((minHeight - height[lh]) * area >= volume) {
                    height[lh] += volume / area;

                    return 0.;
                }

                volume -= (minHeight - height[lh]) * area;
                height[lh] = minHeight;
            }

            double res;
            if (minHeight == walls[lh]) {
                if (lh - 1 == ignored) {
                    return volume;
                }

                res = dfs(lh - 1, volume, lh);
            } else {
                if (rh + 1 == ignored) {
                    return volume;
                }

                res = dfs(rh + 1, volume, rh);
            }

            if (res == 0) {
                return 0.;
            }
            volume = res;

            if (minHeight == walls[lh]) {
                unify(lh - 1, lh);
            } else {
                unify(rh, rh + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        for (int mmm = 0; mmm < d; ++mmm) {
            n = scanner.nextInt();

            int[] B = new int[n + 2];
            int[] H = new int[n + 2];

            B[0] = 0;
            H[0] = 50;
            for (int i = 0; i < n; ++i) {
                B[i + 1] = scanner.nextInt();
                H[i + 1] = scanner.nextInt();
            }
            B[n + 1] = 100;
            H[n + 1] = 50;

            areas = new int[n + 3];
            groups = new int[n + 3];
            walls = new int[n + 4];
            rates = new int[n + 3];
            height = new double[n + 3];

            int prev = -10000000;

            walls[0] = 300000000;
            for (int i = 0; i < n + 2; ++i) {
                areas[i] = (B[i] - prev) * 30;
                walls[i + 1] = H[i];
                prev = B[i];
            }
            areas[n + 2] = 300000000;
            walls[n + 3] = 300000000;

            int m = scanner.nextInt();
            {
                for (int i = 0; i < m; ++i) {
                    int f = scanner.nextInt();
                    int a = scanner.nextInt();

                    int idx = 0;
                    while (B[idx] < f) {
                        ++idx;
                    }

                    rates[idx] += a;
                }
            }

            int L = scanner.nextInt();

            for (int q = 0; q < L; ++q) {
                int p = scanner.nextInt();
                int t = scanner.nextInt();

                int idx = 0;
                while (B[idx] < p) {
                    ++idx;
                }

                for (int i = 0; i < n + 3; ++i) {
                    height[i] = 0;
                    groups[i] = i;
                }

                for (int i = 0; i < n + 3; ++i) {
                    if (rates[i] != 0) {
                        dfs(i, rates[i] * t, -1);
                    }
                }

                System.out.printf("%.6f\n", getHeight(idx));
            }

        }
    }

}
