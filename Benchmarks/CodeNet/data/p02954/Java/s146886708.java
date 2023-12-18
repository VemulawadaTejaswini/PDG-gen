import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();
        int[] cnt = new int[c.length];
        
        for (int i = 0; i < c.length;) {
            int index = i;
            int tmp_cnt = 0;
            char tmp_c = c[i];
            while (tmp_c == c[i]) {
                tmp_cnt++;
                i++;
                if (i >= c.length)
                    break;
            }

            if (tmp_c == 'R') {
                if (tmp_cnt % 2 == 1) {
                    cnt[i-1]++;
                }
                cnt[i] += tmp_cnt / 2;
                cnt[i-1] += tmp_cnt / 2;
            } else {
                if (tmp_cnt % 2 == 1) {
                    cnt[index]++;
                }
                cnt[index] += tmp_cnt / 2;
                cnt[index-1] += tmp_cnt / 2;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}