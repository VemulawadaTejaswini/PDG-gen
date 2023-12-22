public class Main {

    public static void main(String[] args) {

    }

    /**
     * index番目のグループの到着時刻を返却する（正午からの経過時間）
     * 単位：分
     * @param index
     * @return 到着時刻
     */
    private static int getArriveTime(int index) {
        return index * 5;
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

    private static boolean checkSheet(int[] sheets, int index, int custmors) {

        boolean canSit = true;
        for (int i = 0; i < sheets.length; i++) {
            for (int j = i; j < custmors; j++) {
                if (j + custmors <= sheets.length) {
                    if (sheets[j] != 100) {
                        canSit = false;
                    }
                }
            }
            if (canSit) {
                for (int j = i; j < custmors; j++) {
                    sheets[j] = index;
                }
            }
        }


    }
}