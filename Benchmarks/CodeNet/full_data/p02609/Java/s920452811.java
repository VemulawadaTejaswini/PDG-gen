import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] X = sc.next().toCharArray();
        int bit = 0;
        for (int i = 0; i < N; i++) {
            if (X[i] == '1') bit++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char tmp = X[i];
            if (X[i] == '1') {
                X[i] = '0';
                ans.append(calc(X, bit-1)).append('\n');
            } else {
                X[i] = '1';
                ans.append(calc(X, bit+1)).append('\n');
            }
            // recover
            X[i] = tmp;
        }
        System.out.print(ans);
    }

    private static int calc(char[] x, int pop) {
        int work = 0;
        for (int i = 0; i < x.length; i++) {
            work *= 2;
            work += x[i] == '1' ? 1 : 0;
            if (work >= pop) {
                work -= pop;
            }
        }
        System.out.println(Arrays.toString(x) + "," + pop+","+work);
        int ret = 1;
        while (work > 0) {
            int b = calcBit(work);
            work = work%b;
            ret++;
        }
        return ret;
    }

    private static int calcBit(int n) {
        int bit = 0;
        while (n > 0) {
            bit++;
            n /= 2;
        }
        return bit;
    }
}
