import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * グラフのノードを表すクラス
 */
class Point implements Comparable<Point>{
    /** ID採番用 */
    public static int nextId = 0;

    /** ノードのID */
    public int id;
    /** ノードのX座標 */
    public int x;
    /** ノードのY座標 */
    public int y;
    /** ノードの属性（スタート、ゴールは-1） */
    public int type;
    /** スタートからの距離 */
    public int distanceFromStart;
    
    /** デフォルトコンストラクタ */
    public Point() {
        this(-1, -1, -1);
    }
    
    /**
     * コンストラクタ
     * 
     * @param x X座標
     * @param y Y座標
     * @param type 属性
     */ 
    public Point(int x, int y, int type) {
        init(x, y, type);
    }

    /**
     * 2ノード間の距離を計算する
     *
     * @param p 距離を計算する対象のノード
     * @return 計算した距離
     */
    public int distance(final Point p) {
        return abs(this.x - p.x) + abs(this.y - p.y);
    }

    /**
     * インスタンスの初期化
     * @param x X座標
     * @param y Y座標
     * @param type 属性
     */
    public void init(final int x, final int y, final int type){
        this.id = nextId++;
        this.x = x;
        this.y = y;
        this.type = type;
        this.distanceFromStart = Integer.MAX_VALUE;
    }
    
    /**
     * ノード同士の比較用メソッド
     * スタートからの距離で比較する。
     * @param p 比較対象のノード
     * @return 比較結果
     */
    @Override
    public int compareTo(final Point p) {
        return this.distanceFromStart - p.distanceFromStart;
    }

    /**
     * 数値の絶対値を計算する
     * 高速化のため、ビット演算を使用
     * 
     * @param n 対象の数値
     * @return 計算した絶対値
     */
    private static int abs(final int n) {
        int mask = n >> 31;
        return (n ^ mask) - mask;
    }
}

/**
 * メインクラス
 * 高速化のため、基本的にメンバーは全てstaticとする。
 */
public class Main {
    /** ファイル読み込み用のリーダ */
    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    /** スタート地点を表すノード */
    public static final Point start = new Point();
    /** ゴール地点を表すノード */
    public static final Point goal = new Point();

    /** ダイクストラで計算対象のノードを格納する優先度付キュー */
    public static final PriorityQueue<Point> q = new PriorityQueue<Point>();
    
    /** 各属性ごとのノードのリスト */
    public static final List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();

    static {
        //各属性用のリストを生成
        for(int i = 0; i < 5; i++) {
            pointListByType.add(new ArrayList<Point>());
        }
    }

    /**
     * エントリポイント
     */
    public static void main(String args[]) throws IOException {
        while(true) {
            //マップのサイズを読み込み
            String[] splittedStr = br.readLine().split(" ");
            final int x = Integer.parseInt(splittedStr[0]);
            final int y = Integer.parseInt(splittedStr[1]);
            
            //マップのサイズの幅と高さが両方0の場合は終了
            //幅、高さともに0以上の想定。
            if(x + y == 0) break;

            //ノード情報をクリア
            for(int i = 0; i < 5; i++) {
                pointListByType.get(i).clear();
            }
            Point.nextId = 0;

            //標準入力からマップの情報を読み込み
            for(int r = 0; r < y; r++){
                final char[] caray = br.readLine().toCharArray();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = caray[c];
                    if(pointLiteral == '.') {
                        continue;
                    } else if(pointLiteral == 'S') {
                        start.init(c, r, -1);
                        start.distanceFromStart = 0;
                    } else if(pointLiteral == 'G') {
                        goal.init(c, r, -1);
                    } else {
                        final int type = pointLiteral - '1';
                        pointListByType.get(type).add(new Point(c, r, type));
                    }
                }
            }

            //最短経路の検索を実施
            //最初に持つパチクリの属性ごとに最短経路を求め、最も短いものを解とする。
            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            for (int firstType = 0; firstType < 5; firstType++) { 
                final int shortestPathLen = searchShortestPath(firstType, minLen);

                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }

                //各ノードの計算用フィールドの初期化
                for(int i = 0; i < 5; i++) {
                    List<Point> tempPointList = pointListByType.get(i);
                    final int tempPointListSize = tempPointList.size();
                    for(int j = 0; j < tempPointListSize; j++) {
                        tempPointList.get(j).distanceFromStart = Integer.MAX_VALUE;
                    }
                }
                goal.distanceFromStart = Integer.MAX_VALUE;
            }

            //計算した最短経路の表示
            if(minLen == Integer.MAX_VALUE) {
                System.out.println("NA");
            } else {
                System.out.println((minLenType + 1) + " " + minLen);
            }
        }
    }

    /**
     * 最短経路探索
     * ダイクストラ法で最短経路を求める
     * 
     * @param firstType 最初に持つパチクリの属性
     * @param minLen これまでの最短経路
     * @return 探索した結果の最短距離
     */
    private static int searchShortestPath(int firstType, int minLen) {
        //最後に捕まえるべきパチクリの属性
        final int lastType = (firstType + 4) % 5;

        //探索用のキューを初期化
        q.clear();
        q.add(start);
        start.type = firstType;
        
        //探索実施（ダイクストラ法）
        while(!q.isEmpty()) {
            //探索済みのノードの内、スタートからの距離が最も近いものを取り出す
            final Point searchingPoint = q.poll();
 
            //これまでの最短距離以上の結果になっていれば、探索中断
            if(searchingPoint.distanceFromStart >= minLen) {
                return Integer.MAX_VALUE;
            }
            
            //取り出したノードがゴールの場合、探索完了
            if(searchingPoint.id == goal.id) {
                return goal.distanceFromStart;
            }
 
            if(searchingPoint.type == lastType) {
                //取り出したノードが最後に捕まえるべきパチクリの属性の場合、
                //次はゴールへ向かう
                final int distance = searchingPoint.distance(goal);
                final int searchinPointDistance = searchingPoint.distanceFromStart;
                if(goal.distanceFromStart > searchinPointDistance + distance) {
                    goal.distanceFromStart = searchinPointDistance + distance;
                    q.add(goal);
                }
            } else {
                //最後に捕まえるべき属性のパチクリ以外の場合、次の属性のノードを探索
                List<Point> nextPointList = pointListByType.get((searchingPoint.type + 1) % 5);
                int nextPointListSize = nextPointList.size();
                for(int i = 0; i < nextPointListSize; i++) {
                    Point tempNextPoint = nextPointList.get(i);
                    final int distance = searchingPoint.distance(tempNextPoint);
                    final int searchinPointDistance = searchingPoint.distanceFromStart;
                    final int tempDistance = searchinPointDistance + distance;
                    if(tempNextPoint.distanceFromStart > tempDistance) {
                        tempNextPoint.distanceFromStart = tempDistance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }
        
        //探索終了まえにキューが空になった場合、探索失敗
        return Integer.MAX_VALUE;
    }
}