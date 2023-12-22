import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static String line;

    static String[] sx = { "XC", "XL", "XXX", "XX", "XIX", "XIV", "XIII", "XII", "XI", "XVIII", "XVII", "XVI", "XV",
            "X" };
    static int[] ix = { 90, 40, 30, 20, 19, 14, 13, 12, 11, 18, 17, 16, 15, 10 };

    static String[] sl = { "LXXX", "LXX", "LX", "L" };
    static int[] il = { 80, 70, 60, 50 };

    static String[] sv = { "VIII", "VII", "VI", "V" };
    static int[] iv = { 8, 7, 6, 5 };

    static String[] si = { "IX", "IV", "III", "II", "I" };
    static int[] ii = { 9, 4, 3, 2, 1 };

    static String[] so = { "M", "D", "C" };
    static int[] io = { 1000, 500, 100 };

    static String[] sss;
    static int[] iii;

    static int getValue() {
        setarr();

        for (int i = 0; i < sss.length; i++) {
            if (line.startsWith(sss[i])){
                line = line.replaceFirst(sss[i], "");
                return iii[i];
            }
        }

        return 0; // unreachable
    }

    static void setarr() {
        switch (line.charAt(0)) {
        case 'X':
            sss = sx;
            iii = ix;
            break;
        case 'L':
            sss = sl;
            iii = il;
            break;
        case 'V':
            sss = sv;
            iii = iv;
            break;
        case 'I':
            sss = si;
            iii = ii;
            break;
        default:
            sss = so;
            iii = io;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((line = br.readLine()) != null) {
            int score = getValue();

            while (line.length() != 0) {
                int next = getValue();
                if (score >= next)
                    score += next;
                else
                    score = next-score;
            }

            System.out.println(score);
        }
    }
}
