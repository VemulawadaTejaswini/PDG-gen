import java.util.Scanner;
public class Main {
    static long lcm(int n, int m) {
        if (n == m) return n;
        long ans = 1;
        int div = 2;
        int max_kouyaku = Math.abs(m - n);
        while (div == 2) {
            if (n % 2 == 0 && m % 2 == 0) {
                n /= 2;
                m /= 2;
                ans *= div;
            } else div++;
        }
        for (div = 3; div <= Integer.min(n, m) && div <= max_kouyaku; div += 2) {
            if (m % div == 0 && n % div == 0) {
                m /= div;
                n /= div;
                ans *= div;
                div -= 2;
            }
        }
        return ans * m * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long lcm = lcm(N, M);
        int stepS = (int) (lcm / N);
        int stepT = (int) (lcm / M); //stepS,stepT刻みで入る
        int dupS = (int) (lcm(stepS, stepT) / stepS);
        int dupT = (int) (lcm(stepS, stepT) / stepT);
        //文字が一致しなくてはならないのはSの1+n(dupS)番目の文字とTの1+n(dupT)番目の文字
        String S = sc.next();
        String T = sc.next();
        for (int i = 0; i < N / dupS; i++) {
            if (S.charAt(i * dupS) != T.charAt(i * dupT)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(lcm);
    }
}