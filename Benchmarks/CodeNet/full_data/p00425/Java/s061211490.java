import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class P0502 {

    public static void main(String args[]) {
        P0502 myWork = new P0502(); // create a dinamic instance
        try {
            myWork.Begin(); // the true entry point
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final int NOT_TURN = 0;
    private static final int RIGHT = 1;
    private static final int LEFT = 2;
    private static final int NORTH = 1;
    private static final int EAST = 2;
    private static final int SOUTH = 3;
    private static final int WEST = 4;

    // 合計値
    private int sum = 1;

    // 向き
    private int[] dice = { 1, 5, 3, 2, 4 };

    private int isTurn(String value) {
        if ("Right".equals(value)) {
            return RIGHT;
        } else if ("Left".equals(value)) {
            return LEFT;
        }
        return NOT_TURN;
    }

    private int whichDirection(String value) {
        if ("North".equals(value)) {
            return NORTH;
        } else if ("East".equals(value)) {
            return EAST;
        } else if ("South".equals(value)) {
            return SOUTH;
        } else if ("West".equals(value)) {
            return WEST;
        }
        throw new RuntimeException();
    }

    public void Begin() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        while ((input = reader.readLine()) != null) {

            if ("0".equals(input)) {
                break;
            }

            // 初期化
            sum = 1;
            dice[0] = 1;
            dice[1] = 5;
            dice[2] = 3;
            dice[3] = 2;
            dice[4] = 4;

            int loop = Integer.parseInt(input);
            for (int i = 0; i < loop; i++) {
                String command = reader.readLine();
                int turn = isTurn(command);
                int tmp = 0;
                switch (turn) {
                case RIGHT:
                    tmp = dice[4];
                    for (int j = 3; j >= 1; j--) {
                        dice[j + 1] = dice[j];
                    }
                    dice[1] = tmp;
                    break;
                case LEFT:
                    tmp = dice[1];
                    for (int j = 1; j <= 3; j++) {
                        dice[j] = dice[j + 1];
                    }
                    dice[4] = tmp;
                    break;
                default:
                    int direction = whichDirection(command);
                    switch (direction) {
                    case NORTH:
                        dice[NORTH] = dice[0];
                        dice[0] = dice[SOUTH];
                        dice[SOUTH] = 7 - dice[NORTH];
                        break;
                    case EAST:
                        dice[EAST] = dice[0];
                        dice[0] = dice[WEST];
                        dice[WEST] = 7 - dice[EAST];
                        break;
                    case SOUTH:
                        dice[SOUTH] = dice[0];
                        dice[0] = dice[NORTH];
                        dice[NORTH] = 7 - dice[SOUTH];
                        break;
                    default:
                        dice[WEST] = dice[0];
                        dice[0] = dice[EAST];
                        dice[EAST] = 7 - dice[WEST];
                        break;
                    }
                    break;
                }

                sum += dice[0];
                // System.out.println(sum + " " + dice[0] + dice[1] + dice[2] + dice[3] + dice[4]);
            }

            System.out.println(sum);
        }

    }
}