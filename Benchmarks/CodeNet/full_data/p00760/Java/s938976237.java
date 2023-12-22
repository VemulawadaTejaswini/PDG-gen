import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int millenium = getDays(1000, 1, 1);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = getDays(sc.nextInt(), sc.nextInt(), sc.nextInt());
            sb.append(millenium - x).append("\n");
        }
        System.out.print(sb);
    }
    
    static int[] DAYS = new int[]{20, 19, 20, 19, 20, 19, 20, 19, 20, 19};
    static int[] YEAR_DAYS = new int[]{0, 195, 195 * 2};
    static int THREE_YEARS = 195 * 2 + 200;
    static int getDays(int y, int m, int d) {
        int past = (y - 1) / 3 * THREE_YEARS;
        int mod = (y - 1) % 3;
        past += YEAR_DAYS[mod];
        if (mod == 2) {
            past += (m - 1) * 20;
        } else {
            for (int i = 0; i < m - 1; i++) {
                past += DAYS[i];
            }
        }
        past += d;
        return past;
    }
}
