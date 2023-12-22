import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 0147:Fukushimaken
 * 
 * @author MS14A
 * @version 2015/05/09
 */
public class Main {

    private static int[] seatWaitTime = new int[17];

    /**
     * メインメソッド
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        List<Integer> inputGroupNumbers = getGroupNumbers();

        for (Integer inputGroupNumber : inputGroupNumbers) {
            Arrays.fill(seatWaitTime, 0);

            System.out.println(getWaitingTime(inputGroupNumber.intValue()));
        }
    }

    private static int getWaitingTime(int inputGroupNumber) {

        boolean canSit = false;
        List<Integer> waitingGroups = new ArrayList<Integer>();
        int groupNumber = 0;

        int time = 0;
        int waitingStartTime = 0;
        int waitingEndTime = 0;

        while (!canSit) {
            // 食事時間を一分進める
            for (int seatTime : seatWaitTime) {
                if (seatTime > 0) {
                    seatTime -= 1;
                }
            }

            // グループが来る
            if (time % 5 == 0) {
                groupNumber = time / 5;
                waitingGroups.add(Integer.valueOf(groupNumber));

                if (groupNumber == inputGroupNumber) {
                    waitingStartTime = time;
                }
            }

            if (!waitingGroups.isEmpty()) {
                // 座れる場合は待ちリストから削除していく
                canSit = sit(getNumberOfGuy(waitingGroups.get(0)), getEatingTime(waitingGroups.get(0)));

                while (canSit) {
                    if (waitingGroups.get(0) == inputGroupNumber) {
                        waitingEndTime = time;
                        break;
                    }
                    waitingGroups.remove(0);
                    if (waitingGroups.isEmpty()) {
                        canSit = false;
                    } else {
                        canSit = sit(getNumberOfGuy(waitingGroups.get(0)), getEatingTime(waitingGroups.get(0)));
                    }
                }
            }

            ++time;
        }

        return waitingEndTime - waitingStartTime;
    }

    private static boolean sit(int NumberOfGroupMember, int eatingTimeOfGroup) {
        int count = 0;
        for (int i = 0; i < seatWaitTime.length; ++i) {
            if (seatWaitTime[i] == 0) {
                count += 1;
                if (count == NumberOfGroupMember) {
                    Arrays.fill(seatWaitTime, i - NumberOfGroupMember + 1, i + 1, eatingTimeOfGroup);
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }

    private static int getNumberOfGuy(int groupNumber) {
        if (groupNumber % 5 == 1) {
            return 5;
        }
        return 2;
    }

    private static int getEatingTime(int groupNumber) {
        return 17 * (groupNumber % 2) + 3 * (groupNumber % 3) + 19;
    }

    private static List<Integer> getGroupNumbers() throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String line = null;
        List<Integer> groupNumbers = new ArrayList<Integer>();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                groupNumbers.add(Integer.parseInt(line));
            }
            return groupNumbers;
        } finally {
            bufferedReader.close();
            streamReader.close();
        }

    }
}