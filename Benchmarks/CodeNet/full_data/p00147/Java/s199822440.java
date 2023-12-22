import java.util.Calendar;

public class Main {

    private static final int NOT_SIT = 100;

    private static int[] SHEETS = new int[17];

    public static void main(String[] args) {

    }

    /**
     * index番目のグループの到着時刻を返却する（正午からの経過時間）
     * 単位：分
     * @param index
     * @return 到着時刻
     */
    private static Calendar getArriveTime(int index) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 4, 11, 12, 0, 0);
        calendar.add(Calendar.MINUTE, index * 5);
        return calendar;
    }

    /**
     * index番目のグループの人数を返却する
     * 単位：人
     * @param index
     * @return 人数
     */
    private static int getNums(int index) {
        return((index % 5 == 1) ? 5 : 2);
    }

    /**
     * index番目のグループの所要時間を返却する
     * 単位：分
     * @param index
     * @return 所要時間
     */
    private static int getEatingTime(int index) {
        return 17 * (index % 2) + 3 * (index % 3) + 19;
    }

    /**
     *
     * @param sheets
     * @param index
     * @param customers
     * @return
     */
    private static boolean checkSheet(int index, int customers) {

        boolean canSit = true;

        for (int i = 0; i < SHEETS.length; i++) { // 椅子
            for (int j = i; j < customers; j++) { // 客人数

                if (j + customers <= SHEETS.length) { // 客が着席する始点から終点が、椅子総数を超えていない場合

                    if (SHEETS[j] != NOT_SIT) { // 着席済みの場合
                        canSit = false;
                        break;
                    }
                }
                i++;
            }
            if (canSit) {
                for (int j = i; j < customers; j++) {
                    SHEETS[j] = index;
                }
            }
        }

        return canSit;
    }

    /**
     * 座席の初期化（初期値：100（空席））
     */
    private static void initSheets() {

        for (int i = 0; i < SHEETS.length; i++) {
            SHEETS[i] = 100;
        }
    }
}