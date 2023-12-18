import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long H = scan.nextLong();
        long W = scan.nextLong();
        if (H % 3 == 0 || W % 3 == 0) {
            System.out.println(0);
            return;
        }
        long answer = divide3(H,W);
        answer = Math.min(answer,divide3(W,H));
        answer = Math.min(answer,divide_mix(H,W));
        answer = Math.min(answer,divide_mix(W,H));
        System.out.println(answer);
    }
    public static long divide3(long H, long W) {
        if (H < 3) {
            return Long.MAX_VALUE;
        }
        if (H % 3 == 0) {
            return 0;
        }
        return W;
    }
    public static long divide_mix(long H, long W) {
        long answer = Long.MAX_VALUE;
        for (long i = 1; i < H; i++) {
            long s1 = i * W;
            long w = (long)Math.floor(W / 2);
            long s2 = (H - i) * w;
            long s3 = (H - i) * (W - w);
            long s_max = Math.max(s1, Math.max(s2, s3));
            long s_min = Math.min(s1, Math.min(s2, s3));
            answer = Math.min(answer, s_max - s_min);
        }
        return answer;
    }
}
