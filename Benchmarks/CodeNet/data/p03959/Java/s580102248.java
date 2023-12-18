import java.util.Scanner;

class Main {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Data tdata[] = new Data[n];
        Data adata[] = new Data[n];
        tdata[0] = new Data(t[0], t[0]);
        for (int i = 1; i < n; i++) {
            if (t[i - 1] != t[i]) {
                tdata[i] = new Data(t[i], t[i]);
            } else {
                tdata[i] = new Data(1, t[i]);
            }
        }
        adata[n - 1] = new Data(a[n - 1], a[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[i + 1]) {
                adata[i] = new Data(a[i], a[i]);
            } else {
                adata[i] = new Data(1, a[i]);
            }
        }
        sc.close();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            int count = commonCount(tdata[i], adata[i]);
            if (count == -1) {
                System.out.println(0);
                return;
            } else {
                ans = (count * ans) % mod;
            }
        }
        System.out.println(ans);

    }

    static int commonCount(Data d1, Data d2) {
        if (d1.min > d2.max || d1.max < d2.min) {
            // 共通範囲が存在しない
            return -1;
        } else {
            int max = Math.min(d1.max, d2.max);
            int min = Math.max(d1.min, d2.min);
            return max - min + 1;
        }
    }
}

class Data {
    int min, max;

    Data(int min, int max) {
        this.min = min;
        this.max = max;
    }

}
