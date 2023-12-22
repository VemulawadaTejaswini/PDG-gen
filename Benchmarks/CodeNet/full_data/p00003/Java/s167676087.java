import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 0003：Is it a Right Triangle?
 * 
 * @author Lyu
 * @version 2015/07/12
 */
public class Main {

    /** 区切り文字：スペース */
    private static final String DELIMITER_SPACE = " ";
    
    /** 直角三角形の場合の出力文字列 */
    private static final String RESULT_RIGHT_TRIANGLE = "YES";
    
    /** 直角三角形出ない場合の出力文字列 */
    private static final String RESULT_NOT_RIGHT_TRIANGLE = "NO";

    /**
     * データセットで与えられた数を3辺とする三角形が直角三角形かを判断する。
     * 
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<String[]> dataSets = getInput();

        for (int i = 0; i < dataSets.size(); ++i) {
            System.out.println(getResult(dataSets.get(i)));
        }
    }

    /**
     * 各データセットで与えられた3辺で形成される三角形が、<br>
     * 直角三角形なら「YES」、直角三角形でないなら「NO」を返す。
     * 
     * @param dataSet データセット
     * @return 三角形が直角三角形となるなら「YES」、直角三角形とならないなら「NO」
     */
    private static String getResult(String[] dataSet) {
        // 読み取ったデータセットをint型の配列に変換
        int[] lengths = toIntArray(dataSet);
        
        // 最も長い辺を求めるため、配列を昇順ソート
        Arrays.sort(lengths);

        boolean isRightTriangle = (getSquare(lengths[2]) == getSquare(lengths[0]) + getSquare(lengths[1]));
        
        if (isRightTriangle) {
            return RESULT_RIGHT_TRIANGLE;
        } else {
            return RESULT_NOT_RIGHT_TRIANGLE;
        }
    }
    
    /**
     * String型の配列をint型の配列に変換する。
     * 
     * @param stringArray 変換対象のString型配列
     */
    private static int[] toIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

//    /**
//     * 与えられた3辺を持つ三角形が直角三角形かどうかを求める。
//     * 
//     * @param longestSide 長辺
//     * @param shortestSide その他の辺
//     * @param middleSide その他の辺
//     * @return 直角三角形なら true、それ以外なら false
//     */
//    private static boolean isRightTriangle(int longestSide, int shortestSide, int middleSide) {
//        if (getSquare(longestSide) == getSquare(shortestSide) + getSquare(middleSide)) {
//            return true;
//        }
//        return false;
//    }
    
    /**
     * 引数の2乗を求める。
     * 
     * @param target 2乗する整数
     * @return 2乗した整数
     */
    private static int getSquare(int target) {
        return target*target;
    }

    /**
     * 標準入力を読み取る。<br>
     * データセットの各行は、区切り文字により分割した配列としてリストに格納する。
     * 
     * @return データセットの各行を格納したリスト
     * @throws NumberFormatException
     * @throws IOException
     */
    private static List<String[]> getInput() throws NumberFormatException, IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        List<String[]> dataSets = new ArrayList<String[]>();
        
        try {
            // データセットの1行目は、データセット数を表す。
            int numberOfDataSets = Integer.parseInt(bufferedReader.readLine());

            // 取得したデータセット数の分だけ読み取る。
            for (int i = 0; i < numberOfDataSets; ++i) {
                String[] dataSet = bufferedReader.readLine().split(DELIMITER_SPACE);
                dataSets.add(dataSet);
            }
            return dataSets;
        } finally {
            bufferedReader.close();
            streamReader.close();
        }
    }

}