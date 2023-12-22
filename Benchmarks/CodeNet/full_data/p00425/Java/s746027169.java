import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();

        while (true) {
            int[] dice = {5,4,1,3,6,2}; // ??????0???????\????1????????????2????????±???3????????????4????????????5)

            String strN = sc.nextLine();
            int n = Integer.parseInt(strN);
            int total = 1;

            // n = 0?????´??????????????????
            if (n <= 0) break;

            for (int i = 0; i < n; i++) {
                String inputStr = sc.nextLine();
                int ret = 0;

                if (inputStr == null)
                {
                    break;
                }else switch (inputStr.toUpperCase()) {
                    case "NORTH":
                        ret = changeNorth(dice);
                        break;
                    case "EAST":
                        ret = changeEast(dice);
                        break;
                    case "WEST":
                        ret = changeWest(dice);
                        break;
                    case "SOUTH":
                        ret = changeSouth(dice);
                        break;
                    case "RIGHT":
                        ret = changeRight(dice);
                        break;
                    case "LEFT":
                        ret = changeLeft(dice);
                        break;
                    default:
                        break;
                }
                total += ret;
            }
            array.add(total);
        }

        for (Iterator<Integer> itr = array.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }

    private static int changeNorth(int[] dice) {
        int tmp = dice[2];
        dice[2] = dice[5];
        dice[5] = dice[4];
        dice[4] = dice[0];
        dice[0] = tmp;
        return dice[2];
    }

    private static int changeEast(int[] dice) {
        int tmp = dice[2];
        dice[2] = dice[1];
        dice[1] = dice[4];
        dice[4] = dice[3];
        dice[3] = tmp;
        return dice[2];
    }

    private static int changeWest(int[] dice) {
        int tmp = dice[2];
        dice[2] = dice[3];
        dice[3] = dice[4];
        dice[4] = dice[1];
        dice[1] = tmp;
        return dice[2];
    }

    private static int changeSouth(int[] dice) {
        int tmp = dice[2];
        dice[2] = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[5];
        dice[5] = tmp;
        return dice[2];
    }

    private static int changeRight(int[] dice) {
        int tmp = dice[5];
        dice[5] = dice[3];
        dice[3] = dice[0];
        dice[0] = dice[1];
        dice[1] = tmp;
        return dice[2];
    }

    private static int changeLeft(int[] dice) {
        int tmp = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[0];
        dice[0] = dice[3];
        dice[3] = tmp;
        return dice[2];
    }
}