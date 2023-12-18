import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static final int INF = Integer.MAX_VALUE / 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] red = new int[2 * N];
        int[] blue = new int[2 * N];
        Arrays.fill(red, INF);
        Arrays.fill(blue, INF);
        for (int i = 0; i < N; i++) {
            red[scanner.nextInt()] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            blue[scanner.nextInt()] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 2 * N; i++) {
            if (blue[i] != INF) {
                int maxY = -1;
                int maxIdx = -1;
                for (int j = 0; j <= i; j++) {
                    if (red[j] != INF && maxY <= red[j]) {
                        maxIdx = j;
                    }
                }
                if (maxIdx >= 0) {
                    ans++;
                    red[maxIdx] = INF;
                }
            }
        }
        System.out.println(ans);
    }
}