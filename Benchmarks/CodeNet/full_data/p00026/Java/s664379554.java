import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /** フィールドサイズ[セル]：X */
    private static final int FIELD_SIZE_X = 10;

    /** フィールドサイズ[セル]：Y */
    private static final int FIELD_SIZE_Y = 10;

    /** 落とすインクとその後のフィールドの状態を保持するMap*/
    private static final Map<Integer, AbstractDropMode> droppedInkMap;

    static {
        // Mapの初期化
        droppedInkMap = new HashMap<Integer, Main.AbstractDropMode>();
        droppedInkMap.put(1, new StarMode(1));
        droppedInkMap.put(2, new SquareMode(1));
        droppedInkMap.put(3, new StarMode(2));
    }

    public static void main(String[] args) {
        try {
            // 場の初期化
            int[][] inkField = new int[FIELD_SIZE_X - 1][FIELD_SIZE_Y - 1];

            // input ループのためにScanner
            Scanner sc = new Scanner(System.in);

            // 入力に応じてインクを落とす
            while (sc.hasNext()) {
                String[] input = sc.next().split(",");
                int x = Integer.valueOf(input[0]);
                int y = Integer.valueOf(input[1]);
                int size = Integer.valueOf(input[2]);

                droppedInkMap.get(size).drop(inkField, x, y);
            }

            // 結果の主計
            System.out.println(countWhiteCells(inkField));
            System.out.println(getMostDroppedCount(inkField));

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    private static int countWhiteCells(int[][] inkField) {
        int result = 0;
        for (int[] xField : inkField) {
            for (int cell : xField) {
                result = cell == 0 ? result + 1 : result;
            }
        }
        return result;
    }

    private static int getMostDroppedCount(int[][] inkField) {
        int result = 0;
        for (int[] xField : inkField) {
            for (int cell : xField) {
                result = cell > result ? cell : result;
            }
        }
        return result;
    }

    private abstract static class AbstractDropMode {
        protected int size;

        AbstractDropMode(int size) {
            this.size = size;
        }

        public abstract void drop(int[][] inkField, int dropPointX,
                int dropPointY);

        protected boolean isOverField(int point, int diff, int lowerLimit,
                int upperLimit) {
            return((point + diff) < lowerLimit || (point + diff) >= upperLimit);
        }
    }

    /** 四角形にインクを落とす<br> x = ±size, y = ±sizeの範囲にインクが落ちる */
    private static class SquareMode extends AbstractDropMode {
        SquareMode(int size) {
            super(size);
        }

        @Override
        public void drop(int[][] inkField, int dropPointX, int dropPointY) {
            for (int x = -1 * this.size; x <= this.size; x++) {
                // フィールド外なら処理しない
                if (isOverField(dropPointX, x, 0, inkField.length)) {
                    continue;
                }

                for (int y = -1 * this.size; y <= this.size; y++) {
                    if (isOverField(dropPointY, y, 0,
                            inkField[dropPointX + x].length)) {
                        continue;
                    }

                    inkField[dropPointX + x][dropPointY + y]++;
                }
            }
        }
    }

    /** 星形にインクを落とす<br> x + y = ±sizeの範囲にインクが落ちる */
    private static class StarMode extends AbstractDropMode {
        StarMode(int size) {
            super(size);
        }

        @Override
        public void drop(int[][] inkField, int dropPointX, int dropPointY) {
            for (int x = -1 * this.size; x <= this.size; x++) {
                // フィールド外なら処理しない
                if (isOverField(dropPointX, x, 0, inkField.length)) {
                    continue;
                }

                for (int y = -1 * (this.size - Math.abs(x)); y <= (this.size - Math
                        .abs(x)); y++) {

                    if (isOverField(dropPointY, y, 0,
                            inkField[dropPointX + x].length)) {
                        continue;
                    }

                    inkField[dropPointX + x][dropPointY + y]++;
                }
            }
        }
    }

}