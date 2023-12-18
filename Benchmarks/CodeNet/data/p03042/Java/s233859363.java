import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int forward = Integer.parseInt(s.substring(0, 3));
        int back = Integer.parseInt(s.substring(3));

        String result = "NA";
        if (forward < 13 && forward > 0 && back < 13 && back > 0) {
            result = "AMBIGUOUS";
        } else if (forward > 13 && back <= 12 && back > 0) {
            result = "YYMM";
        } else if (back > 13 && forward <= 12 && forward > 0) {
            result = "MMYY";
        }

        System.out.println(result);
    }
}