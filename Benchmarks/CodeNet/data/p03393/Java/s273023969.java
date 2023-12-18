import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
      System.out.println("-1");
        if("zyxwvutsrqponmlkjihgfedcba".equals(S)){
            System.out.println("-1");
            return;
        }
        int tmp = 0;
        String ans = null;
        String C = "abcdefghijklmnopqrstuvwxyz";
        char s[] = S.toCharArray();
        char c[] = C.toCharArray();
        if (S.length() != 26) {
            Arrays.sort(s);
            for (int i = 0; i < 26; i++) {
                if (S.length() == i || s[i] != c[i]) {
                    ans = String.valueOf(c[i]);
                    break;
                }
            }
            System.out.println(S + ans);
        } else {
            int a = 25;
            for (int i = 0; i < 26; i++) {
                if (s[i] == c[a]) {
                    int ch = i;
                    int ca=a;
                    while (a >= 0) {
                        if (s[i] != c[a]) {
                            s[i] = c[a];
                            for (int j = 0; j <= i; j++) {
                                System.out.print(s[j]);
                            }
                            System.out.println();
                            return;
                        }
                        i++;
                        a--;
                    }
                    s[ch-1] = c[0];
                    for (int j = 0; j <= ch-1; j++) {
                        System.out.print(s[j]);
                    }
                    System.out.println();
                    return;
                } else {
                    for (int j = 0; j < 26; j++) {
                        if (s[i] == c[j]) {
                            c[j] = 'z';
                            a--;
                            Arrays.sort(c);
                        }
                    }
                }
            }
        }
    }

}