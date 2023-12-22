import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static final int MAX_PRICE = 1000000000;
    static final int MIN_PRICE = 1;

    public static void main(String[] args) {
        // 標準入力の読み込み開始
        Scanner scanner = new Scanner(System.in);

        // 価格の数
        int n = scanner.nextInt();

        // 価格のリスト
        List<Integer> priceList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            priceList.add(scanner.nextInt());
        }

        // 標準入力の読み込み終了
        scanner.close();

        // 処理実行
        System.out.println(getMaxProfit(priceList, MIN_PRICE - MAX_PRICE, -1));
    }

    static int getMaxProfit(List<Integer> priceList, int tempMaxProfit, int index_prevMax) {
        // 終了条件
        if (index_prevMax + 1 == priceList.size()) {
            // リストの最後まで検索した場合、これまでの最大値を返して処理終了
            return tempMaxProfit;
        }

        // 引数index_prevMax以降の最大値取得
        int max_index = getMaxIndexInArrayList(priceList, index_prevMax + 1, priceList.size());
        int max_price = priceList.get(max_index);

        // (引数index_prevMax以降、)最大値以前で最小値取得(初回実行の場合はindex_prevMax=0として実行)
        int min_index_before = getMinIndexInArrayList(priceList, ((index_prevMax == -1)? 0: index_prevMax), max_index);
        if (min_index_before == -1) {
            // 最大値以前で最小値が取得できない(最大値=最小値)場合
            // 以降の処理は不要なのでさっさと再実行
            return getMaxProfit(priceList, tempMaxProfit, max_index);
        }
        int min_price_before = priceList.get(min_index_before);

        // 最大値以降(、リストの最後まで)で最小値取得
        int min_price_after = priceList.get(getMinIndexInArrayList(priceList, max_index, priceList.size()));

        // 引数tempMaxProfitを再設定
        if((max_price - min_price_before) > tempMaxProfit) {
            tempMaxProfit = max_price - min_price_before;
        }

        // 最大値以前の最小値のほうが小さい場合
        if (min_price_before <= min_price_after) {
            // 処理終了
            return tempMaxProfit;
        }

        // 再実行
        return getMaxProfit(priceList, tempMaxProfit, max_index);
    }

    // リストから最大値のインデックスを取得する
    static int getMaxIndexInArrayList(List<Integer> priceList, int index_start, int index_end) {
        int max_price = MIN_PRICE - 1;
        int max_index = -1;

        for (int i = index_start; i < index_end; i++) {
            if (priceList.get(i) > max_price) {
                max_price = priceList.get(i);
                max_index = i;
            }
        }

        return max_index;
    }

    // リストから最小値のインデックスを取得する
    static int getMinIndexInArrayList(List<Integer> priceList, int index_start, int index_end) {
        int min_price = MAX_PRICE + 1;
        int min_index = -1;

        for (int i = index_start; i < index_end; i++) {
            if (priceList.get(i) < min_price) {
                min_price = priceList.get(i);
                min_index = i;
            }
        }

        return min_index;
    }
}

