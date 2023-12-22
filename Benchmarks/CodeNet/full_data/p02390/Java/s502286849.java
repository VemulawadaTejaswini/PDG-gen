
import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static final int HH_TIME = 3600;
    private static final int MM_TIME = 60;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(timeChangeHMS(scanner.nextInt()));
    }

    /*
     * 秒数からHH:MM:SSで変換します。
     */
    private static String timeChangeHMS(int input) {
        Integer hh = 0;
        Integer mm = 0;
        Integer ss = 0;
        if (input >= HH_TIME) {
            Integer mm_s = 0;
            hh = input / HH_TIME;
            mm_s = input % HH_TIME;
            if (mm_s >= MM_TIME) {
                mm = mm_s / MM_TIME;
                ss = mm_s % MM_TIME;
            } else {
                ss = mm_s;
            }
        } else {
            mm = input / MM_TIME;
            ss = input % MM_TIME;
        }
        return hh.toString() + ":" + mm.toString() + ":" + ss.toString();
    }
}