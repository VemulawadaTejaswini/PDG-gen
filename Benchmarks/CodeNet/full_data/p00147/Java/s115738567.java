import java.util.Scanner;

public class Main {

    //席数
    private static final int NUMBER_OF_SEATS = 17;

    //各席が、いつ（何分）になったら使用可能になるかを格納する。
    private static int[] SEATS_ARRAY = new int[NUMBER_OF_SEATS];

    //グループ数
    private static int NUMBER_OF_GROUPS = 100;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 待ち時間を取得します。
        int[] waitingTime = calcWaitingTime();

        while(in.hasNextLine()){
            String str = in.nextLine();
            if(str == null || "".equals(str)){
                break;
            }
            System.out.println(waitingTime[Integer.parseInt(str)]);
        }
        in.close();
    }

    //待ち時間を計算します。
    private static int[] calcWaitingTime() {

        clear(SEATS_ARRAY);

        // 各グループの人数
        int[] group = getGroup(NUMBER_OF_GROUPS);

        // 各グループの食事時間
        int[] eatingTime = getEatingTime(NUMBER_OF_GROUPS);

        // i番目の客の到着時間
        int[] arriveTime = getArriveTime(NUMBER_OF_GROUPS);

        int top = 0;
        int[] waitingTime = new int[NUMBER_OF_GROUPS];
        int totalTime = 0;

        // 待ち時間を計算する
        while (top < NUMBER_OF_GROUPS) {

            // 先頭グループの人数分の空きがあるかを確認し、空いている席を取得
            int index = getVacantIndex(group[top], totalTime);

            // 空いている席がなければ座れるまで時間を進める。
            while (index == -1) {
                index = getVacantIndex(group[top], ++totalTime);
            }
            if (totalTime > arriveTime[top]){
                waitingTime[top] = totalTime - arriveTime[top];
            }else {
                waitingTime[top] = 0;
            }
            for (int idx = index; idx < group[top] + index; idx++) {
                SEATS_ARRAY[idx] = totalTime + eatingTime[top];
                if(totalTime < arriveTime[top]) {
                    SEATS_ARRAY[idx] = arriveTime[top] + eatingTime[top];
                } else {
                    SEATS_ARRAY[idx] = totalTime + eatingTime[top];
                }
            }
            top++;
            if(top < NUMBER_OF_GROUPS && totalTime < arriveTime[top]) {
                totalTime = arriveTime[top];
            }
        }
        return waitingTime;
    }

    //num席連続して空いている席の番号を返却する。
    private static int getVacantIndex(int num, int totalTime) {
        int index = -1;
        int vacant = 0;

        for (int i = 0; i < NUMBER_OF_SEATS; i++) {
            if (SEATS_ARRAY[i] <= totalTime) {
                if (index == -1) {
                    index = i;
                }
                if (++vacant == num) {
                    return index;
                }
            } else {
                vacant = 0;
                index = -1;
            }
        }
        return -1;
    }

    //各グループの到着時刻を配列に格納し返却する
    private static int[] getArriveTime(int num) {
        int[] aTime = new int[num];

        for (int i = 0; i < num; i++) {
            aTime[i] = i * 5;
        }
        return aTime;
    }

    //各グループの食事時間を配列に格納し返却する
    private static int[] getEatingTime(int num) {
        int[] oTime = new int[num];

        for (int i = 0; i < num; i++) {
            oTime[i] = 17 * (i % 2) + 3 * (i % 3) + 19;
        }
        return oTime;
    }

    //各グループの人数を配列に格納し返却する
    private static int[] getGroup(int num) {
        int[] group = new int[num];
        int persons;

        for (int i = 0; i < num; i++) {
            persons = 2;
            if (i % 5 == 1) {
                persons = 5;
            }
            group[i] = persons;
        }
        return group;
    }

    //配列を初期化する。
    private static void clear(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            ary[i] = 0;
        }
    }
}