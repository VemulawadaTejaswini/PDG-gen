import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String str = readLineStandardInput();
        String[] mem = str.split(" ");
        int N = Integer.parseInt(mem[0]);
        long C = Long.parseLong(mem[1]);
        String[] strs = readLinesStandardInput(N);
        long[] x = new long[N];
        int[] v = new int[N];
        boolean[] isSetSushi = new boolean[N];
        for(int i = 0; i < x.length; i++){
            String[] mems = strs[i].split(" ");
            x[i] = Long.parseLong(mems[0]);
            v[i] = Integer.parseInt(mems[1]);
            isSetSushi[i] = true;
        }

        long totalCal = 0;
        long totalCalTmp = 0;
        long[] sumVClock = new long[N];
        long[] sumVInvClock = new long[N];
        long totalCalMax = 0;
        /* calc clock max */
        for(int i = 0; i < x.length; i++){
            totalCalTmp += v[i];
            sumVClock[i] = totalCalTmp;
            totalCal = totalCalTmp - x[i];
            if(totalCal > totalCalMax){
                totalCalMax = totalCal;
            }
        }
        /* calc inv clock max */
        totalCalTmp = 0;
        for(int i = x.length - 1; i >= 0; i--){
            totalCalTmp += v[i];
            sumVInvClock[i] = totalCalTmp;
            totalCal = totalCalTmp - C + x[i];
            if(totalCal > totalCalMax) {
                totalCalMax = totalCal;
            }
        }
        /* calc clock and inv clock max */
        totalCal = 0;
        long tmp_clock_cal = 0;
        for(int i = 0; i < x.length && x[i] * 2 < C; i++){
//            tmp_clock_cal += v[i];
            tmp_clock_cal = sumVClock[i];
            long tmp_inv_cal = 0;
            for(int j = x.length - 1; j >= 0 && x[j] * 2 >= C; j--){
//                tmp_inv_cal += v[j];
                tmp_inv_cal = sumVInvClock[j];
                totalCal = tmp_clock_cal + tmp_inv_cal;
                totalCal -= ( x[i] + (C - x[j]));
                long tmp = x[i] < (C - x[j]) ? x[i] : (C - x[j]);
                totalCal -= tmp;
                if(totalCal > totalCalMax){
                    totalCalMax = totalCal;
                }
            }
        }
        System.out.println(totalCalMax);
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }

    private static String[] readLinesStandardInput(int lineNum) {
        String[] str = new String[lineNum];
        try {
            for(int i = 0; i < lineNum; i++)
                str[i] = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }
}
