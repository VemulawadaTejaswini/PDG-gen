import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();

        long ret = 0;

        for (int mask = 0; mask < (1 << (len - 1)); mask++) {
            String str = S;

            int accumulatedNum = 0;

            for (int j = 0; j < len - 1; j++) {
                if (((mask >> j) & 1) == 1) {
                    String substracted = str.substring(str.length() - 1 - accumulatedNum, str.length());
                    str = str.substring(0, str.length() - 1 - accumulatedNum);
                    accumulatedNum = 0;
                    ret += Long.parseLong(substracted);
                } else {
                    accumulatedNum++;
                }
            }

            ret += Long.parseLong(str);
        }

        System.out.println(ret);
    }
}