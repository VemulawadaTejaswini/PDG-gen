import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt();
        int[] s = new int[100000], t = new int[100000], c = new int[100000];
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[] ss = new int[200002], tt = new int[200002];
        for (int i = 1; i <= C; i++) {
            for (int j = 0; j < 200002; j++) {
                tt[j] = 0;
            }
            for (int j = 0; j < N; j++) {
                if (c[j] == i) {
                    for (int k = s[j] * 2 - 1; k < t[j] * 2; k++) {
                        tt[j]++;
                    }
                }
            }
            for (int j = 0; j < 200002; j++) {
                if (tt[j] > 0) {
                    ss[j]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < 200002; i++) {
            max = Math.max(max, ss[i]);
        }
        System.out.println(max);
    }
}