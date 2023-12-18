import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            int yyyy = Integer.parseInt(S.substring(0, 4));
            int mm = Integer.parseInt(S.substring(5, 7));
            int dd = Integer.parseInt(S.substring(8, 10));

            System.out.println(isHeisei(yyyy, mm, dd) ? "Heisei" : "TBD");
        }
    }

    private static boolean isHeisei(int yyyy, int mm, int dd) {
        if (yyyy < 2019) {
            return true;
        }
        if (yyyy > 2019) {
            return false;
        }
        if (mm < 5) {
            return true;
        }
        return false;
    }
}
