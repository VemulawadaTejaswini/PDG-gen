import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time_1 = 100000;
        int time_2 = 4;

        int D = sc.nextInt();
        int[] c = new int[27];
        int[] t = new int[D + 1];
        int[] last_day = new int[27];
        Arrays.fill(last_day, 0);
        int[][] s = new int[D + 1][27];
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 1; i <= D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= D; i++) {
            Random random = new Random();
            t[i] = 1 + random.nextInt(26);
        }
        int[] last_array = t;

        long last_sum = 0;
        for (int j = 0; j < time_1; j++) {
            long tmp_sum = 0;
            Arrays.fill(last_day,0);
            for (int k = 0; k < time_2; k++) {
                Random random = new Random();
                int d = 1 + random.nextInt(D);
                int q = 1 + random.nextInt(D);
                int tmp = t[d];
                t[d] = t[q];
                t[q] = tmp;
                t[(d+q)/2] = 1 + random.nextInt(D);
            }
            for (int i = 1; i <= D; i++) {
                last_day[t[i]] = i;
                tmp_sum += calcS(c, s, t[i], i, last_day);
            }
            if (tmp_sum > last_sum) {
                last_array = t;
                last_sum = tmp_sum;
            } else {
                t = last_array;
            }
        }


        for (int i = 1; i <= D; i++) {
            System.out.println(t[i]);
        }

    }

    private static long calcS(int[] c, int[][] s, int kaisai, int day, int[] last_day) {

        long loss = 0;
        for (int i = 1; i <= 26; i++) {
            if (i == kaisai) {
                last_day[i] = day;
                continue;
            }
            loss -= c[i] * (day - last_day[i]);
        }

        long plus = s[day][kaisai];
        return plus + loss;
    }

}
