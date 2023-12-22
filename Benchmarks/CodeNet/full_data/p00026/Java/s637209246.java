import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

    public static void main(String[] args) throws Exception {

        exec();
    }

    private static void exec() throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String line; // 引数行
        int[][] dropPoint = null; // インキが滲んだ座標
        List<String> mapDropPointList = new ArrayList<String>(); // 10*10マップ座標リスト

        while ((line = br.readLine()) != null) {

            String[] input = line.split(",");

            int x = Integer.parseInt(input[0]); // x座標
            int y = Integer.parseInt(input[1]); // y座標
            int size = Integer.parseInt(input[2]); // インキ滴サイズ

            // サイズ毎にインキが滲む座標を計算
            if (size == 1) {
                dropPoint = getSmallDropPointArray(x, y);
            } else if (size == 2) {
                dropPoint = getMiddleDropPointArray(x, y);
            } else if (size == 3) {
                dropPoint = getLargeDropPointArray(x, y);
            }

            // インキが滲んだ紙の座標を計算
            mapDropPointList = getMapDropPointList(mapDropPointList, dropPoint);
        }

        // 結果を計算
        int[] result = writeDeepPoint(mapDropPointList);

        // 白紙座標と最も濃い座標を出力
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static List<String> getMapDropPointList(List<String> mapPointList, int[][] pointArray) {

        int index = 0;

        for (int point : pointArray[0]) {

            if ((point >= 0 && point < 10)
                && (pointArray[1][index] >= 0 && pointArray[1][index] < 10)) {

                String mapPoint = String.valueOf(point) + String.valueOf(pointArray[1][index]);
                mapPointList.add(mapPoint);
            }

            index++;
        }

        return mapPointList;
    }

    private static int[] writeDeepPoint(List<String> mapPointList) {

        Map<String, Integer> pointMap = new HashMap<String, Integer>();
        int deepPoint = 1;

        // 最も濃い座標を計算
        for (String point : mapPointList) {

            if (pointMap.containsKey(point)) {

                Integer number = pointMap.get(point);

                pointMap.remove(point);
                pointMap.put(point, number + 1);

                if (deepPoint < pointMap.get(point)) {

                    deepPoint = pointMap.get(point);
                }

            } else {

                pointMap.put(point, 1);
            }
        }

        // 滲んでいない座標数を計算
        int whitePoint = 100 - pointMap.size();

        int[] result = new int[] { whitePoint, deepPoint };

        return result;
    }

    private static int[][] getLargeDropPointArray(int x, int y) {

        int[][] largeDropPointArray;
        largeDropPointArray = new int[2][];

        // インキ滴（大）が滲む座標配列
        largeDropPointArray[0] =
            new int[] { x, x - 1, x, x + 1, x - 2, x - 1, x, x + 1, x + 2, x - 1, x, x + 1, x };
        largeDropPointArray[1] =
            new int[] { y - 2, y - 1, y - 1, y - 1, y, y, y, y, y, y + 1, y + 1, y + 1, y + 2 };

        return largeDropPointArray;
    }

    private static int[][] getMiddleDropPointArray(int x, int y) {

        int[][] middleDropPointArray;
        middleDropPointArray = new int[2][];

        // インキ滴（中）が滲む座標配列
        middleDropPointArray[0] = new int[] { x - 1, x, x + 1, x - 1, x, x + 1, x - 1, x, x + 1 };
        middleDropPointArray[1] = new int[] { y - 1, y - 1, y - 1, y, y, y, y + 1, y + 1, y + 1 };

        return middleDropPointArray;
    }

    private static int[][] getSmallDropPointArray(int x, int y) {

        int[][] smallDropPointArray;
        smallDropPointArray = new int[2][];

        // インキ滴（小）が滲む座標配列
        smallDropPointArray[0] = new int[] { x, x - 1, x, x + 1, x };
        smallDropPointArray[1] = new int[] { y - 1, y, y, y, y + 1 };

        return smallDropPointArray;
    }
}