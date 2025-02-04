import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * ?????????????????????
     */
    public static void main(String[] args) throws IOException {

        // ??\????????????????????????MAX50??¶??¨???????????????????????§????????¨????????????????????§OK???
        List<Hand> hands = readHands();

        // 1??¶??????????????????
        for (Hand hand : hands) {

            // ??????????????????
            String handName = hand.judge();

            // ?????????????????????
            System.out.println(handName);

        }
    }

    /**
     * ?¨??????\???????????????????????????1??????????????????????????????????????¨???????????´?????????
     *
     * @return ???????????????
     */
    protected static List<Hand> readHands() throws IOException {

        // ????????????????????¨?????????
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        List<Hand> hands = new ArrayList<Hand>();
        String line = null;
        // ?¨??????\?????????1???????????????????????????????????????
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");

            // ??????????????°??????????????????
            int[] cards = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                cards[i] = Integer.parseInt(values[i]);
            }

            // ??????????????????????????????????????????????????????
            hands.add(new Hand(cards));
        }

        // ????????????????????????????????????
        if (reader != null) {
            reader.close();
        }

        return hands;
    }

    /**
     * ???????????¨????????????
     */
    static class Hand {

        /** ??????????????± */
        int[] cards;

        /**
         * ?????°??§???????????????????????????????????????
         *
         * @param cards ?????????
         */
        public Hand(final int[] cards) {
            // ?????????????????¨???????????????
            this.cards = new int[5];
            System.arraycopy(cards, 0, this.cards, 0, cards.length);
        }

        /**
         * ??????????????????????????????
         *
         * @return ???????????????????????´??????null????????????
         */
        public String judge() {

            // ?????°?????????????????????
            int[] numberOfCards = new int[14]; // ??????????????????0????????¨?????????
            for (int card : cards) {
                numberOfCards[card]++;
            }

            // ?????°????????§????????§??????????????¢???
            int pair = 0;
            int threeCard = 0;
            int fourCard = 0;
            for (int number : numberOfCards) {
                switch (number) {
                case 2:
                    pair++;
                    break;
                case 3:
                    threeCard++;
                    break;
                case 4:
                    fourCard++;
                    break;
                }
            }

            // ??????????????????
            if (fourCard > 0) {
                return "four card";
            }

            // ???????????????
            if (pair > 0 && threeCard > 0) {
                return "full house";
            }

            // ????????¬?????????????????§??????????????§????????¬??????????????§????????????
            int[] straightJudge = new int[5];
            System.arraycopy(cards, 0, straightJudge, 0, cards.length);
            Arrays.sort(straightJudge);

            // ??????????????????5??£?¶???§????????§?????????OK
            int sequenceCount = 0;
            for (int i = 1; i < straightJudge.length; i++) {
                if ((straightJudge[i] - straightJudge[i - 1]) == 1) {
                    sequenceCount++;
                }
            }
            if (sequenceCount == 4) {
                return "straight";
            }

            // A??????????????????????????¬??????????????\???????????????
            if (straightJudge[0] == 1 && straightJudge[1] == 10 && straightJudge[2] == 11 && straightJudge[3] == 12
                    && straightJudge[4] == 13) {
                return "straight";
            }

            // ??????????????????
            if (threeCard > 0) {
                return "three card";
            }

            // ???????????¢
            if (pair > 1) {
                return "two pair";
            }

            if (pair > 0) {
                return "one pair";
            }
            return null;
        }
    }
}