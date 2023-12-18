import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // heights.length本の花の高さ(最初の値は0)
        int heights[] = new int[scan.nextInt()];
        for(int i = 0; i < heights.length; i++) {
            heights[i] = 0;
        }

        // heights.length本の花の高さの目標値(初期値は標準入力から受け取る)
        int heightTargets[] = new int[heights.length];
        for(int i = 0; i < heightTargets.length; i++) {
            heightTargets[i] = scan.nextInt();
        }

        // 水やりの最小値を出力する
        System.out.println(minWarteringCount(heights, heightTargets));

        scan.close();
        return;
    }

    // 花の高さの配列h[]が全てht[]になるまでの最小の水やり回数を求めるメソッド
    public static int minWarteringCount(int h[], int ht[]) {
        int result = 0, hMin, htMin;

        // h[]とht[]の最小値をそれぞれ見つける
        hMin = h[0];
        htMin = ht[0];
        for(int i = 1; i < h.length; i++) {
            if(h[i] < hMin) {
                hMin = h[i];
            }

            if(ht[i] < htMin) {
                htMin = ht[i];
            }
        }

        // ht[]の最小値とh[]の最小値の差だけhの各要素とresultの値を増やす
        for(int i = 0; i < h.length; i++) {
            h[i] += htMin - hMin;
        }
        result += htMin - hMin;

        // まだ目標値を満たしていない部分について、そのうち連続している部分ごとにこのメソッドを呼び出し、resultの値を増やす
        int k = 0;
        while(k < h.length) {
            // h[k]がまだ目標値ht[k]に達していないときの処理
            if(h[k] < ht[k]) {
                int start = k; //部分の先頭の番号
                int end = k; //部分の末尾の番号

                // 末尾を探す
                while(end + 1 < h.length && h[end + 1] < ht[end + 1]) {
                    end++;
                }

                // hとhtの添字startからendの部分について新しく配列を作り、このメソッドを呼び出す
                int h2[] = new int[end - start + 1];
                int ht2[] = new int[end - start + 1];
                for(int i = 0; i < h2.length; i++) {
                    h2[i] = h[start + i];
                    ht2[i] = ht[start + i];
                }
                result += minWarteringCount(h2, ht2);

                // ここで扱った部分だけkの値を増やし、end+1番目の要素の検査に移る
                k += end - start;
            }

            // kをインクリメントし、次の要素の検査に移る
            k++;
        }

        return result;
    }
}