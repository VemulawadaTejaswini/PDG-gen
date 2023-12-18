package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int Q = Integer.parseInt(s1[1]);
        String S = sc.nextLine();

        // a[]の生成
        int[] a = new int[N];
        a[0] = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N; i++) {
            sb.append(S.charAt(i - 1));
            sb.append(S.charAt(i));
            if (sb.toString().equals("AC")) {
                a[i] = 1;
            }
            sb.setLength(0);
        }

        // s[]の生成
        int[] s = new int[N + 1];
        s[0] = 0;
        for (int i = 1; i <= N; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }

        // queryの処理
        for (int i = 0; i < Q; i++) {
            String[] query = sc.nextLine().split(" ");
            int l = Integer.parseInt(query[0]);
            int r = Integer.parseInt(query[1]);
            System.out.println(s[r] - s[l]);
        }

        sc.close();
    }

}
