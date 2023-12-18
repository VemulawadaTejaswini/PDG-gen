import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        if(K != 0) {
            System.out.println(-1);
        }else {
            int[] array = new int[(int)Math.pow(2, M + 1)];
            int num = 0;
            for(int i = 0 ; i < array.length / 2 ; i++) {
                array[i * 2] = num;
                array[i * 2 + 1] = num;
                num++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < array.length ; i++) {
                sb.append(array[i]+" ");
            }
            System.out.println(sb.toString().substring(0,sb.length() - 1));
        }
    }
}
