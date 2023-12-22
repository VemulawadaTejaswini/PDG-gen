import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();
        RSumQ rSumQ = new RSumQ(n, 0);
        for (int i = 0; i < q; i++) {
            int cmd = in.nextInt(),
                    x = in.nextInt(),
                    y = in.nextInt();
            if (cmd == 0) {
                rSumQ.add(x, y);
            }else {
                System.out.println(rSumQ.getSum(x,y));
            }
        }
    }
}

class RSumQ {
    int[] heap;
    int n;

    RSumQ(int n, int val) {
        this.n = n;
        // create heap size as 2*(log(upper2(n))+1)
        heap = new int[heap_size(n)];
        Arrays.fill(heap, val);
    }

    private static int heap_size(int n) {
        int ret = 1;
        while (ret < n) { // get ret(2*p) >= n
            ret *= 2;
        }
        return ret*2;
    }

    void add(int i, int val) {
        i -= 1;
        if (i < 0 || i >= n) {
            return;
        }
        if (n == 1) {
            heap[1] += val;
            return;
        }

        add(i, val, 0, n, 1);
    }

    private void add(int i, int val, int l, int r, int ih) {
        if (r - l == 1) {
            heap[ih] += val;
            return;
        }

        int mid = (l + r) / 2;
        if (i < mid) {
            add(i, val, l, mid,ih * 2);
        } else {
            add(i, val, mid, r,ih * 2 + 1);
        }
        heap[ih] = heap[ih * 2] + heap[ih * 2 + 1];
    }

    int getSum(int s, int t) {
        s -= 1;
        //TODO:boundary check
        return getSum(s, t, 0, n, 1);
    }

    private int getSum(int s, int t, int l, int r, int ih) {
        if (s>=t) {
            return 0;
        }
        if (s == l && t == r) {
            return heap[ih];
        }

        int mid = (l + r) / 2;
        return getSum(Math.max(s, l), Math.min(t, mid), l, mid, ih * 2) +
                getSum(Math.max(s, mid), Math.min(t, r), mid, r, ih * 2 + 1);
    }
}

