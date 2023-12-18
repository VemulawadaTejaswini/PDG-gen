import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        // c_xとc_yの全探索
        int c_x = -1, c_y = -1, res_H = -1;

        for (int i_cx = 0; i_cx <= 100; i_cx++) {
            for (int i_cy = 0; i_cy <= 100; i_cy++) {
                int H = -1;
                int prev_H = -1;   // Hは正の値なのでマイナスになることはないのでこの値を空と定義する

                boolean allDhsAreConsistent = true;
                for (int i_data = 0; i_data < N; i_data++) {
                    H = h[i_data] + (Math.abs(x[i_data] - i_cx) + Math.abs(y[i_data] - i_cy));
                    if (prev_H == -1) {
                        prev_H = H;
                    }
                    if (H != prev_H) {
                        allDhsAreConsistent = false;
                        break;
                    }
                    prev_H = H;

                }
                if (allDhsAreConsistent) {
                    c_x = i_cx;
                    c_y = i_cy;
                    res_H = H;
                }
            }
        }

        if (res_H == -1) {
            throw new Exception();
        }

        System.out.println(c_x + " " + c_y + " " + res_H);
    }
}