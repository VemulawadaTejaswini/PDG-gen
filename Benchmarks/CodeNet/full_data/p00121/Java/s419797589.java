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

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        try {
            Queue<int[][]> que = new ArrayDeque<int[][]>();
            Map<String, Integer> used = new TreeMap<String, Integer>();

            int[][] first = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 } };
            // int[][] first = { Arrays.copyOfRange(input, 0, 4), Arrays.copyOfRange(input,
            // 4, 8) };
            used.put(asString(first), 0);
            que.add(first);

            while (true) {
                int[][] stat = que.poll();

                if (stat == null) {
                    break;
                }

                final String str = asString(stat);
                final int step = used.get(str);

                for (int i = 0; i < 2; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        if (stat[i][j] != 0) {
                            continue;
                        }

                        for (int k = 0; k < 4; ++k) {
                            int px = j + dx[k];
                            int py = i + dy[k];

                            if (px < 0 || px >= 4 || py < 0 || py >= 2) {
                                continue;
                            }
                            int[][] copied = deepCopy(stat);

                            copied[py][px] = copied[py][px] ^ copied[i][j];
                            copied[i][j] = copied[py][px] ^ copied[i][j];
                            copied[py][px] = copied[py][px] ^ copied[i][j];

                            String s = asString(copied);
                            if (used.containsKey(s)) {
                                continue;
                            }

                            used.put(s, step + 1);
                            que.add(copied);
                        }

                        break;
                    }
                }
            }

            while (true) {
                int[] input = inputIntArray(8);

                int[][] stat = { Arrays.copyOfRange(input, 0, 4), Arrays.copyOfRange(input, 4, 8) };

                System.out.println(used.get(asString(stat)));
            }

        } catch (Exception e) {
            // do nothing
            // zthrow e;
        }
    }
}

