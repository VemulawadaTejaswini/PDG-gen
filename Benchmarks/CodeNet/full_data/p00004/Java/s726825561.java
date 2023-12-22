import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.StringBuffer;
import java.lang.System;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] a) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num[] = new int[6];
        try {
            String line = r.readLine();
            while(line != null) {
                st = new StringTokenizer(line);
                for (int i = 0; i < 6; i++) {
                    num[i] = Integer.parseInt(st.nextToken());
                }

                double y = (num[0]*num[5] - num[2]*num[3])/(num[0]*num[4] - num[1]*num[3]);
                double x = (num[2] - num[1]*y)/num[0];

                BigDecimal xBd = new BigDecimal(x);
                BigDecimal xBd2 = xBd.setScale(3, BigDecimal.ROUND_HALF_UP);

                BigDecimal yBd = new BigDecimal(y);
                BigDecimal yBd2 = yBd.setScale(3, BigDecimal.ROUND_HALF_UP);

                StringBuffer strBuf = new StringBuffer();
                strBuf.append(xBd2);
                strBuf.append(" ");
                strBuf.append(yBd2);

                System.out.println(strBuf.toString());

                line = r.readLine();
            }
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}