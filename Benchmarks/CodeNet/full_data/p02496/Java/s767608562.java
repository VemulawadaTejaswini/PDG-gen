import java.util.Scanner;

/**
 * Finding Missing Cardsのエントリポイントを持つメインクラスです。
 */
public class Main {

    /** トランプの絵柄を表す列挙形です。 */
    private enum TrumpPattern {

        /** スペード */
        SPADE("S", 0),

        /** ハート */
        HEART("H", 1),

        /** クローバー */
        CLOBER("C", 2),

        /** ダイヤ */
        DIAMONDS("D", 3);

        /** 絵柄の画面表示・入力に用いる名前 */
        private String patternName;

        /** 絵柄に関連付ける番号 */
        private int value;

        /**
         * 絵柄の名前と番号を指定して初期化します。
         * @param patternName 絵柄の名前
         * @param value 絵柄に関連付ける番号
         */
        private TrumpPattern(String patternName, int value) {
            this.patternName = patternName;
            this.value = value;
        }

        /**
         * 絵柄の画面表示・入力に用いる名前を取得します。
         *
         * @return 絵柄の画面表示・入力に用いる名前
         */
        public String getPatternName() {
            return patternName;
        }

        /**
         * 絵柄に関連付ける番号を取得します。
         *
         * @return 絵柄に関連付ける番号
         */
        public int getValue() {
            return value;
        }

        /**
         * 指定した名前を持つTrumpPatternを取得します。
         *
         * @param patternName 絵柄の名前
         * @return patternNameと同じ名前を持つTrumpPattern,patternNameがnull,または該当するTrumpPatternが無い場合null
         *
         */
        public static TrumpPattern fromPatternName(String patternName) {
            if (patternName == null) {
                return null;
            }

            for (TrumpPattern p : TrumpPattern.values()) {
                if (patternName.equals(p.getPatternName())) {
                    return p;
                }
            }

            return null;
        }
    }

    public static void main(String[] args) {
        final int TRUMP_PATTERN_SIZE = 4;     // 絵柄の種類数
        final int TRUMP_NUMBER_SIZE = 13;     // 絵柄ごとの数字の種類数

        // 存在するカードを格納する2次元配列を作成する
        boolean[][] cards = new boolean[TRUMP_PATTERN_SIZE][TRUMP_NUMBER_SIZE];

        Scanner stdIn = new Scanner(System.in);

        // Line 1 - 枚数
        int cardCount = stdIn.nextInt();

        // Line2以降 - 持っているカード
        for (int i = 0; i < cardCount; i++) {
            String pattern = stdIn.next();
            int cardNumber = stdIn.nextInt();

            // 該当の絵柄・番号の箇所をtrueに設定。
            TrumpPattern tp = TrumpPattern.fromPatternName(pattern);
            cards[tp.getValue()][cardNumber - 1] = true;
        }

        for (TrumpPattern tp : TrumpPattern.values()) {
            for (int i = 0; i < TRUMP_NUMBER_SIZE; i++) {
                if (!cards[tp.getValue()][i]) {
                    System.out.println(tp.getPatternName() + " " + (i + 1));
                }
            }
        }
    }
}