import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kadai
 */
public class Main {

    public void go() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String lines0;
            String lines1;
            lines0 = sc.nextLine();
            if (lines0.equals(".")) {
                sc.close();
                return;
            }
            lines1 = sc.nextLine();

            if (lines0.equals(lines1)) {
                System.out.println("IDENTICAL");
                continue;
            }
            if (lines0.length() != lines1.length()) {
                System.out.println("DIFFERENT");
                continue;
            }

            String[] strSplit0 = lines0.split("\"", -1);
            String[] strSplit1 = lines1.split("\"", -1);
            if (strSplit0.length != strSplit1.length) {
                System.out.println("DIFFERENT");
                continue;
            }

            int close = 0;
            for (int j = 0; j < strSplit0.length; j++) {
                if (!strSplit0[j].equals(strSplit1[j])) {
                    if (j % 2 == 1) {
                        close++;
                    } else {
                        close = 2;
                        break;
                    }
                }

            }
            switch (close) {
            case 1:
                System.out.println("CLOSE");
                break;
            case 0:
                System.out.println("IDENTICAL");
                break;
            default:
                System.out.println("DIFFERENT");

            }
        }
    }

    public static void main(String[] args) {
        Main kadai = new Main();
        kadai.go();
    }
}
