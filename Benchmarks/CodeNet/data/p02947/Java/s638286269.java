import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final char base[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char list[][] = new char[n][10];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextLine().toCharArray();
        }
        scanner.close();

        String[] data = new String[n];

        for (int j = 0; j < list.length; j++) {
            int counter[] = new int[26];
            for (int i = 0; i < list[j].length; i++) {
                counter[getCharPos(list[j][i])] += 1;
            }
            data[j] = getDataStr(counter);
        }

        int resultCount = 0;
        for (int i = 0; i < data.length; i++) {
            resultCount += getDupCount(data[i], data, i);
        }
        
        System.out.println(resultCount);
    }

    private static int getCharPos(char c) {
        for (int i = 0; i < base.length; i++) {
            if (c == base[i]) return i;
        }
        return 0;
    }

    private static String getDataStr(int[] data) {
        String[] s = new String[base.length];
        for (int i = 0; i < base.length; i++) {
            s[i] = String.valueOf(base[i]) + String.valueOf(data[i]);
        }
        return String.join("", s);
    }

    private static int getDupCount(String source, String[] data, int index) {
        int c = 0;
        for (int i = index + 1; i < data.length; i++) {
            if (data[i].equals(source)) c++;
        }
        return c;
    }
}