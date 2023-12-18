import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = n;
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[][] a = new int[26][n];
        int[] cnt = new int[26];
        for(int i = 0; i < n; i++){
            int idx = s[i] - 'A';
            a[idx][cnt[idx]] = i;
            cnt[idx]++;
        }
        int[] gs = new int[n];
        Arrays.fill(gs, 1);
        for (int i = 0; i < q; i++) {
            int t = sc.next().charAt(0) - 'A';
            char d = sc.next().charAt(0);
            if(cnt[t] == 0) continue;
            if (d == 'R') {
                for (int j = cnt[t] - 1; j >= 0; j--) {
                    int idx = a[t][j];
                    if (idx == n - 1) g -= gs[idx];
                    else gs[idx + 1] += gs[idx];
                    gs[idx] = 0;
                }
            } else {
                for (int j = 0; j < cnt[t]; j++) {
                    int idx = a[t][j];
                    if(idx == 0) g -= gs[idx];
                    else gs[idx -1] += gs[idx];
                    gs[idx] = 0;
                }
            }
        }

        System.out.println(g);
        sc.close();
    }

}
