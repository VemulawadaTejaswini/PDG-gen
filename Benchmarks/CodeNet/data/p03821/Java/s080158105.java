import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            long n = Integer.parseInt(br.readLine());
            ArrayList<Long> a = new ArrayList<Long>();
            ArrayList<Long> b = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                String tmp[] = br.readLine().split(" ");
                a.add(Long.parseLong(tmp[0]));
                b.add(Long.parseLong(tmp[1]));
            }
            long count = 0;
            for (long i = n; i > 0; i--) {
                Long atmp = a.get((int) (i - 1));
                atmp = atmp + count;
                Long btmp = b.get((int) (i - 1));
                count = count + getCount(atmp, btmp);
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long getCount(long a, long b) {
        long result = 0;
        if (b == 1) {
            result = 0;
        } else  if (a < b) {
            result = b - a;
        } else if (a > b) {
            long tmp = a / b;
            long btmp = b * tmp;
            if (a > btmp) {
                btmp = b * (tmp + 1);
            }
            result = btmp - a;
        }
        return result;
    }
}