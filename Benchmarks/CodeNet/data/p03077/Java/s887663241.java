import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] caps = new long[5];
        for (int i = 0; i < 5; i++) {
            caps[i] = sc.nextLong();
        }

        long min = Arrays.stream(caps).min().getAsLong();

        long ans = (n + min + - 1) / min + 4;
        System.out.print(ans);
    }

}
