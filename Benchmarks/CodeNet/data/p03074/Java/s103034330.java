import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int max = 0;
        char[] S = sc.next().toCharArray();
        int oneCount = 0;
        int zeroCount = 0;
        boolean zeroChainFlag = false;
        int totalChain = 0;
        int oneCountList[] = new int[N];
        int indexForMinus = 1;

        // 尺取り法で実装する
        // そもそも反転させるのは近い0同士が1の連結数が最大となると仮定
        for (int i = 0; i < S.length; i++) {
            // 1のとき
            if (S[i] == '1') {
                // 前までが0の場合、リストに0反転の1を含む、1連結数のリストに挿入
                // リストは、反転回数を超えた場合に、減算する用に使用する
                if (zeroChainFlag) {
                    oneCountList[zeroCount] = oneCount;
                    oneCount = 0;
                    zeroChainFlag = false;
                }
                oneCount++;
                totalChain++;
                // 終端が1のときは、最大値更新をする
                if (i == S.length - 1) {
                    max = Math.max(max, totalChain);
                }
                // 0のとき
            } else {
                // 前までが0のとき、反転し続ける
                if (zeroChainFlag) {
                    oneCount++;
                    totalChain++;
                }
                // 前までが0ではないときの処理
                else {
                    zeroChainFlag = true;
                    zeroCount++;
                    // 指定回数K以下の場合
                    if (zeroCount <= K) {
                        oneCount++;
                        totalChain++;
                        // 指定回数Kを超えた場合
                        // ここがミソ。一番古い反転0を含む1の固まりを合計値から引き算する。
                    } else {
                        // 最大値更新
                        max = Math.max(max, totalChain);
                        // 一番古い反転0を含む1の固まりを合計値から引き算する。
                        totalChain = totalChain - oneCountList[indexForMinus];
                        indexForMinus++;
                        // 現在位置の0の反転分を足す
                        totalChain++;
                        oneCount++;
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}