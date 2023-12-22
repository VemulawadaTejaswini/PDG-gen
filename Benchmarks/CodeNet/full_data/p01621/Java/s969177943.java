import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int s = in.nextInt(), n = in.nextInt(), t = in.nextInt();
        boolean weekday = !"All".equals(in.next());
        Time time = Time.parse(in.next());
        int p = in.nextInt(), m = in.nextInt();

        while (time != Time.NONE) {
            //System.out.println(weekday + " " + time);

            int maxCount = 0;
            for (int start = 0; start < 10080; start++) {
                int now = start, count = 0;
                for (int i = 0; i < m; i++) {
                    int from = now, end = from + s;
                    boolean success = true;
                    if (time == Time.DAY) {
                        if (from % 1440 < 360 || from % 1440 >= 1080 || end % 1440 < 360 || end % 1440 >= 1080) success = false;
                    } else if (time == Time.NIGHT) {
                        if (from % 1440 >= 360 && from % 1440 < 1080) success = false;
                        if (end % 1440 >= 360 && end % 1440 < 1080) success = false;
                    }
                    if (weekday) {
                        if (from % 10080 >= 1440 || end % 10080 >= 1440) success = false;
                    }
                    if (success) count++;
                    now += t;
                }
                maxCount = Math.max(maxCount, count);
            }
            out.printf("%.10f\n", 1.0 - Math.pow(1.0 - 1.0 / p, maxCount * n));
            //out.println(maxCount);

            s = in.nextInt();
            n = in.nextInt();
            t = in.nextInt();
            weekday = !"All".equals(in.next());
            time = Time.parse(in.next());
            p = in.nextInt();
            m = in.nextInt();
        }

        out.flush();
    }

    enum Time {
        ALL, DAY, NIGHT, NONE;
        static Time parse(String s) {
            return Time.valueOf(s.toUpperCase());
        }
    }

}

