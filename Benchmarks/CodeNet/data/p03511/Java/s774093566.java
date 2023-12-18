import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);

    }

    private static void finish() {
    }

    public static void main(String[] args) {
        start();
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        String t = scan.nextLine();

        String low = s.compareTo(t) < 0 ? s : t;
        String high = s.compareTo(t) < 0 ? t : s;

        int highCount = 0;
        while ((n - high.length() * highCount) % low.length() != 0) {
            highCount++;
        }
        int lowCount = (n - high.length() * highCount) / low.length();
        StringBuilder sa = new StringBuilder("");
        for (int i = 0; i < lowCount; i++)
            sa.append(low);
        for (int i = 0; i < highCount; i++)
            sa.append(high);
        System.out.println(sa.toString());

        finish();
    }
}