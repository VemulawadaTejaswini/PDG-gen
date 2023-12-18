import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        long limit[] = new long[5];
        long N = 0;
        long time = 0;

        try {
            N = Long.parseLong(br.readLine());
        } catch (IOException e) {

        }
        for (int i=0; i<5; i++) {
            try {
                limit[i] = Long.parseLong(br.readLine());
            } catch (IOException e) {

            }
        }
        long min = limit[0];
        int min_index = 0;
        for (int i=1; i<5; i++) {
            if (min > limit[i]) {
                min = limit[i];
                min_index = i;
            }
        }

        time = N / min + boolToInteger((N % min)!=0) + 4;

        System.out.println(time);
    }

    private static int boolToInteger(boolean b) {
        if (b == true) {
            return 1;
        } else {
            return 0;
        }
    }
   
}