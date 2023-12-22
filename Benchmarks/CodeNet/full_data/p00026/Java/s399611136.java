import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0026：Dropping Ink
 * 
 * @author MS14A
 * @version 2015/04/13
 */
public class Main {

    private static int cells[][] = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    private static int count = 0;

    private static int maxValue = 0;

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] nums = line.split(",");

            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            int size = Integer.parseInt(nums[2]);

            // インクのサイズで分類してマス目の値を増加
            if (size == 1) {
                sinkSmall(x, y);

            } else if (size == 2) {
                sinkMiddle(x, y);

            } else if (size == 3) {
                sinkLarge(x, y);

            }
        }

        // 色のついていないマス目の個数と一番色の濃いマス目の値を求める
        for (int i = 2; i < 13; ++i) {
            for (int j = 2; j < 13; ++i) {
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
     * @param x
     * @param y
     */
    private static void sinkLarge(int x, int y) {
        sinkMiddle(x, y);
        ++cells[y][x - 2];
        ++cells[y][x + 2];
        ++cells[y - 2][x];
        ++cells[y + 2][x];
    }

    /**
     * @param x
     * @param y
     */
    private static void sinkMiddle(int x, int y) {
        sinkSmall(x, y);
        ++cells[y - 1][x - 1];
        ++cells[y - 1][x + 1];
        ++cells[y + 1][x - 1];
        ++cells[y + 1][x + 1];
    }

    /**
     * @param x
     * @param y
     */
    private static void sinkSmall(int x, int y) {
        ++cells[y][x];
        ++cells[y - 1][x];
        ++cells[y + 1][x];
        ++cells[y][x - 1];
        ++cells[y][x + 1];
    }

}