/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_A&lang=jp
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String line = null;
        try {
            n = Integer.parseInt(br.readLine());
            line = br.readLine();
        } catch (Exception e) {
            System.exit(-1);
        }
        String[] sa = line.split(" ");
        final int SIZE = 10001;
        int[] ary = new int[SIZE];
        if (sa.length != n) System.out.println("error");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(sa[i]);
            ary[x]++;
        }
        boolean isFirst = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < ary[i]; j++)
                if (isFirst) {
                    System.out.print(i);
                    isFirst = false;
                } else
                    System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
