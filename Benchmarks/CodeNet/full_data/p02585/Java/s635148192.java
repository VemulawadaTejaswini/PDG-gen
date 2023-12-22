public class Main {

    private static class Cycle {
        long score = 0;
        int size = 0;
        long localMx = 0;

        Cycle(long inlocalMx) {
            localMx = inlocalMx;
        }
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var p = new int[n];
        var c = new int[n];
        var point_cycles = new Cycle[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (point_cycles[i] == null) {
                int point = i;
                point_cycles[i] = new Cycle(c[p[point]]);
                do {
                    point_cycles[point] = point_cycles[i];
                    point_cycles[i].score += c[p[point]];
                    point = p[point];
                    point_cycles[i].size++;
                    point_cycles[i].localMx = Math.max(point_cycles[i].localMx,
                            point_cycles[i].score);
                } while (point_cycles[point] == null);
            }
        }
        long res = c[0];
        for (int i = 0; i < n; i++) {
            int point = i;
            long localScr = 0L;
            long mod = k % point_cycles[point].size;
            for (int cnt = 0; cnt < mod; cnt++) {
                point_cycles[point] = point_cycles[i];
                localScr += c[p[point]];
                point = p[point];
                res = Math.max(res, localScr);
            }
            if (k / point_cycles[point].size > 0) {
                res = Math.max(res, point_cycles[point].localMx);
                if (point_cycles[point].score > 0) {
                    localScr += k / point_cycles[point].size
                            * point_cycles[point].score;
                    res = Math.max(res, localScr);
                }
            }

        }
        System.out.println(res);

    }

}
