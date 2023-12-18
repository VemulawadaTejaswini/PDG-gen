

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String [][] result = new String [s.length() + 1][t.length() + 1];

        for (int i = 0; i <= s.length(); ++i) {
            for (int j = 0; j <= t.length(); ++j) {
                result[i][j] = "";

                if (i - 1 >= 0 && j - 1 >= 0) {
                    result[i][j] = result[(i - 1)][(j - 1)] +
                            (s.charAt(i - 1) == t.charAt(j - 1)
                                    ? String.valueOf(s.charAt(i - 1))
                                    : ""
                            );
                }
                if (i - 1 >= 0) {
                    if (result[i][j].length() <= result[(i - 1)][j].length()) {
                        result[i][j] = result[(i - 1)][j];
                    }
                }
                if (j - 1 >= 0) {
                    if (result[i][j].length() <= result[i][(j - 1)].length()) {
                        result[i][j] = result[i][(j - 1)];
                    }
                }
               // System.out.println("result[" + i + "][" + j + "]: " + result[i][j]);
            }
        }
        System.out.println(result[s.length()][t.length()]);
    }
}
