import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String MOVE_RIGHT = "01";

    private static final String MOVE_LEFT = "10";

    private static final String MOVE = "1";

    private static final String NOT_MOVE3 = "000";

    private static final String NOT_MOVE2 = "00";

    private static final String NOT_MOVE1 = "0";

    private static final String END_CHAR = "0";

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new ArrayList<String>();
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int cnt = 0;
        while (!END_CHAR.equals(inputDataList.get(cnt))) {
            int lines = Integer.parseInt(inputDataList.get(cnt++));
            int selectLine = Integer.parseInt(inputDataList.get(cnt++));
            int hitLine = Integer.parseInt(inputDataList.get(cnt++));
            int steps = Integer.parseInt(inputDataList.get(cnt++));

            judgeDrawingLots(lines, selectLine, hitLine, steps,
                    inputDataList.subList(cnt, cnt + steps));
            cnt = cnt + steps;
        }
    }

    private static void judgeDrawingLots(int lines, int selectLine,
            int hitLine, int steps, List<String> lineDataList) {

        int[] selectLocus = getSelectLocus(selectLine, lines, steps,
                lineDataList);
        int[] hitLocus = getHitLocus(hitLine, lines, steps, lineDataList);

        printResult(selectLocus, hitLocus, lineDataList, lines);
    }

    private static void printResult(int[] selectLocus, int[] hitLocus,
            List<String> lineDataList, int lines) {
        if (selectLocus[0] == hitLocus[0]) {
            System.out.println("0");
            return;
        }

        for (int i = 0; i < selectLocus.length - 1; i++) {
            String cross = null;

            // 対象の位置より左側に線を引く場合
            if (selectLocus[i] - hitLocus[i] == 1) {

                // 横線のデータを抽出
                if (selectLocus[i] == lines) {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 2,
                            selectLocus[i] - 1);
                } else if (selectLocus[i] == lines - 1) {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 3,
                            selectLocus[i] - 1);
                } else {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 4,
                            selectLocus[i] - 1);
                }

                // 正解かどうか
                if (NOT_MOVE1.equals(cross) || NOT_MOVE2.equals(cross)
                        || NOT_MOVE3.equals(cross)) {

                    StringBuilder resultLeft = new StringBuilder();
                    resultLeft.append(i + 1).append(" ").append(hitLocus[i]);
                    System.out.println(resultLeft.toString());
                    return;
                }
            }

            // 対象の位置より右側に線を引く場合
            if (selectLocus[i] - hitLocus[i] == -1) {

                // 横線のデータを抽出
                if (selectLocus[i] == 1) {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 1,
                            selectLocus[i]);
                } else if (selectLocus[i] == 2) {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 2,
                            selectLocus[i]);
                } else {
                    cross = lineDataList.get(i).substring(selectLocus[i] - 3,
                            selectLocus[i]);
                }

                // 正解かどうか
                if (NOT_MOVE1.equals(cross) || NOT_MOVE2.equals(cross)
                        || NOT_MOVE3.equals(cross)) {

                    StringBuilder resultLeft = new StringBuilder();
                    resultLeft.append(i + 1).append(" ").append(selectLocus[i]);
                    System.out.println(resultLeft.toString());
                    return;

                }
            }
        }

        System.out.println("1");
    }

    private static int[] getSelectLocus(int selectLine, int lines, int steps,
            List<String> lineDataList) {
        int[] locus = new int[steps + 1];
        locus[0] = selectLine;

        for (int i = 1; i <= steps; i++) {
            String lineData = lineDataList.get(i - 1);
            String pickUpLineData = null;
            int presentPosition = locus[i - 1];

            // 左端の場合
            if (presentPosition == 1) {
                pickUpLineData = lineData.substring(0, 1);

                if (pickUpLineData.equals(MOVE)) {
                    presentPosition++;
                }
                locus[i] = presentPosition;
                continue;
            }

            // 右端の場合
            if (presentPosition == lines) {
                pickUpLineData = lineData.substring(presentPosition - 2,
                        presentPosition - 1);

                if (pickUpLineData.equals(MOVE)) {
                    presentPosition--;
                }
                locus[i] = presentPosition;
                continue;
            }

            // それ以外の場合
            pickUpLineData = lineData.substring(presentPosition - 2,
                    presentPosition);

            if (pickUpLineData.equals(MOVE_RIGHT)) {
                presentPosition++;
            } else if (pickUpLineData.equals(MOVE_LEFT)) {
                presentPosition--;
            }

            locus[i] = presentPosition;
        }

        return locus;
    }

    private static int[] getHitLocus(int hitLine, int lines, int steps,
            List<String> lineDataList) {
        int[] locus = new int[steps + 1];
        locus[steps] = hitLine;

        for (int i = steps - 1; i >= 0; i--) {
            String lineData = lineDataList.get(i);
            String pickUpLineData = null;
            int presentPosition = locus[i + 1];

            // 左端の場合
            if (presentPosition == 1) {
                pickUpLineData = lineData.substring(0, 1);

                if (pickUpLineData.equals(MOVE)) {
                    presentPosition++;
                }
                locus[i] = presentPosition;
                continue;
            }

            // 右端の場合
            if (presentPosition == lines) {
                pickUpLineData = lineData.substring(presentPosition - 2,
                        presentPosition - 1);

                if (pickUpLineData.equals(MOVE)) {
                    presentPosition--;
                }
                locus[i] = presentPosition;
                continue;
            }

            // それ以外の場合
            pickUpLineData = lineData.substring(presentPosition - 2,
                    presentPosition);

            if (pickUpLineData.equals(MOVE_RIGHT)) {
                presentPosition++;
            } else if (pickUpLineData.equals(MOVE_LEFT)) {
                presentPosition--;
            }

            locus[i] = presentPosition;
        }

        return locus;
    }
}