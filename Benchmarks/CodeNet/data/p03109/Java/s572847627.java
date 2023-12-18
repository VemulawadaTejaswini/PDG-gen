import java.util.Scanner;

public class Main {
    private static StringBuilder sb;

    public static void main(String[] args) {
        init();

        String result = "TBD";
        int slash1 = sb.indexOf("/", 0);
        int slash2 = sb.indexOf("/", slash1 + 1);

        int year = Integer.parseInt(sb.substring(0, slash1));
        int month = Integer.parseInt(sb.substring(slash1 + 1, slash2));

        if (year < 2019) {
            result = "Heisei";
        } else if (year == 2019) {
            if (month <= 4) {
                result = "Heisei";
            }
        }

        System.out.println(result);
    }

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        sb = new StringBuilder(scanner.next());
    }
}