import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char[] ss = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ss[i] = s.charAt(i);
        }

        // change k times
        for (int i = 0; i < k; i++) {
            int l = -1;
            int r = -1;
            boolean lFound = false;
            boolean rFound = false;
            char rChar = ' ';
            char lChar = ' ';
            for (int j = 0; j < n - 1; j++) {
                if (ss[j] != ss[j + 1] && !lFound) {
                    if (!rFound || (rFound && ss[j + 1] == rChar)) {
                        l = j + 1;
                        lFound = true;
                        lChar = ss[j + 1];
                    }
                }
                if (ss[n - 1 - j] != ss[n - 1 - j - 1] && !rFound) {
                    if (!lFound || (lFound && ss[n - 1 - j - 1] == lChar)) {
                        r = n - 1 - j - 1;
                        rFound = true;
                        rChar = ss[n - 1 - j - 1];
                    }
                }
                if (lFound && rFound) {
                    break;
                }
            }
//            System.out.println("l:" + l + ",r:" + r);
            if (l == -1 && r == -1) {
                break;
            }
            if (l == -1) {
                l = 0;
            }
            if (r == -1) {
                r = l - 1;
                l = 0;
            }
            if (l > r) {
                break;
            }
//            System.out.println("l:" + l + ",r:" + r);

            // change s
            // back up original
            char[] bak = new char[n];
            for (int j = l; j <= r; j++) {
                bak[j] = ss[j];
            }
            // change
            for (int j = l; j <= r; j++) {
                ss[j] = bak[r - j + l] == 'R' ? 'L' : 'R';
            }
            // print ss
//            System.out.println(ss);
        }

        // sum ans
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (ss[i] == 'L') {
                if (i > 0 && ss[i - 1] == 'L') {
                    ans++;
                }
            } else if (ss[i] == 'R') {
                if (i < n - 1 && ss[i + 1] == 'R') {
                    ans++;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
