import org.apache.commons.lang.math.*;
import util.*;

public class Sample extends CommonUtil {
    public void foo() throws Exception {
        int n = 100000;
        int m = 99999;
        String str[] = new String[m];

        int src, dst;
        for (int i = 2; i <= m + 1; i++) {
            str[i - 2] =
                "1 " + i + " " + RandomUtils.nextInt(1000000000) + " "
                    + RandomUtils.nextInt(1000000000);
        }

        println(n + " " + m + " 1 2");
        for (int i = 0; i < m; i++) {
            println(str[i]);
        }
    }

    private String make(int s, int d) {
        if (s < d) {
            return s + " " + d;
        } else {
            return d + " " + s;
        }
    }

    public static void main(String[] args) {
        try {
            new Sample().foo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
