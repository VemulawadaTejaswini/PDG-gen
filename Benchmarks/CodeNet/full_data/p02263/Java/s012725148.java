import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> ad = new ArrayDeque<String>();
        String[] lines = br.readLine().split(" ");
        for (int i = 0; i < lines.length; i++) {
            if (isNumber(lines[i])) {
                ad.push(lines[i]);
            } else {
                if (lines[i].equals("+")) {
                    ad.push(String.valueOf(ip(ad.pop()) + ip(ad.pop())));
                } else if (lines[i].equals("-")) {
                    ad.push(String.valueOf(-ip(ad.pop()) + ip(ad.pop())));
                } else {
                    ad.push(String.valueOf(ip(ad.pop()) * ip(ad.pop())));
                }
            }
        }
        System.out.println(ad.pop());
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}