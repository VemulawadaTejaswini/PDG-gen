import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        char[] t = new char[q];
        char[] d = new char[q];
        for (int i = 0 ; i < q ; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }
        int left = 0;
        int ng = n;
        int ok = -1;
        //残るゴーレムの一番左のインデックス
        while (Math.abs(ok  - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (isDropable(mid, s, t, d)) {
                ok = mid;
            } else {
                ng = mid;
            }
            left = ng;
        }

        int right = n - 1;
        ng = -1;
        ok = n;
        //残るゴーレムの一番右のインデックス
        while (Math.abs(ok - ng) > 1) {
            int mid = (ng + ok) / 2;
            if (isDropable(mid, s, t, d)) {
                ok = mid;
            } else {
                ng = mid;
            }
            right = ng;
        }

        System.out.println(Math.max(right - left + 1, 0));

     }
    //選択したゴーレムが落ちるかどうか判定
    static boolean isDropable(int i, String s, char[] t, char[] d) {
        for (int j = 0 ; j < t.length ; j++) {
            if (s.charAt(i) == t[j]) {
                if (d[j] == 'L') {
                    i--;
                } else {
                    i++;
                }
            }
            if (i < 0 || i >= s.length()) {
                return true;
            }
        }
        return false;
    }

}