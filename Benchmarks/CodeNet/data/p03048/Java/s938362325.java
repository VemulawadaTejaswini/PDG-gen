import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainB {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = reader.readLine().split(" ");
        int R = Integer.parseInt(a[0]);
        int G = Integer.parseInt(a[1]);
        int B = Integer.parseInt(a[2]);
        int N = Integer.parseInt(a[3]);
        // r * R + g * G + b * B == N => r = (N - g * G + b * B) / R
        int count = 0;
        for (int g = 0; g <= N; g++) {
            for (int b = 0; b <= N; b++) {
                int rR = N - g * G - b * B;
                if ((0 <= rR) && (rR % R == 0)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
