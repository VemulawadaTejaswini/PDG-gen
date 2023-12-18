import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 枚数
        int N = sc.nextInt();
        // 合計金額
        int Y = sc.nextInt();
        // x=10000円札の枚数
        int z = 0;
        // y=5000円札の枚数
        int y = 0;
        // z=1000円札の枚数
        int x = 0;

        // 見つかったら立てる
        int flag = 0;

        int AnsZ = -1;
        int AnsY = -1;
        int AnsX = -1;
        for (z = 0; z <= N && flag == 0; z++) {
            for (y = 0; y <= N - z; y++) {
                int tempY = 1000 * N + 9000 * x + 4000 * y;
                if (tempY == Y) {
                    // flag立てる
                    flag = 1;
                    AnsZ = z;
                    AnsY = y;
                    AnsX = N-z-y;
                    break;
                }
            }
        }
        System.out.println(AnsZ+" "+ AnsY+" "+ AnsX);
    }
}