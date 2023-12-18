import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int K = sc.nextInt();
        if (K < 10) {
            System.out.println(K);
            return;
        }
        int[] ret = new int[10];
        ret[0] = 1;
        for (int i = 1; i < K; i++) {
            ret = getNext(ret);
        }
        int i = 9;
        for (; ret[i] == 0; i--);
        for (; i >= 0; i--)
            System.out.print(ret[i]);
        System.out.println();
    }

    private static int[] getNext(int[] n) {
        int length = 10;
        for (;length > 0 && n[length - 1] == 0; length--);
        int i = 0;
        for (; i <= length; i++) {
            n[i]++;
            if (n[i] > 9 || i == length) continue;
            if (i == length - 1 || n[i + 1] - n[i] >= -1) {
                i++;
                break;
            }
        }
        for (i--; i > 0; i--) {
            n[i - 1] = Math.max(0, n[i] - 1);
        }
        return n;
    }
}
