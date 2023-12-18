package AtCoder;

public class Main {
    public static void main(String[] args) {
        String count = System.console().readLine();
        int iCount = Integer.parseInt(count);
        int[] alphabetTable = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetTable[i] = 1000;
        }
        for (int i = 0; i < iCount; i++) {
            String tempStr = System.console().readLine();
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
            now = index;
        }
        return count;
    }

}
