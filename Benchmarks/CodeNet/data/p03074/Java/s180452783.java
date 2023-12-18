
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = sc.next().split("");
        int[] len = new int[n + 2];
        int index = 0;
        boolean is0 = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("0")) {
                if (!is0)index++;
                is0 = true;
            } else {
                if (is0)index++;
                is0 = false;
            }
            len[index]++;
        }
        int res = 0;
        for (int i = 0; i <= index; i += 2) {
            int tmp = 0;
            int m = 2 * k + 1;
            if (i + m - 1 > index && i>0)break;
            for (int j = 0; j < m; j++) {
                tmp += len[i + j];
            }
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }
}