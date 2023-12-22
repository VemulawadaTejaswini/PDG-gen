import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> ad = new ArrayDeque<String>();
        int n = ip(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            switch (lines[0]) {
            case "insert":
                ad.push(lines[1]);
                break;
            case "delete":
                ad.remove(lines[1]);
                break;
            case "deleteFirst":
                ad.removeFirst();
                break;
            case "deleteLast":
                ad.removeLast();
                break;
            }
        }
        System.out.println(ad.parallelStream().collect(Collectors.joining(" ")));
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