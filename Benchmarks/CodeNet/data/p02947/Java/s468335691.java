import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String[] Sn;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Sn = new String[N];
            for (int i = 0; i < N; i++) {
                Sn[i] = sc.next();
            }
        }
        String[] sortedChar = new String[N];
        for (int i = 0; i < N; i++) {
            sortedChar[i] = sortStr(Sn[i]);
        }
        String[] sortedStr = sortStrArr(sortedChar);
        long count = 1;
        long result = 0;
        for (int i = 1; i < N; i++) {
            if (sortedStr[i].equals(sortedStr[i - 1])) {
                count++;
            } else {
                if (count == 1) {
                    continue;
                }
                result += combi2(count);
                count =1;
            }
        }
        if (count > 1) {
            result += combi2(count);
        }
        System.out.println(result);
        return;
    }

    private static String sortStr(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    private static String[] sortStrArr(String[] strArr) {
        Arrays.sort(strArr);
        return strArr;
    }

    private static long combi2(long count) {
        return count * (count - 1) / 2;
    }
}
