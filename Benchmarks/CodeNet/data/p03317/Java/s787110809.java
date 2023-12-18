import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exec(args);
    }

    public static void exec(String[] args) {
        String str = readLineStandardInput();
        String[] mem = str.split(" ");
        int N = Integer.parseInt(mem[0]);
        int K = Integer.parseInt(mem[1]);

        int[] An = new int[N];
        str = readLineStandardInput();
        String[] memAn = str.split(" ");
        for(int i = 0; i < memAn.length; i++){
            An[i] = Integer.parseInt(memAn[i]);
        }
        int idx = -1;
        { // get min value index
            int minValue = Integer.MAX_VALUE;
            for(int i = 0; i < An.length; i++){
                if(An[i] < minValue){
                    idx = i;
                    minValue = An[i];
                }
            }
        }
        int minCnt = Integer.MAX_VALUE;
        for(int i = 0; i < K; i++) {
            int cnt = 1;
            { // left side num
                int leftSide = idx - i;
                while(leftSide > 0){
                    leftSide -= (K - 1);
                    cnt++;
                }
            }
            { // right side num
                int rightSide = idx + (K - i - 1);
                while(rightSide < N - 1){
                    rightSide += (K - 1);
                    cnt++;
                }
            }
            if(cnt < minCnt){
                minCnt = cnt;
            }
        }
        System.out.println(minCnt);
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
}
