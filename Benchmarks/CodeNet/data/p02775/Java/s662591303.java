import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] cArray = sc.next().toCharArray();
        char[] translated = new char[cArray.length + 1];
        boolean kuriagari = false;
        for (int ri = cArray.length - 1; ri >= 0; ri--) {
            int n = cArray[ri] - '0';
            if (n >= 6 ||
                    (n >= 5 && kuriagari)) {
                translated[ri + 1] = '0';
                kuriagari = true;

            } else {
                translated[ri + 1] = (char) ('0' + n + (kuriagari ? 1 : 0));
                kuriagari = false;
            }
        }

        translated[0] = kuriagari ? '1' : '0';

        int ans = 0;

        // 払う側
        for (int i = 0; i < translated.length; i++) {
            ans += translated[i] - '0';
        }
        int siharai = ans;
        //お釣り側
        for (int ri = cArray.length - 1; ri >= 0; ri--) {
            int n = cArray[ri] - '0';

            if (translated[ri + 1] >= cArray[ri]) {
                ans += translated[ri + 1] - cArray[ri];

            } else {
                for (int rj = ri; rj >= 0; rj--) {
                    if (translated[rj] != '0') {
                        translated[rj] = (char) (translated[rj] - 1);
                        break;
                    } else {
                        translated[rj] = '9';
                    }
                }
                ans += 10 - n;
            }
        }
        int otsuri = ans - siharai;
        //        System.out.println(siharai);
        //        System.out.println(otsuri);
        System.out.println(ans);
    }
}
