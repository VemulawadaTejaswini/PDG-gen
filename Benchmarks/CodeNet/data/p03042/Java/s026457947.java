import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String text = std.next();
        String first = text.substring(0, 2);
        String last = text.substring(2);
        Integer firstValue = Integer.parseInt(first);
        Integer lastValue = Integer.parseInt(last);

        String format;
        if (availableMonth(firstValue) && availableMonth(lastValue)) {
            format = "AMBIGUOUS";
        } else if (availableMonth(firstValue)) {
            format = "MMYY";
        } else if (availableMonth(lastValue)) {
            format = "YYMM";
        } else {
            format = "NA";
        }

        System.out.println(format);
    }

    static boolean availableMonth(int val) {
        return val >= 1 && val <= 12;
    }
}
