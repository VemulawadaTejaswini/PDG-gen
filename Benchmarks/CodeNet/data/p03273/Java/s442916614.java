import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int H = Integer.parseInt(sl[0]);
            int W = Integer.parseInt(sl[1]);

            String[] ar = new String[H];

            for (int i = 0; i < H; i++) {
                ar[i] = reader.readLine();
            }

            ArrayList<Integer> wa = new ArrayList<Integer>();

            // 縦すべてが空白
            for (int i = 0; i < W; i++) {
                boolean flg = true;
                for (int j = 0; j < H; j++) {
                    if (ar[j].charAt(i) != '.') {
                        flg = false;
                        break;
                    }
                }
                if (flg) wa.add(i);
            }

            ArrayList<Integer> ha = new ArrayList<Integer>();

            // 横すべてが空白
            for (int i = 0; i < H; i++) {
                boolean flg = true;
                for (int j = 0; j < W; j++) {
                    if (ar[i].charAt(j) != '.') {
                        flg = false;
                        break;
                    }
                }
                if (flg) ha.add(i);
            }

            for (int i = 0; i < H; i++) {
                if (ha.contains(i)) continue;
                for (int j = 0; j < W; j++) {
                    if (wa.contains(j)) continue;
                    System.out.print(ar[i].charAt(j));
                }
                System.out.println();
            }
        }
    }
}
