import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static final int MAXT = 1000000;
    static final int depth = 30;
    static final double eps = 1e-4;

    static int n, m, l;
    static int[] b, h, f, a, p, t;
    static int[] width;
    static double[] height;

    static int toIndex(int pos) {
        int x = 0;
        for (int i = 0; i < n + 1; ++i) {
            x += width[i];
            if (x > pos) {
                return i;
            }
        }
        return -1;
    }

    // ind番目の枠にvolumeの水を入れる
    static void pour(int ind, double volume) {
        int minH = Math.min(h[ind], h[ind + 1]);

        // 枠の中にまだ水が入る
        if (height[ind] < minH) {
            // 水全てが入る
            if ((minH - height[ind]) * width[ind] * depth >= volume) {
                height[ind] += volume / (width[ind] * depth);
            } else {
                double tmp = minH - height[ind];
                height[ind] = minH;
                // 残りの水を同じ枠内に入れる
                pour(ind, volume - tmp * width[ind] * depth);
            }
        } else {
            // 水面が同じ高さの枠のリスト
            ArrayList<Integer> range = range(ind, height[ind]);
            int leftInd = range.get(0), rightInd = range.get(range.size() - 1);
            double nHeight = height[range.get(0)];

            // 左側に水が入る場合
            if (leftInd - 1 >= 0 && h[leftInd] <= nHeight && height[leftInd - 1] < nHeight) {
                pour(leftInd - 1, volume);
            } else if (rightInd + 1 <= n && h[rightInd + 1] <= nHeight && height[rightInd + 1] < nHeight) {
                pour(rightInd + 1, volume);
            } else {
                //　全体に水を入れる
                double retVolume = pourRange(range, volume);
                if (retVolume > eps ) {
                    pour(ind, retVolume);
                }
            }
        }
    }

    // rangeの枠全てに水を入れる　入りきらなかった水の量を返す
    static double pourRange(ArrayList<Integer> range, double volume) {
        int leftInd = range.get(0), rightInd = range.get(range.size() - 1);
        int minH = Math.min(h[leftInd], h[rightInd + 1]);
        int allWidth = 0;
        for (Integer i: range) {
            allWidth += width[i];
        }

        if ((minH - height[range.get(0)]) * allWidth * depth >= volume) {
            for (Integer i: range) {
                height[i] += volume / (allWidth * depth);
            }
            return 0;
        } else {
            double tmp = minH - height[range.get(0)];
            for (Integer i: range) {
                height[i] = minH;
            }
            return volume - tmp * allWidth * depth;
        }
    }

    // ind番目の枠と同じ高さの連続する枠のリストを返す(並び替え済み)
    static ArrayList<Integer> range(int ind, double target) {
        ArrayList<Integer> ret = new ArrayList<>();
        ret.add(ind);

        // 左側
        for (int i = ind - 1; i >= 0; --i) {
            if (h[i + 1] > target || height[i] != target) {
                break;
            }
            ret.add(i);
        }
        // 右側
        for (int i = ind + 1; i <= n; ++i) {
            if (h[i] > target || height[i] != target) {
                break;
            }
            ret.add(i);
        }
        Collections.sort(ret);
        return ret;
    }

    // pairじゃないけど許して
    static class Pair implements Comparable<Pair> {
        int first;
        int second;
        int third;
        Pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public int compareTo(Pair o) {
            if (first == o.first) {
                return second - o.second;
            } else {
                return first - o.first;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int k = 0; k < count; ++k) {
            n = scanner.nextInt();
            b = new int[n + 2];
            h = new int[n + 2];
            height = new double[n + 1];
            width = new int[n + 1];

            b[0] = 0;
            b[n + 1] = 100;
            h[0] = 10000;
            h[n + 1] = 10000;

            for (int i = 1; i <= n; ++i) {
                b[i] = scanner.nextInt();
                h[i] = scanner.nextInt();

                width[i - 1] = b[i] - b[i - 1];
            }
            width[n] = b[n + 1] - b[n];

            m = scanner.nextInt();
            f = new int[m];
            a = new int[m];

            for (int i = 0; i < m; ++i) {
                f[i] = toIndex(scanner.nextInt());
                a[i] = scanner.nextInt();
            }

            l = scanner.nextInt();
            p = new int[l];
            t = new int[l];
            ArrayList<Pair> pairs = new ArrayList<>();

            for (int i = 0; i < l; ++i) {
                p[i] = toIndex(scanner.nextInt());
                t[i] = scanner.nextInt();
                pairs.add(new Pair(t[i], p[i], i));
            }

            Collections.sort(pairs);

            double[] ans = new double[l];

            for (int i = 0; i < l; ++i) {
                for (int j = 0; j < m; ++j) {
                    pour(f[j], a[j] * (pairs.get(i).first - (i == 0 ? 0 : pairs.get(i - 1).first)));
                }
                ans[pairs.get(i).third] = Math.min(50, height[pairs.get(i).second]);
            }

            for (int i = 0; i < l; ++i) {
                System.out.println(ans[i]);
            }
        }
    }
}

