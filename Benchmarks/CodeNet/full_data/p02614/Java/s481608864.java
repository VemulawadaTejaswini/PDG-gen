import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            c[i] = sc.next().toCharArray();
        }
        int n = h + w;
        int ans = 0;
        for (int bit = 0; bit < (1 << n); bit++) {
            //StringBuilder sb = new StringBuilder();
            boolean[] choosedH = new boolean[h];
            boolean[] choosedW = new boolean[w];
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    //sb.append(i);
                    if (i < h) {
                        choosedH[i] = true;
                    } else {
                        choosedW[i - h] = true;
                    }
                }
            }
            //System.out.println(sb);
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                if (choosedH[i]) {
                    continue;
                }
                for (int j = 0; j < w; j++) {
                    if (choosedW[j]) {
                        continue;
                    }
                    if (c[i][j] == '#') {
                        cnt++;
                    }
                }
            }
            if (cnt == k) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
