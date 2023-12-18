import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        sc.close();
        int len = s.length();
        if (len == 1) {
            System.out.println(k / 2);
            return;
        }
        char tmp = s.charAt(0);
        int cnt = 1;
        long ans = 0;
        List<Integer> list = new ArrayList<>();
        char c = s.charAt(1);
        for (int i = 1; i < len; i++) {
            while (true) {
                c = s.charAt(i);
                // System.out.println(c);
                if (c != tmp) {
                    break;
                }
                cnt++;
                i++;
                if (i == len) {
                    break;
                }
            }
            list.add(cnt);
            cnt = 1;
            tmp = c;
            // 異なる状態になる
        }
        if (s.charAt(len - 1) != s.charAt(len - 2)) {
            list.add(1);
        }
        if (list.size() == 1) {
            int num = list.get(0);
            if (num % 2 == 0) {
                ans += (num / 2) * k;
            } else {
                int num2 = num + 1;
                for (int i = 0; i < k; i++) {
                    if (i % 2 == 0) {
                        ans += num / 2;

                    } else {
                        ans += num2 / 2;
                    }
                }
            }
        } else if (s.charAt(0) != s.charAt(len - 1)) {
            for (int i : list) {
                // System.out.println(i);
                ans += (i / 2) * k;
            }
        } else {
            int size = list.size();
            for (int i = 1; i < size - 1; i++) {
                ans += (list.get(i) / 2) * k;
            }
            int f = list.get(0);
            int l = list.get(size - 1);
            int wa = f + l;
            ans += (wa / 2) * (k - 1);
            ans += f / 2;
            ans += l / 2;
        }
        System.out.println(ans);

    }
}
