
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int n;
    int[] as;
    int[] ans;
    PriorityQueue<Val> queue;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        ans = new int[n];
        queue = new PriorityQueue<>((v1, v2) -> Integer.compare(as[v1.st], as[v2.st]));
    }

    private void solve() {
        part(0, n);
        int count = 0;
        while (!queue.isEmpty()) {
            Val v = queue.poll();
            ans[count++] = as[v.st];
            ans[count++] = as[v.ed];
            part(v.rangeST, v.st);
            part(v.st+1, v.ed);
            part(v.ed+1, v.rangeED);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            sb.append(ans[i]);
            sb.append(" ");
        }
        sb.append(ans[n-1]);
        System.out.println(sb.toString());
    }

    private void part(int start, int end) {
        int min1 = getMin(start, end);
        int min2 = getMin(min1+1, end);
        if (min1 == -1 || min2 == -1)
            return;
        queue.add(new Val(min1, min2, start, end));
    }

    private int getMin(int start, int end) {
        if (start >= end)
            return -1;
        int minVal = Integer.MAX_VALUE;
        int minIx = -1;
        for (int i = start; i < end; i += 2) {
            if (minVal > as[i]) {
                minVal = as[i];
                minIx = i;
            }
        }
        return minIx;
    }


    private class Val {
        int st;
        int ed;
        int rangeST;
        int rangeED;
        Val (int st, int ed, int rg_st, int rg_ed) {
            this.st = st;
            this.ed = ed;
            rangeST = rg_st;
            rangeED = rg_ed;
        }
    }
}
