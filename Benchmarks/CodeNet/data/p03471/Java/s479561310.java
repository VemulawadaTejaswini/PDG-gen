
import java.util.*;

import static java.lang.System.*;

// https://atcoder.jp/contests/abc085/tasks/abc085_c
// 鶴亀算
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        solver(N, Y);
    }

    // 鶴亀算。zを固定して考える
    public static void solver(int N, int Y) {

        for(int z = 0; z < N; z++){
            double x = (Y - 5000 * N + 4000 * z) / 5000.0;
            if(x % 1 != 0 || x < 0){
                continue;
            }

            int y = N - (int)x - z;
            //out.println(x + " " + y + " " + z);

            if(y >= 0){
                out.println((int)x + " " + (int)y + " " + z);
                exit(1);
            }
        }
        out.println("-1 -1 -1");
    }
}
