import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
        String c = stdReader.readLine();
        String vals = stdReader.readLine();
        
        long[] ls = new long[Integer.valueOf(c)];
        String[] ss = vals.split(" ");

        long total = 0;

        long[] sunu = new long[Integer.valueOf(c)];
        for (int i = 0; i < ls.length ;i++) {
            long v = Long.valueOf(ss[i]);
            ls[i] = v;

            total += v;
            sunu[i] = total;
        }

        long before = 0;
        for (int i = 0; i < ls.length ;i++) {
            long arai = total - sunu[i];

            long current = Math.abs(arai - sunu[i]);
            if (i != 0 && before <= current) {
                System.out.println(before);
                break;
            }
            if (i == ls.length - 1) {
                System.out.println(before);
            }
            before = current;
        }

    }

}
