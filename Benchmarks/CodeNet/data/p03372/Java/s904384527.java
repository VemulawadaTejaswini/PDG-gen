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

        long totalCalTmp = 0;
        long clockMax = 0;
        long invClockMax = 0;
        long[] clockVList = new long[N];
        long[] clockVRTList = new long[N];
        long[] invClockVList = new long[N];
        long[] invClockVRTList = new long[N];
        /* calc clock max */
        for(int i = 0; i < x.length; i++){
            totalCalTmp += v[i];
            long totalCal = totalCalTmp - x[i];
            if(totalCal > clockMax){
                clockMax = totalCal;
            }
            clockVList[i] = clockMax;
            long tmp = totalCal - x[i];
            if(i != 0) {
                if(clockVRTList[i - 1] < tmp) {
                    clockVRTList[i] = tmp;
                }
                else {
                    clockVRTList[i] = clockVRTList[i - 1];
                }
            }
            else {
                clockVRTList[i] = tmp;
            }
        }
        /* calc inv clock max */
        totalCalTmp = 0;
        for(int i = x.length - 1; i >= 0; i--){
            totalCalTmp += v[i];
            long totalCal = totalCalTmp - C + x[i];
            if(totalCal > invClockMax) {
                invClockMax = totalCal;
            }
            invClockVList[i] = invClockMax;
            long tmp = totalCal - (C - x[i]);
            if(i != x.length - 1){
                if(invClockVRTList[i + 1] < tmp){
                    invClockVRTList[i] = tmp;
                }
                else {
                    invClockVRTList[i] = invClockVRTList[i + 1];
                }
            }
            else {
                invClockVRTList[i] = tmp;
            }
        }
        /* calc clock and inv clock max */
        long maxValue;
        if(clockMax > invClockMax){
            maxValue = clockMax;
        }
        else{
            maxValue = invClockMax;
        }
        if(maxValue <= 0){
            System.out.println(0);
            return;
        }
        long maxTmp = -1; long invMaxTmp = -1;
        for(int i = 0; i < N - 1; i++){
            if(clockVList[i] > 0 && invClockVRTList[i + 1] > 0) {
                maxTmp = clockVList[i];
                invMaxTmp = invClockVRTList[i + 1];
                long tmp = maxTmp + invMaxTmp;
                if (tmp > maxValue) {
                    maxValue = tmp;
                }
            }
        }

        for(int i = N - 1; i > 0; i--){
            if(invClockVList[i] > 0 && clockVRTList[i - 1] > 0) {
                maxTmp = invClockVList[i];
                invMaxTmp = clockVRTList[i - 1];
                long tmp = maxTmp + invMaxTmp;
                if (tmp > maxValue) {
                    maxValue = tmp;
                }
            }
        }
        System.out.println(maxValue);
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
