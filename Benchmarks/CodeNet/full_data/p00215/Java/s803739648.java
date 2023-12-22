import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 && y == 0) {
                break;
            }

            Pachimon pachimon = new Pachimon();
            for (int fy = 0; fy < y; fy++) {
                String in = sc.next();

                for (int fx = 0; fx < x; fx++) {
                    char c = in.charAt(fx);

                    switch (c) {
                    case 'S':
                        pachimon.setStart(pos(fx, fy));
                        break;
                    case 'G':
                        pachimon.setGoal(pos(fx, fy));
                        break;
                    case '.':
                        break;
                    default:
                        pachimon.addPachimon(Character.getNumericValue(c) - 1,
                                pos(fx, fy));
                        break;
                    }
                }
            }

            pachimon.search();

        }
    }

    /** 場所 */
    public static int pos(int x, int y) {
        return (x << 11) + y;
    }

    private static class Pachimon {
        private List<List<Integer>> pachimon = new ArrayList<List<Integer>>();

        private Integer s;

        private Integer g;

        private static int INF = Integer.MAX_VALUE;

        public Pachimon() {
            for (int i = 0; i < 5; i++) {
                this.pachimon.add(new ArrayList<Integer>());
            }
        }

        public void setStart(Integer s) {
            this.s = s;
        }

        public void setGoal(Integer g) {
            this.g = g;
        }

        public void addPachimon(int elem, Integer pos) {
            this.pachimon.get(elem).add(pos);
        }

        public void search() {

            int start = -1;
            int dist = INF;

            // 属性ごとにループ
            for (int i = 0; i < 5; i++) {
                // DPの初期化 DP[属性][同じ属性内の連番]
                int[][] dp = new int[5][1000];
                for (int h = 0; h < 5; h++) {
                    Arrays.fill(dp[h], INF);
                }

                // 最初に選んだパチモンから次に捕まえられる属性番号
                int first = (i + 1) % 5;

                for (int j = 0; j < this.pachimon.get(first).size(); j++) {
                    // s→e1を計算
                    dp[first][j] = dist(this.s, this.pachimon.get(first).get(j));
                }

                // s->1->2->3->4->g
                // なので、ループは間の-> * 3分まわす
                for (int e = 0; e < 3; e++) {
                    // ex->e(x+1)
                    int now = (first + e) % 5;
                    int next = (now + 1) % 5;
                    for (int j = 0; j < this.pachimon.get(now).size(); j++) {
                        for (int k = 0; k < this.pachimon.get(next).size(); k++) {
                            dp[next][k] = min(
                                    dp[next][k],
                                    add(dp[now][j],
                                            dist(this.pachimon.get(now).get(j),
                                                    this.pachimon.get(next)
                                                            .get(k))));
                        }
                    }
                }

                int last = (first + 3) % 5;
                for (int j = 0; j < this.pachimon.get(last).size(); j++) {
                    // e4->g
                    int d = add(dp[last][j],
                            dist(this.pachimon.get(last).get(j), this.g));

                    if (d < dist) {
                        dist = d;
                        start = i + 1;
                    }

                }

            }
            if (dist == INF) {
                System.out.println("NA");
            } else {
                System.out.println(start + " " + dist);
            }

        }

        private int dist(int from, int to) {
            return abs((from >> 11) - (to >> 11))
                    + abs((from & 2047) - (to & 2047));
        }

        private int abs(int v) {
            return (v ^ (v >> 31)) - (v >> 31);
        }

        private int min(int x, int y) {
            int t = (x - y);
            return y + (t & (t >> 31));
        }

        private int add(int x, int y) {
            if (x == INF || y == INF) {
                return INF;
            }
            return x + y;
        }

    }

}