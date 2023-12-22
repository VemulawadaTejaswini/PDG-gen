import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 0026：Dropping Ink
 * 
 * @author MS14A
 * @version 2015/04/13
 */
public class Main {

    private static final int INK_SIZE_LARGE = 3;
    private static final int INK_SIZE_MIDDLE = 2;
    private static final int INK_SIZE_SMALL = 1;
    /**
     * 14×14マス分の要素を持つ2次元配列<br>
     * 
     * ※インクが端に落ちた場合のため、上下左右に2マス分ずつ 多く要素を持つ。
     */
    private static int cells[][] = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 入力読取り
        List<Integer[]> inks = getInkInformation();
        
        for(Integer[] ink : inks) {
            
            int x = ink[0] + 2;
            int y = ink[1] + 2;
            int size = ink[2];
            
            // インクのサイズで分類してマス目の値を増加
            if (size == INK_SIZE_SMALL) {
                sinkSmall(x, y);

            } else if (size == INK_SIZE_MIDDLE) {
                sinkMiddle(x, y);

            } else if (size == INK_SIZE_LARGE) {
                sinkLarge(x, y);

            }
        }

        int count = 0;
        int maxValue = 0;

        // 色のついていないマス目の個数と一番色の濃いマス目の値を求める
        for (int i = 2; i < 12; ++i) {
            for (int j = 2; j < 12; ++j) {
                if (cells[i][j] == 0) {
                    ++count;
                }
                if (maxValue <= cells[i][j]) {
                    maxValue = cells[i][j];
                }
            }
        }

        System.out.println(count);
        System.out.println(maxValue);

    }

    /**
     * サイズ：小のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkSmall(int x, int y) {
        ++cells[y][x];
        ++cells[y - 1][x];
        ++cells[y + 1][x];
        ++cells[y][x - 1];
        ++cells[y][x + 1];
    }

    /**
     * サイズ：中のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkMiddle(int x, int y) {
        sinkSmall(x, y);
        ++cells[y - 1][x - 1];
        ++cells[y - 1][x + 1];
        ++cells[y + 1][x - 1];
        ++cells[y + 1][x + 1];
    }

    /**
     * サイズ：大のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkLarge(int x, int y) {
        sinkMiddle(x, y);
        ++cells[y][x - 2];
        ++cells[y][x + 2];
        ++cells[y - 2][x];
        ++cells[y + 2][x];
    }

    /**
     * 標準入力を読取りインクの情報を取得する。<br>
     * 
     * ※Integer[0] = インクの中心のX座標 + 2 Integer[1] = インクの中心のY座標 + 2 Ingeter[2] =
     * インクのサイズ
     * 
     * @return インク情報
     * @throws IOException
     */
    private static List<Integer[]> getInkInformation() throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        List<Integer[]> inks = new ArrayList<Integer[]>();
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] nums = line.split(",");
            
            Integer[] ink = {
                    Integer.parseInt(nums[0]), 
                    Integer.parseInt(nums[1]) ,
                    Integer.parseInt(nums[2])
                    };
            
            inks.add(ink);
        }
        bufferedReader.close();
        streamReader.close();
        
        return inks;
    }
}