import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int KUUSEKI = 9999;

    private static int TIME = 999999;

    private static int SEATNUM = 17;

    /**
     * <p> [機能] 各入力値について、n番目のお客の分単位の待ち時間(0以上の整数) を出力する。 </p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputlist = new ArrayList<Integer>();

        String line;
        int maxInput = 0;
        int intLine;

        while ((line = stdReader.readLine()) != null) { // ユーザの一行入力を待つ
            // 空文字が入力されたら入力値の取得を終了する
            if (line.equals("")) {
                break;
            }
            // listに入力値の1行分を格納する。
            intLine = Integer.valueOf(line);
            if (intLine > maxInput) {
                maxInput = intLine;
            }
            inputlist.add(intLine);
        }
        stdReader.close();

        // 17席分空席として用意する。
        int[] seats = new int[SEATNUM];
        for (int i = 0; i < SEATNUM; i++) {
            seats[i] = KUUSEKI;
        }

        List<int[]> groupInfo = new ArrayList<int[]>();
        List<int[]> sittingGroupInfo = new ArrayList<int[]>();

        // 時間の経過とともに変化する条件の処理
        for (int minutes = 0; minutes < TIME; minutes++) {

            // 最大入力値よりも大きくなったら処理を終了する。
            int groupMaxCount = sittingGroupInfo.size();
            if (groupMaxCount > 0 && maxInput == sittingGroupInfo.get(groupMaxCount - 1)[0]) {
                break;
            }

            // 食べ終わっていたら退店させる。
            for (int n = 0; n < sittingGroupInfo.size(); n++) {
                int[] eatenGroup = sittingGroupInfo.get(n);
                if (minutes == eatenGroup[2]) {
                    for (int i = 0; i < SEATNUM; i++) {
                        if (seats[i] == eatenGroup[0]) {
                            seats[i] = KUUSEKI;
                        }
                    }
                }
            }

            // 客が入店するかチェック
            if (minutes % 5 == 0) {
                groupInfo.add(inputGroupInfo(minutes));
            }

            // 並んでいるグループの先頭が座れるかどうか判定する。
            int groupCount = groupInfo.size();
            for (int k = 0; k < groupCount; k++) {
                int[] comingGroup = groupInfo.get(0);
                int kuusekiCount = 0;
                boolean firstCustomer = false;
                // 席が空いているどうか判定する。
                for (int i = 0; i < SEATNUM; i++) {
                    if (seats[i] == KUUSEKI) {
                        kuusekiCount = kuusekiCount + 1;
                    } else {
                        kuusekiCount = 0;
                    }
                    // 座れた場合には、座席にグループ番号を入力し、待ち時間を取得する。
                    if (kuusekiCount == comingGroup[1]) {
                        for (int m = 0; m < comingGroup[1]; m++) {
                            seats[i - m] = comingGroup[0];
                        }
                        // 待ち時間を取得する。
                        int waitedTime = minutes - comingGroup[3];
                        int[] sittingGroupDetails = {comingGroup[0], waitedTime, comingGroup[4]};

                        sittingGroupInfo.add(sittingGroupDetails);
                        // 先頭客の情報を削除する。
                        groupInfo.remove(0);
                        // 先頭の人が入れたら次の人が入れる。

                        firstCustomer = true;
                        break;
                    }
                }
                if (!firstCustomer) {
                    // 先頭の人が入れなかった場合は後ろの人も入れないので処理を終了する。
                    break;
                }
            }
        }
        // 入力値と一致した場合は出力を行う
        for (int[] outputInfo : sittingGroupInfo) {
            for (int input : inputlist) {
                if (input == outputInfo[0]) {
                    System.out.println(outputInfo[1]);
                }
            }
        }
    }

    /**
     * <p> [機能] 5分ごとに入店するグループの情報を配列に格納する。</p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param time
     * @return
     */
    private static int[] inputGroupInfo(int time) {
        int group = 0;
        int groupNumber = 0;
        int eatingTime = 0;
        int eatenTime = 0;

        // グループ番号
        group = time / 5;

        // グループ人数
        if (group % 5 == 1) {
            groupNumber = 5;
        } else {
            groupNumber = 2;
        }
        // 食べるのにかかる時間
        eatingTime = 17 * (group % 2) + 3 * (group % 3) + 19;

        // 食べ終わる時間
        eatenTime = eatingTime + time;

        // グループ番号・グループ人数・食べるのにかかる時間・入店した時刻・食べ終わる時間を保持する。
        int[] groupDetails = {group, groupNumber, eatingTime, time, eatenTime};
        return groupDetails;
    }
}