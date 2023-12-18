import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
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
        int cnt = 0;
        { // left side num
            if(idx == 0){
                cnt += 0;
            }
            else if(idx + 1 >= K){
                int tmp = idx / (K - 1);
                if(tmp * (K - 1) != idx){
                    cnt += tmp + 1;
                }
                else {
                    cnt += tmp;
                }
            }
            else {
                cnt += 1;
                idx = K - 1;
            }
        }
        { // right side num
            int rightSideNum = N - idx - 1;
            if(rightSideNum == 0){
                cnt += 0;
            }
            else if(rightSideNum + 1 >= K){
                int tmp = rightSideNum / (K - 1);
                if(tmp * (K - 1) != rightSideNum){
                    cnt += tmp + 1;
                }
                else {
                    cnt += tmp;
                }
            }
            else {
                cnt += 1;
            }
        }
        System.out.println(cnt);
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
