import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] s = stdR.readLine().split(" ");
        int[] A = new int[N];
        for(int i = 0 ; i < N; i++) {
            int num = Integer.parseInt(s[i]);
            int count = 0;
            while(true) {
                if(num % 2 == 0) {
                    count++;
                    num /= 2;
                }else {
                    break;
                }
            }
            A[i] = count;
        }
        Arrays.sort(A);
        System.out.println(A[0]);
    }
}