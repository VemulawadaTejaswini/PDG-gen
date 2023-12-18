import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flg = true;
        Long[] Hs = new Long[N];
        Long fix = 0L;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            long H = sc.nextLong();
            Hs[i] = H;
            if (i != 0 && Hs[i - 1] > H) {
                Hs[i - 1] = Hs[i - 1] - 1;
                if (cnt == 0) {
                    fix = Hs[i - 1];
                }
                cnt++;
                if (Hs[i - 1] >= fix) {
                    flg = false;
                    break;
                }
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
