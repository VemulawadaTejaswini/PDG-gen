import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char str[] = new char[s.length() + 5];
        int pos = 0;
        int spos = 0;
        /*
         * A = 1 BC = 2 その他 区切れ 3
         */
        Arrays.fill(str, '3');
        for (int i = 0; i < s.length(); i++) {
            if (spos == s.length()) {
                break;
            }
            if (s.charAt(spos) == 'A') {
                str[pos] = '1';
                pos++;
                spos++;
            } else if (s.charAt(spos) == 'B') {
                if (spos == s.length() - 1) {
                    str[pos] = '3';
                    break;
                }
                if (s.charAt(spos + 1) == 'C') {
                    str[pos] = '2';
                    pos++;
                    spos++;
                    spos++;
                } else if (s.charAt(spos + 1) == 'A') {
                    str[pos] = '3';
                    str[pos + 1] = '1';
                    pos++;
                    pos++;
                    spos++;
                    spos++;
                } else {
                    str[pos] = '3';
                    pos++;
                    spos++;
                    spos++;
                }
            } else {
                str[pos] = '3';
                pos++;
                spos++;
            }
        }
        long ans = 0;
        long bccnt = 0;
        long acnt = 0;
        for (int i = 0; i < s.length() + 1; i++) {
            if (str[i] == '3') {
                ans += bccnt;
                bccnt = 0;
                acnt = 0;
            }
            if (str[i] == '1') {
                acnt++;
            }
            if (str[i] == '2') {
                bccnt += acnt;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}