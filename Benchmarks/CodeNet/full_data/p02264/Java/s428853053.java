import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Process> ad = new ArrayDeque<Process>();
        int[] n = createListInt(br.readLine());
        int totalTime = 0;
        for (int i = 0; i < n[0]; i++) {
            String[] lines = br.readLine().split(" ");
            ad.add(new Process(lines[0], ip(lines[1])));
        }
        int m = n[1];
        while (!ad.isEmpty()) {
            Process t = ad.poll();
            if (m < t.time) {
                ad.add(new Process(t.name, t.time - m));
                totalTime+=m;
            } else {
                totalTime+=t.time;
                System.out.println(t.name+" "+totalTime);
            }
        }

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

class Process {
    String name;
    int time;

    Process(String name, int time) {
        this.name = name;
        this.time = time;
    }
}