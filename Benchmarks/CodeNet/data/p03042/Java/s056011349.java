import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = sc.next();

        String ans = null;
        if (isYYMM(s) && isMMYY(s)) {
            ans = "AMBIGUOUS";
        } else if (isYYMM(s)) {
            ans = "YYMM";
        } else if (isMMYY(s)) {
            ans = "MMYY";
        } else {
            ans = "NA";
        }

        System.out.println(ans);
    }

    private static boolean isYYMM(String s) {
        int mm = Integer.valueOf(s.substring(2, 4));
        return s.substring(0, 2).matches("[0-9]{2}") && 0 < mm && mm <= 12;
    }

    private static boolean isMMYY(String s) {
        int mm = Integer.valueOf(s.substring(0, 2));
        return s.substring(2, 4).matches("[0-9]{2}") && 0 < mm && mm <= 12;
    }


}
