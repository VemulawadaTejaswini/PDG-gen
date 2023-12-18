import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static int N, K;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        N = Integer.parseInt(inStr[0]);
        K = Integer.parseInt(inStr[1]);
        arr = new int[N];
        inStr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inStr[i]);
        }

        int min = Integer.MAX_VALUE;
        int left, right, num;
        for (int i = 0; i < N - K + 1; i++) {
            left = arr[i];
            right = arr[i + K - 1];
            if (right < 0) {
                num = Math.abs(left);
                min = Math.min(min, num);
                continue;
            }
            if (left >= 0) {
                num = right;
                min = Math.min(min, num);
                continue;
            }
            if (left < 0 && right >= 0) {
                num = Math.min(Math.abs(left) * 2 + right, Math.abs(left) + right * 2);
                min = Math.min(min, num);
            }
        }
        System.out.println(min);
    }
}
