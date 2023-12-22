// 提出時に消す
// package app;

import java.util.Scanner;

// 提出時にMainに変更する
//public class ABC177B {
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int ans = t.length();

        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            // 入れ替える必要のある数
            int cnt = t.length();
            for (int j = 0; j < t.length(); j++) {
                if (s.substring(i + j, i + j + 1).equals(t.substring(j, j + 1))) {
                    cnt--;
                }
            }
            if (ans > cnt) {
                ans = cnt;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}