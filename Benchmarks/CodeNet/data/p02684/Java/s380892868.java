import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());

        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        boolean rch = false;
        int next = 1;
        int[] p = new int[n + 1];

        int gap = 0;
        int[] jun = new int[n + 1];
        jun[0] = 1;
        int st = 0;
        int en = 0;

        boolean looped = false;
        for (int i = 0; i <= n; i++) {
            if (p[next] == 0) {
                p[next] = i;
                jun[i] = next; // 到着順記録
                next = a[next];

            } else {

                if (!looped) {
                    looped = true;
                    st = p[next]; // ループ開始回数
                    en = i - 1;
                    gap = en - st + 1;
                }

                p[next] = i;
                jun[i] = next; // 到着順記録
                next = a[next];
            }
        }

        if (k <= n) {
            System.out.println(jun[(int) k]);
        } else {
            long ans = (k - (st - 1)) % gap;

            System.out.println(jun[st + ((int) ans - 1)]);
        }

        sc.close();
    }
}