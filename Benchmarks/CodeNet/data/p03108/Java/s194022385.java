import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int islandCnt = sc.nextInt(); // N
        int bridgeCnt = sc.nextInt(); // M
        int[] startIsland = new int[bridgeCnt]; // A[i]
        int[] endIsland = new int[bridgeCnt]; // B[i]
        for (int i = 0; i < bridgeCnt; i++) {
            startIsland[i] = sc.nextInt();
            endIsland[i] = sc.nextInt();
            // 島をプログラミングの慣習に合わせて「0～N-1」で扱いたいので、ここで引いておく。
            startIsland[i]--;
            endIsland[i]--;
        }

        long[] answers = new long[bridgeCnt];
        IslandManager islandMgr = new IslandManager(islandCnt);
        //answers[bridgeCnt - 1] = islandMgr.getAns();
        for (int i = bridgeCnt - 1 ; i >= 0; i--) {
            answers[i] = islandMgr.getAns();
            islandMgr.mergeIslands(startIsland[i], endIsland[i]);
        }

        for (int i = 0; i < bridgeCnt; i++) {
            System.out.println(answers[i]);
        }
    }

    // 各島の「親の島番号」と「島群のサイズ」を管理する。
    private class IslandManager {
        int[] parent;
        int[] size;
        long ans; // 不便さ

        IslandManager(int num) {
            parent = new int[num];
            size = new int[num];
            for (int i = 0; i < num; i++) {
                parent[i] = i;
                size[i] = 1;
            }
            ans = (long) num * (num - 1) / 2;
        }

        // 一番上位の親の島番号を返す。
        private int findRoot(int islandNum) {
            if (parent[islandNum] == islandNum) {
                return islandNum;
            }
            else {
                // 他の人の回答では、ここが
                // parent[islandNum] = findParent(parent[islandNum]);
                // となっており、親の値の代入も同時に行っているが、こんなの無理、、、なので、別箇所で行う。
                int rootNum = findRoot(parent[islandNum]);
                return rootNum;
                //return parent[islandNum] = findRoot(parent[islandNum]);
            }
        }
        void mergeIslands(int islandNumX, int islandNumY) {
            int rootX = findRoot(islandNumX);
            int rootY = findRoot(islandNumY);
            // 同じルートを持っている島はマージする必要がないので、何もしない。
            if (rootX == rootY) return;

            // 違うルートを持つ島なので、マージ処理する。その際、ansも更新する。
            // マージすると、以下の分だけ不便さ(ans)が減る。
            ans -= (long) size[rootX] * size[rootY];

            if (size[rootX] < size[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            }
            else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
        }
        long getAns() {
            return ans;
        }


        private boolean hasSameRoot(int islandNumX, int islandNumY) {
            return findRoot(islandNumX) == findRoot(islandNumY);
        }

    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
