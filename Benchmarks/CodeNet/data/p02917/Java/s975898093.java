import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long[] B = new long[n-1];
        Arrays.setAll(B, i -> Integer.parseInt(sc.next()));
        ans += B[0] + B[n - 2];
        for(int i = 1; i < n - 1; i++) ans += Math.min(B[i - 1], B[i]);
        System.out.println(ans);
    }
}
