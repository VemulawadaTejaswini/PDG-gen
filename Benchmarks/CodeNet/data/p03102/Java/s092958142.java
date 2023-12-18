import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);
        str = stdR.readLine().split(" ");
        int[] B = new int[M];
        for(int i = 0 ; i < M ; i++) {
            B[i] = Integer.parseInt(str[i]);
        }
        int[][] A = new int[N][M];
        for(int i = 0 ; i < N ; i++) {
            str = stdR.readLine().split(" ");
            for(int j = 0 ; j < M ; j++) {
                A[i][j] = Integer.parseInt(str[j]);
            }
        }
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            int num = 0;
            for(int j = 0 ; j < M ; j++) {
                num += A[i][j] * B[j];
            }
            num += C;
            if(num > 0)count++;
        }
        System.out.println(count);
    }
}
