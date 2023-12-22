import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /** データセットの区切り文字 */
    private static final String DELIMITER = ",";

    /** ワンペア */
    private static final String ONE_PAIR = "one pair";

    /** ツーペア */
    private static final String TWO_PAIR = "two pair";

    /** スリーカード */
    private static final String THREE_CARD = "three card";

    /** ストレート */
    private static final String STRAIGHT = "straight";

    /** フルハウス */
    private static final String FULL_HOUSE = "full house";

    /** フォーカード */
    private static final String FOUR_CARD = "four card";

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        // ローカルテスト用。提出時は"System.in"に修正。
        // try (Scanner scanner = new Scanner(new File(
        //            "D:/Temp/AOJ/0038_PokerHand.txt"))) {
             try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                System.out.println(judgeHand(scanner.nextLine()
                        .split(DELIMITER)));
            }
        } catch (Exception e) {
            // 対応しない。
        }
    }

    /**
     * 役を判定する。
     *
     * @param cards データセット1行を格納した配列
     * @return 判定結果
     */
    private static String judgeHand(String[] cards) {
        Map<String, Integer> hands = readHands(cards);

        if (hands.containsValue(4)) {
            return FOUR_CARD;
        }

        if (hands.containsValue(3) && hands.containsValue(2)) {
            return FULL_HOUSE;
        }

        if (hands.containsValue(3)) {
            return THREE_CARD;
        }

        int pairs = countPairs(hands);

        if (pairs == 2) {
            return TWO_PAIR;
        } else if (pairs == 1) {
            return ONE_PAIR;
        }

        // ストレートが成立するときは他の役が成立しないので、最後に判定。
        if (isStraight(hands)) {
            return STRAIGHT;
        }

        return null;
    }

    /**
     * 手札のカードを解析する。
     *
     * @param cards 手札5枚を格納した配列
     * @return keyにカードの数字、valueに同じ数字の枚数を格納したMap
     */
    private static Map<String, Integer> readHands(String[] cards) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        for (String card : cards) {
            int counter = result.containsKey(card) ? result.get(card) + 1 : 1;
            result.put(card, counter);
        }

        return result;
    }

    /**
     * ペアの組数を数える。
     *
     * @param handsMap keyにカードの数字、valueに同じ数字の枚数を格納したMap
     * @return ペアの組数
     */
    private static int countPairs(Map<String, Integer> handsMap) {
        int pairCounter = 0;

        for (Map.Entry<String, Integer> entry : handsMap.entrySet()) {
            if (entry.getValue() == 2) {
                pairCounter++;
            }
        }

        return pairCounter;
    }

    /**
     * ストレートの役が成立するか判定する。
     *
     * @param handsMap keyにカードの数字、valueに同じ数字の枚数を格納したMap
     * @return ストレートが成立する場合に{@code true}、それ以外の場合に{@code false}
     */
    private static boolean isStraight(Map<String, Integer> handsMap) {

        int[] hands = new int[5];

        int counter = 0;
        for (String hand : handsMap.keySet()) {
            hands[counter++] = Integer.parseInt(hand);
        }

        Arrays.sort(hands);

        // 1ずつインクリメントしない組み合わせは1つのみなので先にチェック。
        if (Arrays.equals(new int[] { 1, 10, 11, 12, 13 }, hands)) {
            return true;
        }

        for (int i = 0; i < hands.length - 1; i++) {
            if (hands[i] + 1 != hands[i + 1]) {
                return false;
            }
        }

        return true;
    }
}