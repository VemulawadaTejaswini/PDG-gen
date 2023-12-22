import java.util.*;

public class Main {
    public static final int[] dice = {5,4,1,3,6,2}; // ??????0???????\????1????????????2????????±???3????????????4????????????5)

    public static void main(String args[] ) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Long> array = new ArrayList<Long>();

        while (true) {
            int n = sc1.nextInt();
            long total = 1;
            // n = 0?????´??????????????????
            if (n <= 0) break;

            for (int i = 0; i < n; i++) {
                String inputStr = sc2.nextLine();
                int ret = 0;

                if (inputStr == null)
                {
                    break;
                }else switch (inputStr.toUpperCase()) {
                    case "NORTH":
                        ret = changeNorth();
                        break;
                    case "EAST":
                        ret = changeEast();
                        break;
                    case "WEST":
                        ret = changeWest();
                        break;
                    case "SOUTH":
                        ret = changeSouth();
                        break;
                    case "RIGHT":
                        ret = changeRight();
                        break;
                    case "LEFT":
                        ret = changeLeft();
                        break;
                    default:
                        break;
                }
                total += ret;
            }
            array.add(total);
        }

        for (Iterator<Long> itr = array.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }

    private static int changeNorth() {
        int tmp = dice[2];
        dice[2] = dice[5];
        dice[5] = dice[4];
        dice[4] = dice[0];
        dice[0] = tmp;
        return dice[2];
    }

    private static int changeEast() {
        int tmp = dice[2];
        dice[2] = dice[1];
        dice[1] = dice[4];
        dice[4] = dice[3];
        dice[3] = tmp;
        return dice[2];
    }

    private static int changeWest() {
        int tmp = dice[2];
        dice[2] = dice[3];
        dice[3] = dice[4];
        dice[4] = dice[1];
        dice[1] = tmp;
        return dice[2];
    }

    private static int changeSouth() {
        int tmp = dice[2];
        dice[2] = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[5];
        dice[5] = tmp;
        return dice[2];
    }

    private static int changeRight() {
        int tmp = dice[5];
        dice[5] = dice[3];
        dice[3] = dice[0];
        dice[0] = dice[1];
        dice[1] = tmp;
        return dice[2];
    }

    private static int changeLeft() {
        int tmp = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[0];
        dice[0] = dice[3];
        dice[3] = tmp;
        return dice[2];
    }
}