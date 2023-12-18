
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //		 solveA();
        //		 solveB();
        //		 solveC();
//		solveC2();
        solveD();
    }

    private static void solveA() {
        try (Scanner scanner = new Scanner(System.in)) {
            int lineAB = 0;
            int lineBC = 0;
            int lineCA = 0;

            lineAB = scanner.nextInt();
            lineBC = scanner.nextInt();
            lineCA = scanner.nextInt();

            int result = lineAB * lineBC / 2;
            System.out.println(result);

        }
    }

    private static void solveB() {

        try (Scanner scanner = new Scanner(System.in)) {

            int numS = 0;
            numS = scanner.nextInt();

            int wkResult = 0;

            List<Integer> wkList = new ArrayList<Integer>();
            int cnt = 0;
            while (true) {
                if (cnt != 0) {
                    /*
                     * isResultNum()でf(n)を計算する
                     */
                    wkResult = isResultNum(wkList.get(cnt - 1));
                    /*
                     * am=an(m>n)
                     * 現時点のcntの値より前に同じwkResultが出てきているのかをチェック
                     * 既におなじwkResultが既出ならcnt++してbreak（indexが0スタートなので1スタートに合わせる）
                     */
                    if (wkList.contains(wkResult)) {
                        cnt++;
                        break;
                    }
                    wkList.add(wkResult);
                } else {
                    wkResult = numS;
                    wkList.add(numS);
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }

    private static int isResultNum(int numS) {
        if (numS % 2 == 0) {
            return numS / 2;
        } else {
            return 3 * numS + 1;
        }
    }

    private static void solveC() {

        try (Scanner scanner = new Scanner(System.in)) {
            int numN = 0;
            numN = scanner.nextInt();
            int[] arrayH = new int[numN];
            for (int i = 0; i < arrayH.length; i++) {
                arrayH[i] = scanner.nextInt();
            }

            int cnt = 0;
            /*
             * 入力値がすべて0になるまで繰り返す
             */
            while (isNotExit(arrayH)) {
                cnt++;
                boolean notZeroCnt = false;
                /*
                 * 水やり作業
                 */
                for (int i = 0; i < arrayH.length; i++) {
                    /*
                     * 0に達したものはそれ以上水をやれないので、
                     * 0を見つけたら水やりの切れ目
                     */
                    if (arrayH[i] != 0) {
                        arrayH[i]--;
                        notZeroCnt = true;
                    } else {
                        /*
                         * 0の箇所があるので水やりの切れ目なのだが、
                         * まだ1度も水を挙げていない場合
                         * |0|0|1|0|
                         * ↑みたいな場合、1,2個目は無視しないといけない
                         * notZeroCntはそのために利用している。
                         * もっとうまいやり方。。。
                         */
                        if (notZeroCnt) {
                            break;
                        }
                    }

                }
            }
            System.out.println(cnt);
        }
    }

    /*
     * 高さ0より大きい入力値が存在するのかを確認する
     */
    private static boolean isNotExit(int[] arrayH) {
        for (int i = 0; i < arrayH.length; i++) {
            if (arrayH[i] != 0) {
                return true;
            }
        }
        return false;
    }

    private static void solveC2() {

        try (Scanner scanner = new Scanner(System.in)) {
            int numN = 0;
            numN = scanner.nextInt();
            int[] arrayH = new int[numN];
            for (int i = 0; i < arrayH.length; i++) {
                arrayH[i] = scanner.nextInt();
            }

            int cnt = 0;
            while (getFirst(arrayH) != 99999999) {
                boolean zeroCnt = false;
                for (int i = 0; i < arrayH.length; i++) {
                    if (arrayH[i] > 0) {
                        arrayH[i] = arrayH[i] - 1;
                        zeroCnt = true;
                    } else {
                        if (zeroCnt) {
                            break;
                        }
                    }
                }
                cnt++;
            }

            System.out.println(cnt);
        }
    }

    private static int getFirst(int[] arrayH) {

        for (int i = 0; i < arrayH.length; i++) {
            if (arrayH[i] > 0) {
                return i;
            }
        }
        return 99999999;
    }

    private static class Sushi {
        private long netaT;

        public long getNetaT() {
            return netaT;
        }

        public long getOishiD() {
            return oishiD;
        }

        private long oishiD;

        public Sushi(long netaT, long oishiD) {
            this.netaT = netaT;
            this.oishiD = oishiD;
        }
    }

    private static void solveD() {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            List<Sushi> sushis = new ArrayList<Sushi>();
            for (int i = 0; i < n; i++) {
                Sushi sushi = new Sushi(scanner.nextLong(), scanner.nextLong());
                sushis.add(sushi);
            }
            sushis.sort((x, y) -> {
                return Long.compare(x.getOishiD(), y.getOishiD()) == 0 ?
                        Long.compare(x.getNetaT(), y.getNetaT()) :
                        -Long.compare(x.getOishiD(), y.getOishiD());
            });
            Map<Long, List<Sushi>> baseKind = new HashMap<Long, List<Sushi>>();
            Map<Long, List<Sushi>> duplicateKind = new HashMap<Long, List<Sushi>>();
            List<Sushi> duplicateSushis = new ArrayList<Sushi>();
            long currTotal = 0;
            for (int i = 0; i < k; i++) {
                Sushi sushi = sushis.get(i);
                currTotal += sushi.oishiD;
                if (baseKind.containsKey(sushi.netaT)) {
                    duplicateKind.putIfAbsent(sushi.netaT, new ArrayList<Sushi>());
                    duplicateKind.get(sushi.netaT).add(sushi);
                    duplicateSushis.add(sushi);
                } else {
                    baseKind.putIfAbsent(sushi.netaT, new ArrayList<Sushi>());
                    baseKind.get(sushi.netaT).add(sushi);
                }
            }
            duplicateSushis.sort((x, y) -> {
                return Long.compare(x.getOishiD(), y.getOishiD()) == 0 ?
                        Long.compare(x.getNetaT(), y.getNetaT()) :
                        Long.compare(x.getOishiD(), y.getOishiD());
            });
            List<Long> resList = new ArrayList<Long>();
            resList.add(currTotal + baseKind.size() * baseKind.size());
            for (int i = k; i < sushis.size() && duplicateSushis.size() > 0; i++) {
                Sushi candidateSushi = sushis.get(i);
                if (!baseKind.containsKey(candidateSushi.netaT)) {
                    long wkKind = baseKind.size() + 1;
                    Sushi removeCandidateSushi = duplicateSushis.get(0);
                    currTotal = currTotal - removeCandidateSushi.oishiD + candidateSushi.oishiD;
                    long wkTotal = currTotal + wkKind * wkKind;
                    resList.add(wkTotal);
                    duplicateSushis.remove(0);
                    baseKind.putIfAbsent(candidateSushi.netaT, new ArrayList<Sushi>());
                    baseKind.get(candidateSushi.netaT).add(candidateSushi);
                }
            }
            Collections.sort(resList, Comparator.reverseOrder());
            System.out.println(resList.get(0));
        }
    }

    private static void solveDDFSTLE() {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            List<Sushi> wkList = new ArrayList<Sushi>();
            for (int i = 0; i < n; i++) {
                Sushi sushi = new Sushi(scanner.nextLong(), scanner.nextLong());
                wkList.add(sushi);
            }
            long res = DFS(wkList, n, 0, k, 0, new ArrayList<Long>());
            System.out.println(res);
        }
    }

    private static long DFS(List<Sushi> wkList, int n, int curr, int k, long total, List<Long> set) {
        if (k == 0) {
            long cnt = set.stream().collect(Collectors.toSet()).size();
            return cnt * cnt + total;
        }
        if (curr >= n) {
            return 0;
        }
        long res = 0;
        long val = 0;
        val = DFS(wkList, n, curr + 1, k, total, set);
        res = Math.max(res, val);
        Sushi sushi = wkList.get(curr);
        set.add(sushi.getNetaT());
        val = DFS(wkList, n, curr + 1, k - 1, total + sushi.getOishiD(), set);
        set.remove(set.size() - 1);
        res = Math.max(res, val);
        return res;
    }
}