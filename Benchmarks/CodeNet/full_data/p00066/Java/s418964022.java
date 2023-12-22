import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    /**
     * ???
     */
    public static final char CIRCLE = 'o';

    /**
     * ??
     */
    public static final char CROSS = 'x';

    /**
     * draw
     */
    public static final char DRAW = 'd';

    /**
     * ????????°???
     */
    public static final int CIRCLE_NUMBER = 1;
    /**
     * ???????°???
     */
    public static final int CROSS_NUMBER = 0;

    /**
     * draw?????°???
     */
    public static final int DRAW_NUMBER = -1;

    /**
     * ??????????????????
     */
    public static final int COUNT_WIN = 3;

    public static void main(String[] args) throws IOException {

        // ??¢???????????????
        for (int[] list : read()) {
            System.out.println(judgeWinner(list));
        }
    }

    public static List<int[]> read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ?????????????????????
        String line = "";
        List<int[]> list = new ArrayList<>();

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            // ??\???????????????
            int[] gameResult = createGameResult(line);

            list.add(gameResult);
        }
        return list;

    }

    // createGameResult
    /**
     * ?????? ???????????????????????´??????
     * 
     * @return gameResult
     */
    public static int[] createGameResult(String input) {
        // ??\??????????´??????????-1??§?????????????????????????????\?????¨?????????
        int[] board = getfilledArray();

        // ?????????1??§????????0????????\?????????-1
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == CIRCLE) {
                board[i] = CIRCLE_NUMBER;
            }

            if (input.charAt(i) == CROSS) {
                board[i] = CROSS_NUMBER;
            }
        }

        return board;
    }

    // fillArray
    /**
     * ?????? ????????????????????????????????´??????
     * 
     * @return filledArray
     */
    public static int[] getfilledArray() {
        int[] board = new int[9];
        Arrays.fill(board, DRAW_NUMBER);
        return board;
    }

    // horizontal?????????????????£?¶??????????????????????
    public static int judgeHorizontal(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                circleCount = 0;
                crossCount = 0;
            }
            switch (gameResult[i]) {
            case CIRCLE_NUMBER:
                circleCount++;
                break;
            case CROSS_NUMBER:
                crossCount++;
                break;
            }
            // ????????????
            if (circleCount == COUNT_WIN) {
                return CIRCLE_NUMBER;
            }
            // ???????????
            if (crossCount == COUNT_WIN) {
                return CROSS_NUMBER;
            }

        }

        return DRAW_NUMBER;
    }

    // vertical?????????????????£?¶???????????????????
    public static int judgeVerticel(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 3; i++) {
            circleCount = 0;
            crossCount = 0;
            for (int j = i; j < i + 7; j += 3) {
                switch (gameResult[j]) {
                case CIRCLE_NUMBER:
                    circleCount++;
                    break;
                case CROSS_NUMBER:
                    crossCount++;
                    break;
                }

                // ????????????
                if (circleCount == COUNT_WIN) {
                    return CIRCLE_NUMBER;
                }
                // ???????????
                if (crossCount == COUNT_WIN) {
                    return CROSS_NUMBER;
                }
            }
        }
        return DRAW_NUMBER;
    }

    // ????????????????????????????????????
    public static int judgeDiagonal(int[] gameResult) {
        int circleCount = 0;
        int crossCount = 0;

        for (int i = 0; i < 3; i += 2) {
            circleCount = 0;
            crossCount = 0;
            for (int j = i; j < 9; j += 4) {
                switch (gameResult[j]) {
                case CIRCLE_NUMBER:
                    circleCount++;
                    break;
                case CROSS_NUMBER:
                    crossCount++;
                    break;
                }

                // ????????????
                if (circleCount == COUNT_WIN) {
                    return CIRCLE_NUMBER;
                }
                // ???????????
                if (crossCount == COUNT_WIN) {
                    return CROSS_NUMBER;
                }
            }
        }
        return DRAW_NUMBER;
    }

    // judgeWinner
    public static char judgeWinner(int[] gameResult) {
        int winner = DRAW_NUMBER;
        if ((winner = judgeHorizontal(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }
        if ((winner = judgeVerticel(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }

        if ((winner = judgeDiagonal(gameResult)) != DRAW_NUMBER) {
            return returnString(winner);
        }

        return returnString(winner);
    }

    public static char returnString(int i) {
        switch (i) {
        case CIRCLE_NUMBER:
            return CIRCLE;
        case CROSS_NUMBER:
            return CROSS;
        default:
            return DRAW;
        }
    }
}