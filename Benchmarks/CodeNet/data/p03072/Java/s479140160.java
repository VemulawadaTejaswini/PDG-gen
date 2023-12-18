import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H[] = new int[N];

        int res = 1, min = 0;
        Arrays.setAll(H, i -> scanner.nextInt());

        for (int i = 1; i < N; i ++) {
            if (H[i] >= H[min]) {
                res ++;
                min = i;
            }
        }

        System.out.println(res);
    }
}
