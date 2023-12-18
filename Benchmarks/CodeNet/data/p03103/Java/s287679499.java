import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        int row, idx;
        long[][] list;
        long m, ret;

        in = scanner.nextLine().split(" ");
        row = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);

        list = new long[row][2];
        for (int i = 0; i < row; i++) {
            in = scanner.nextLine().split(" ");
            list[i][0] = Integer.parseInt(in[0]);
            list[i][1] = Integer.parseInt(in[1]);
        }

        idx = -1;
        ret = 0;
        while (m > 0) {
            double min = Long.MAX_VALUE;
            for (int i = 0; i < row; i++) {
                if (list[i][0] < min) {
                    min = list[i][0];
                    idx = i;
                }
            }
            if (m > list[idx][1]) {
                ret += list[idx][0] * list[idx][1];
                m -= list[idx][1];
            } else {
                ret += list[idx][0] * m;
                break;
            }
            list[idx][0] = Long.MAX_VALUE;
        }

        System.out.println(ret);
    }
}