import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        for (;;) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] cnt = new int[256];
            int[] in = new int[256];
            int[] out = new int[256];
            for (int i = 0; i < n; i++) {
                char[] str = sc.next().toCharArray();
                in[str[0]]++;
                out[str[str.length - 1]]++;
                cnt[str[0]]++;
                if (str.length != 1 && str[0]!=str[str.length - 1])
                    cnt[str[str.length - 1]]++;
            }
            boolean union = true;
            for (int i = 'a'; i <= 'z'; i++) {
                if (cnt[i] == 0)
                    continue;
                if (cnt[i] < 2)
                    union = false;
            }
            if (union) {
                boolean ok = true;
                for (int i = 'a'; i <= 'z'; i++) {
                    if (Math.abs(in[i] - out[i]) != 0) {
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok ? "OK" : "NG");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}