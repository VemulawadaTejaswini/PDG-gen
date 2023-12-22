import java.util.*;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int S; // 1<=N<=2000
    long[] num;
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        num = new long[S];
    }

    private void solve() {
        if (S < 3) {
            result = 0;
            return;
        }
        if (S < 6) {
            result = 1;
            return;
        }

        num[0] = num[1] = 0;
        num[2] = num[3] = num[4] = 1;

        // S[n] = S[n-3] + S[n-4] + ... + S[3] + 1;
        for (int i=5; i<S; i++) {
            num[i] = 1L;
            for (int n=0; n<i-2; n++) {
                num[i] = (num[i] + num[n]) % 1000000007;
            }
        }
        result = num[S-1];
    }

    private void output() {
        System.out.println(result);
    }
}
