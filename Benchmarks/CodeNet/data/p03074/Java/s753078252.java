import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();
        int[] len = new int[s.length()];

        for (int i = 0; i < c.length; i++) {
            int k = K;
            if (i != 0 && c[i - 1] == '1' && c[i] == '1') {
                continue;
            }
            if (c[i] == '0' && i == 0) {
                k--;
            } else if (c[i] == '0') {
                continue;
            }

            for (int j = i; j < c.length; j++) {
                if (c[j] == '1') len[i]++;
                if (c[j] == '0') {
                    if (j != 0 && c[j - 1] == '1') {
                        k--;
                        if (k < 0) {
                            break;
                        } else {
                            len[i]++;
                        }
                    } else {
                        len[i]++;
                    }
                }
            }
        }

        Arrays.sort(len);

        System.out.println(len[len.length-1]);
    }
}