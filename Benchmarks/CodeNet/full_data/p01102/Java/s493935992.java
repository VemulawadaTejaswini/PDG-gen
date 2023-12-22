import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kadai
 */
public class Main {

    public void go() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] lines = new String[2];
            String[][] linesStruct = new String[2][];
            lines[0] = sc.nextLine();
            if (lines[0].equals(".")) {
                return;
            }
            lines[1] = sc.nextLine();

            linesStruct[0] = lines[0].split(";");
            linesStruct[1] = lines[1].split(";");
            if (lines[0].equals(lines[1])) {
                System.out.println("IDENTICAL");
                continue;
            }
            if (linesStruct[0].length != linesStruct[1].length) {
                System.out.println("DIFFERENT");
                continue;
            }

            int size = linesStruct[0].length;
            int close = 0;
            boolean flg = false;
            for (int i = 0; i < size; i++) {
                String str0 = linesStruct[0][i];
                String str1 = linesStruct[1][i];
                String[] strSplit0 = str0.split("\"", -1);
                String[] strSplit1 = str1.split("\"", -1);
                if (strSplit0.length != strSplit1.length) {
                    close = 2;
                    flg = true;
                    break;
                }
                for (int j = 0; j < strSplit0.length; j++) {
                    if (!strSplit0[j].equals(strSplit1[j])) {
                        if (j % 2 == 1) {
                            close++;
                        } else {
                            close = 2;
                            flg = true;
                        }
                    }

                    if (flg) {
                        break;
                    }
                }
                if (flg) {
                    break;
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
