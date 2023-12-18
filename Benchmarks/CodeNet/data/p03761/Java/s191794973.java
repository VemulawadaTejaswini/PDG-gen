package AtCoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String count = readLine();
        int iCount = Integer.parseInt(count);
        int[] alphabetTable = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetTable[i] = 1000;
        }
        for (int i = 0; i < iCount; i++) {
            String tempStr = readLine();
            for (int j = 0; j < 26; j++) {
                alphabetTable[j] = Math.min(CountChar(tempStr, (char) (0x61 + j)), alphabetTable[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < alphabetTable[i]; j++) {
                System.out.print((char) (0x61 + i));
            }
        }
        System.out.println("");
    }

    private static int CountChar(String input, char needle) {
        int count = 0;
        int now = 0;
        int index;
        while ((index = input.indexOf(needle, now)) >= 0) {
            count++;
            now = index + 1;
        }
        return count;
    }

    private static String readLine() {
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            line = reader.readLine();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return line;
    }

}
