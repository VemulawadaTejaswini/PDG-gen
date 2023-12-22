import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class FifteenPuzzleAstar {

    public static void main(String[] args) throws Exception {
        new FifteenPuzzleAstar();
    }

    //４方向探索用
    static final int[] dx = { 0, 1, 0, -1};
    static final int[] dy = {-1, 0, 1,  0};
    static final char[] dir = {'u', 'r', 'd', 'l'};

    static final int N = 4;          //盤サイズ
    static final int NN = N * N;     //パネル総数

    //各パネルのマンハッタン距離のテーブル
    static final int[][] MDTable = new int[NN][NN];
    static {
        for (int i = 0; i < NN; i++) {
            for (int j = 0; j < NN; j++) {
                MDTable[i][j] = getManhattanDistance(i % N, i / N, j % N, j / N);
            }
        }
    }

    //マンハッタン距離を求める
    static int getManhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public FifteenPuzzleAstar() {

        int[][] board = new int[][]{    //初期の盤の状態
            { 1, 7, 2, 4},
            { 6, 0,14, 3},
            {13,10,11, 8},
            { 5, 9,15,12},
        };  //rrdllldruuurdllddrurrd 22(手)

        String ans = astar(board);
        System.out.println(ans);
        System.out.println(ans.length());
    }

    //A*(A-star)で15パズルを解く
    String astar(int[][] board) {
        Set<String> done = new HashSet<String>();    //既出パターンチェック用
        Queue<Puzzle> q = new PriorityQueue<Puzzle>();

        Puzzle p = new Puzzle();
        p.setBoard(board);        //初期の盤の状態をセットする
        p.estimate = p.md;        //推定値
        q.add(p);
        done.add(p.toString());

        while (!q.isEmpty()) {
            p = q.poll();
            if (p.md == 0) {      //全てのパネルが揃ったら０
                return p.path;    //空白の移動経路
            }

            done.add(p.toString());
            int sx = p.space % N;    //空白の位置
            int sy = p.space / N;

            for (int i = 0; i < dx.length; i++) {
                int nx = sx + dx[i];    //空白の移動位置
                int ny = sy + dy[i];
                if (nx < 0 || N <= nx || ny < 0 || N <= ny) {    //範囲外
                    continue;
                }

                Puzzle p2 = p.clone();
                p2.changeSpace(nx, ny);   //空白と数字パネルを入れ替える（スライドする）
                if (!done.contains(p2.toString())) {    //既出パターンチェック
                    p2.cost++;            //手数
                    p2.estimate = p2.md + p2.cost;    //推定値
                    //p2.estimate = p2.md;    //推定値（実行速度を優先したいときはこっちにする）
                    p2.path += dir[i];    //空白の移動経路(移動方向の記録)
                    q.add(p2);
                }
            }
        }

        return "unsolvable";    //完成できなかったとき
    }

    //パズルの状態を保存する構造体（クラス）
    class Puzzle implements Cloneable, Comparable<Puzzle> {
        int[] panel = new int[NN];    //各位置にあるパネル番号(番号は１ベース)
        int space;                    //空白のインデクス
        int md;                       //全パネルのマンハッタン距離の合計
        int cost;                     //手数
        int estimate;                 //推定値
        String path = "";             //空白の移動経路(移動方向の記録)

        //盤の並びをセットする
        void setBoard(int[][] board) {
            int p = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 0) {   //空白
                        panel[p] = NN;        //空白は最大値にする
                        space = p;            //空白のインデクス
                    } else {
                        panel[p] = board[i][j];
                    }
                    p++;
                }
            }

            calcMD();    //全パネルのマンハッタン距離の合計を求める
        }

        //全パネルのマンハッタン距離の合計を求める
        void calcMD() {
            md = 0;
            for (int i = 0; i < NN; i++) {
                if (panel[i] != NN) {        //空白は除外する
                    md += MDTable[i][panel[i] - 1];    //番号は１ベース
                }
            }
        }

        //空白と数字パネルを入れ替える（スライドする）
        void changeSpace(int x, int y) {
            int index = x + y * N;           //インデクスに変換
            md += MDTable[space][panel[index] - 1];    //全パネル距離合計から移動後の数字パネル距離を足す(差分計算)
            md -= MDTable[index][panel[index] - 1];    //全パネル距離合計から現在の数字パネル距離を引く
            panel[space] = panel[index];    //数字パネルを交換(スライド)
            panel[index] = NN;              //空白を交換
            space = index;                  //空白のインデクス更新
        }

        //比較関数
        @Override
        public int compareTo(Puzzle o) {
            return this.estimate - o.estimate;    //推定値で小さい順
        }

        //盤の状態を文字列にする（既出パターンのキーとしても利用）
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(NN * 3);
            for (int i = 0; i < NN; i++) {
                if (i > 0) {
                    if (i % N == 0) {
                        sb.append("\n");
                    } else {
                        sb.append(" ");
                    }
                }
                sb.append(panel[i]);
            }
            return sb.toString();
        }

        //盤の状態を複製する
        @Override
        public Puzzle clone() {
            try {
                Puzzle obj = (Puzzle)super.clone();
                obj.panel = this.panel.clone();
                return obj;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException();
            }
        }
    }
}
