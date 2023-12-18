import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            total += a[i];
        }

        // 処理
        double th = total / (4.0 * m);
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= th){
                cnt++;
            }
        }
        String out;
        if(cnt >= m){
            out = "Yes";
        } else {
            out = "No";
        }

        // 出力
        System.out.println(out);
    }
}