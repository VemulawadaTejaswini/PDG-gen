import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        try {
            cnt = Integer.valueOf(in.readLine());

            for (int i = 0; i < cnt; i++) {
                if (isParallel(in.readLine().split(" "))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isParallel(String[] split) {

        long x1 = toInt(split[0]);
        long y1 = toInt(split[1]);
        long x2 = toInt(split[2]);
        long y2 = toInt(split[3]);
        long x3 = toInt(split[4]);
        long y3 = toInt(split[5]);
        long x4 = toInt(split[6]);
        long y4 = toInt(split[7]);

        boolean result = false;

        if (y2 - y1 == 0) {
            result = y4 - y3 == 0;
        } else if (x4 - x3 == 0) {
            result = x2 - x1 == 0;
        } else {
            result = (x2 - x1) * (y4 - y3) == (x4 - x3) * (y2 - y1);
        }

        return result;
    }

    private static long toInt(String data) {

        long result = 0;

        String[] dataAry = data.split("\\.");
        if (dataAry.length == 1) {
            result = Long.valueOf(data) * 100000;
        } else {

            result = Long.valueOf(dataAry[0]) * 100000;

            if (result < 0) {
                result -= Long.valueOf(dataAry[1])
                        * Math.pow(10, 5 - dataAry[1].length());
            } else {
                result += Long.valueOf(dataAry[1])
                        * Math.pow(10, 5 - dataAry[1].length());
            }
        }

        return result;
    }
}