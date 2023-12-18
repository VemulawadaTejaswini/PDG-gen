import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        double W = Double.parseDouble(arr[0]);
        double H = Double.parseDouble(arr[1]);
        double x = Double.parseDouble(arr[2]);
        double y = Double.parseDouble(arr[3]);
        double ans = 0;
        double half = W * H / 2;
        int flg = 0;
        
        // // 対角線上か半分にする線上か
        // if (y / x == (H - y) / (W - x) 
        //     || (H - y) / x == y / (W - x)
        //     || x == W / 2 || y == H / 2) {
            ans = half;
            if (x == W / 2 && y == H / 2) {
                flg = 1;
            }
        // } else {
        //     double ans1 = W * Math.min(y, H - y);
        //     double ans2 = H * Math.min(x, W - x);
        //     ans = Math.max(ans1, ans2);
        //     if (ans1 == ans2) {
        //         flg = 1;
        //     } 
        // }

        out.println(ans + " " + flg);
        out.close();
    }
}
