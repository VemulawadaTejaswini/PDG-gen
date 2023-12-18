import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxHappines = 0;
        Scanner sc = new Scanner(System.in);
        int vacationDays = sc.nextInt();
        sc.nextLine();
        //A = 0, B = 1, C = 2
        int[][] happines = new int[vacationDays][3];
        for (int i = 0; i < vacationDays; i++) {
            happines[i][0] = sc.nextInt();
            happines[i][1] = sc.nextInt();
            happines[i][2] = sc.nextInt();
        }

        int[][] res = new int[vacationDays][3];
        res[0][0] = happines[0][0];
        res[0][1] = happines[0][1];
        res[0][2] = happines[0][2];

        for (int day = 1; day < vacationDays; day++) {
            for (int action = 0; action < 3; action++) {
                res[day][action] = 0;
                for (int previousAction = 0; previousAction < 3; previousAction++) {
                    if (action == previousAction) {
                        continue;
                    }
                    res[day][action] = Math.max(res[day][action], res[day - 1][previousAction] + happines[day][action]);
                }
            }
        }
        Integer[] result = {res[vacationDays - 1][0], res[vacationDays - 1][1], res[vacationDays - 1][2]};

        System.out.println(Collections.max(Arrays.asList(result)));

    }
}
