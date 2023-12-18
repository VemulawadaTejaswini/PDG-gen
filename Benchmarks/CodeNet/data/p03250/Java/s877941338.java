import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sArr[] = br.readLine().split(" ");
            int numArr[] = new int[sArr.length];
            numArr[0] = Integer.parseInt(sArr[0]);
            numArr[1] = Integer.parseInt(sArr[1]);
            numArr[2] = Integer.parseInt(sArr[2]);
            Arrays.sort(numArr);
            System.out.println(numArr[2] * 10 + numArr[1] + numArr[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
