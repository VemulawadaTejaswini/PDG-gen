import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final int[] vol = new int[]{0,2,5,5,4,5,6,3,7,6};
    static int n;
    static int m;
    static int[][] a;
    static int[] b;
    static int[] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[m][2]; // num, vol
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            a[i][0] = x;
            a[i][1] = vol[x];
        }
        Arrays.sort(a, (x, y) -> x[1] - y[1]);
        for (int i = 1; i < m; i++) {
            if(a[0][1] == a[i][1] && a[0][0] < a[i][0]){
                int[] tmp = a[0];
                a[0] = a[i];
                a[i] = tmp;
            }else if(a[0][1] < a[i][1]) break;
        }
        b = a[0];
        int amari = n % b[1];
        int keta = amari;
        ans = new int[10];
        ans[b[0]] = n / b[1] - keta;
        amari += b[1] * keta;
        Arrays.sort(a, (x, y) -> y[0] - x[0]);
        dfs(0, amari, keta);
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i > 0 ; i--) {
            while(ans[i] > 0){
                sb.append(i);
                ans[i]--;
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }

    private static boolean dfs(int idx, int amari, int keta){
        boolean ret = false;
        for (int i = idx; i < m; i++) {
            int tmpa = amari;
            int tmpk = keta;
            if(tmpk == 1){
                if(a[i][1] == tmpa){
                    tmpa -= a[i][1];
                    tmpk--;
                    ret = true;
                }
            }else{
                if(a[i][1] < tmpa){
                    tmpa -= a[i][1];
                    tmpk--;
                    ret = dfs(i, tmpa, tmpk);
                }
            }
            if(ret){
                ans[a[i][0]]++;
                break;
            }
        }
        return ret;
    }
}
