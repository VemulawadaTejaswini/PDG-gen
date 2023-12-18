import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[][] a = new int[n][3];
        int[][] b = new int[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[i] = new int[]{i, x, y};
            b[i] = new int[]{i, x, y};
        }
        Arrays.sort(a, (x,y) -> y[1] - x[1]);
        Arrays.sort(b, (x,y) -> y[2] - x[2]);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(a[0][1] < b[i][2]){
                h -= b[i][2];
                ans++;
            }else if(a[0][1] > b[i][2]){
                break;
            }
            if(h <= 0)break;
        }
        if(0 < h){
            ans += (int)Math.ceil((double)h / (double)a[0][1]);
        }
        System.out.println(ans);
        sc.close();

    }

}
