import java.util.*;

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

    private static int dfs(int y, int x, int[][] arr) {
        int[] dy = { -1, 1, 0, 0, 1, 1, -1, -1 };
        int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };

        if (arr[y][x] == 0) {
            return 0;
        }

        arr[y][x] = 0;
        for (int i = 0; i < 8; ++i) {
            int py = y + dy[i], px = x + dx[i];

            if (py < 0 || py >= arr.length || px < 0 || px >= arr[0].length) {
                continue;
            }

            if (arr[py][px] == 1) {
                dfs(py, px, arr);
            }
        }
        return 1;
    }

    public static class Pair<A, B> {
        public A left;
        public B right;

        public Pair(A a, B b) {
            this.left = a;
            this.right = b;
        }
    }

    public static int m, n;

    public static int[] arr;
    public static int[] dp;

    public static int[] asArray(int stat) {
        int[] stata = new int[m];
        for (int i = 0; i < m; ++i, stat /= 3) {
            stata[i] = stat % 3;
        }

        return stata;
    }

    public static int asInt(int[] stata) {
        int ans = 0;
        int t = 1;
        for (int i = 0; i < stata.length; ++i, t *= 3) {
            ans += t * stata[i];
        }

        return ans;
    }

    public static ArrayList<Integer> getGroup(int[] stata) {
        ArrayList<Integer> candidates = new ArrayList<Integer>();
        nextCand: for (int i = 0; i < n; ++i) {
            for (int j = 0; j < stata.length; ++j) {
                if (stata[j] != 2) {
                    if (((arr[i] >> j) & 1) != stata[j]) {
                        continue nextCand;
                    }
                }
            }

            candidates.add(arr[i]);
        }

        return candidates;
    }

    // Stat
    public static int func(int stat) {
        if (dp[stat] != -1) {
            return dp[stat];
        }

        int[] stata = asArray(stat);
        ArrayList<Integer> currentGroup = getGroup(stata);

        if (currentGroup.size() <= 1) {
            return 0;
        }

        int ans = 1000000;
        for (int i = 0; i < m; ++i) {
            if (stata[i] == 2) {
                stata[i] = 0;
                int ans0 = func(asInt(stata));
                stata[i] = 1;
                int ans1 = func(asInt(stata));
                stata[i] = 2;

                int tmp = Math.max(ans0, ans1) + 1;

                if (tmp < ans) {
                    ans = tmp;
                }
            }
        }

        dp[stat] = ans;
        return ans;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            m = scanner.nextInt();
            n = scanner.nextInt();

            if (m == 0 && n == 0) {
                return;
            }
            arr = new int[n];

            for (int i = 0; i < n; ++i) {
                String s = scanner.next();
                // System.out.println(s);

                int v = 0;
                for (int j = 0; j < m; ++j) {
                    if (s.charAt(j) == '1') {
                        v |= (1 << j);
                    }
                }
                arr[i] = v;
            }

            dp = new int[200000];

            for (int i = 0; i < dp.length; ++i) {
                dp[i] = -1;
            }
            int[] stata = new int[m];
            for (int i = 0; i < m; ++i) {
                stata[i] = 2;
            }

            System.out.println(func(asInt(stata)));
        }
    }

}
