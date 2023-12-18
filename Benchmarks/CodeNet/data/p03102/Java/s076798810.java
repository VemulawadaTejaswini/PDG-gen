import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    private static int LINE_NUMBER = 0;
    private static int CODE_NUMBER = 0;
    private static int BIAS = 0;

    private static int solver(int[] coe, int[] src) {

        int sum = BIAS;
        for (int i = 0; i < CODE_NUMBER; i++) {
            sum += (coe[i] * src[i]);
        }
        if(sum > 0){
            return 1;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);


        try {
            String[] inputArray = br.readLine().split(" ");
            LINE_NUMBER = Integer.parseInt(inputArray[0]);
            CODE_NUMBER = Integer.parseInt(inputArray[1]);
            BIAS = Integer.parseInt(inputArray[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] coe = new int[CODE_NUMBER];
        int[] src = new int[CODE_NUMBER];
        int answer = 0;
        try {
            String[] inputArray = br.readLine().split(" ");
            for (int j = 0; j < CODE_NUMBER; j++) {
                coe[j] = Integer.parseInt(inputArray[j]);
            }

            for (int line = 0; line < LINE_NUMBER; line++) {
                String[] srcArray = br.readLine().split(" ");
                for (int idx = 0; idx < CODE_NUMBER; idx++) {
                    src[idx] = Integer.parseInt(srcArray[idx]);
                }
                answer += solver(coe, src);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(answer);

    }
}