import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * ABC129、A問題の実装クラス
 */
public class Main {

    /**
     * 標準入力からの入力をもとに、最短の飛行時間を求める
     */
    public static void main(String... args) {

        String line = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            line = br.readLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {}
        }
        
      	// 読み取った文字列を空白スペースで分割。昇順でソート
        String[] times = line.trim().split(" ");
        Arrays.sort(times);

        System.out.println(Integer.parseInt(times[0]) + Integer.parseInt(times[1]));
    }
}