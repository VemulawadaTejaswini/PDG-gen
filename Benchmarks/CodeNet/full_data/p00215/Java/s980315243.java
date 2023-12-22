import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * 各ポイント（スタート、ゴール、各パチモンの居る地点）を表すクラス
 */
class Point{
    /** ID採番用のstatic変数 */
    public static int nextId = 0;

    /** ポイントのID */
    public int id;

    /** ポイントのマップ上のx座標 */
    public int x;
    /** ポイントのマップ上のy座標 */
    public int y;
    /** パチモンの属性（0?4）もしくは-1（S、G） */
    public int type;
    /** スタート地点からの距離 */
    public int distanceFromStart;

    /**
     * コンストラクタ
     */
    public Point(int x, int y, int type) {
        this.id = nextId++;
        this.x = x;
        this.y = y;
        this.type = type;
        this.distanceFromStart = Integer.MAX_VALUE;
    }

    /** 距離を計算 */
    public int distance(Point p) {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }
}

/**
 * メインクラス
 */
public class Main {
    /** テキスト読み込み用のリーダ */
    public static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    /** スタート地点 */
    public static Point start = null;
    /** ゴール地点 */
    public static Point goal = null;

    //各属性ごとのパチモンのリストのリスト
    public static List<List<Point> > pointListByType =
            new ArrayList<List<Point> >();

    /** 火属性のパチモンリスト */
    public static List<Point> firePointList;
    /** 氷属性のパチモンリスト */
    public static List<Point> icePointList;
    /** 木属性のパチモンリスト */
    public static List<Point> treePointList;
    /** 土属性のパチモンリスト */
    public static List<Point> earthPointList;
    /** 水属性のパチモンリスト */
    public static List<Point> waterPointList;

    // スタティックイニシャライザ
    static {
        // 枠だけ用意しておく
        for(int i = 0; i < 5; i++) {
            pointListByType.add(new ArrayList<Point>());
        }
    }

    /** エントリポイント */
    public static void main(String args[]) throws IOException {
        while(true) {
            // マップサイズの行の読み込み
            String mapSizeStr = br.readLine();
            // 0 0なら終了
            if("0 0".equals(mapSizeStr)) break;

            String[] splittedStr = mapSizeStr.split(" ");
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);

            //属性ごとのポイントリストを初期化
            for(List<Point> pointList : pointListByType) {
                pointList.clear();
            }
            Point.nextId = 0;

            //マップの読み込み
            for(int r = 0; r < y; r++){
                String line = br.readLine();
                for(int c = 0; c < x; c++) {
                    char pointLiteral = line.charAt(c);
                    if(pointLiteral == 'S') {
                        //スタート地点　距離は固定で０
                        start = new Point(c, r, -1);
                        start.distanceFromStart = 0;
                    } else if(pointLiteral == 'G') {
                        //ゴール地点
                        goal = new Point(c, r, -1);
                    } else if(pointLiteral != '.') {
                        //各属性のパチモンの居るポイント
                        int type = (int)pointLiteral - (int)'1';
                        pointListByType.get(type).add(new Point(c, r, type));
                    }
                }
            }

            //各属性のポイントリストを更新
            firePointList = pointListByType.get(0);
            icePointList = pointListByType.get(1);
            treePointList = pointListByType.get(2);
            earthPointList = pointListByType.get(3);
            waterPointList = pointListByType.get(4);

            int minLenType = -1;
            int minLen = Integer.MAX_VALUE;
            // 各属性から始めた場合の最短経路をそれぞれ求める
            for (int firstType = 0; firstType < 5; firstType++) {
                 //最短経路探索
                int shortestPathLen = searchShortestPath(firstType);

                if(minLen > shortestPathLen) {
                    minLen = shortestPathLen;
                    minLenType = firstType;
                }

                // 探索で更新された値の初期化
                for(List<Point> pointList : pointListByType) {
                    for(Point p : pointList) {
                        p.distanceFromStart = Integer.MAX_VALUE;
                    }
                }
                goal.distanceFromStart = Integer.MAX_VALUE;
            }

            // 結果表示
            if(minLen == Integer.MAX_VALUE) {
                System.out.println("NA");
            } else {
                System.out.println((minLenType + 1) + " " + minLen);
            }
        }
    }

    /**
     * 最短経路探索処理
     * ダイクストラ法で探索する
     * 処理高速化のため、頂点集合の管理はフィボナッチヒープを使用
     */
    private static int searchShortestPath(int firstType) {
        // 最後に捕獲するパチモンの属性
        int lastType = (firstType + 4) % 5;

        PriorityQueue<Point> q = new PriorityQueue<Point>(
                            5002,
                            // 地点間の大小関係は、スタート地点から距離で比較する
                            new Comparator<Point>() {
                                @Override
                                public int compare(Point p1, Point p2) {
                                    return p1.distanceFromStart - p2.distanceFromStart;
                                }
                            }
                        );

        //初期化
        q.add(start);
        Point searchingPoint = start;
        start.type = firstType;

        while(!q.isEmpty()) {
            //スタート地点からの距離が最も近いものを頂点集合から削除し、
            //探索中のノードとする。
            searchingPoint = q.poll();

            //ゴールまで探索できたら、終了。
            if(searchingPoint.id == goal.id) return goal.distanceFromStart;

            // 最後に捕獲するパチモンの場合、次はゴールに向かう
            if(searchingPoint.type == lastType) {
                int distance = searchingPoint.distance(goal);
                int searchinPointDistance = searchingPoint.distanceFromStart;
                if(goal.distanceFromStart > searchinPointDistance + distance) {
                    goal.distanceFromStart = searchinPointDistance + distance;
                    q.add(goal);
                }
            } else {
                // 探索中のノードの属性の次の属性のパチモンを捕まえに行く。
                List<Point> nextPointList = pointListByType.get((searchingPoint.type + 1) % 5);
                for(Point tempNextPoint : nextPointList) {
                    int distance = searchingPoint.distance(tempNextPoint);
                    int searchinPointDistance = searchingPoint.distanceFromStart;
                    if(tempNextPoint.distanceFromStart > searchinPointDistance + distance) {
                        tempNextPoint.distanceFromStart = searchinPointDistance + distance;
                        q.add(tempNextPoint);
                    }
                }
            }
        }

        //ゴールにたどり着かずに探索が終了した場合は、到達不能と判断
        return Integer.MAX_VALUE;
    }
}   