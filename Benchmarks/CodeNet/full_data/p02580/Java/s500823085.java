import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        int[] cntH = new int[h];
        int[] cntW = new int[w];
        for (int i=0; i<m; i++) {
            arr[i][0] = sc.nextInt() - 1;
            arr[i][1] = sc.nextInt() - 1;
            cntH[arr[i][0]]++;
            cntW[arr[i][1]]++;
        }

        Pair[] pairH = new Pair[h];
        Pair[] pairW = new Pair[w];

        int maxhCnt = 0;
        for (int i=0; i<h; i++) {
            maxhCnt = Math.max(maxhCnt, cntH[i]);
        }
        int maxWCnt = 0;
        for (int i=0; i<w; i++) {
            maxWCnt = Math.max(maxWCnt, cntW[i]);
        }


        for (int i=0; i<h; i++) {
            pairH[i] = new Pair(cntH[i], i);
        }
        for (int i=0; i<w; i++) {
            pairW[i] = new Pair(cntW[i], i);
        }


        List<Integer> setH = new ArrayList<>();
        for (int i=0; i<h; i++) {
            if (pairH[i].cnt == maxhCnt) setH.add(pairH[i].idx);
        }
        List<Integer> setW = new ArrayList<>();
        for (int i=0; i<w; i++) {
            if (pairW[i].cnt == maxWCnt) setW.add(pairW[i].idx);
        }

//        System.out.print(setH);
//        System.out.print(setW);

        for (int i=0; i<m; i++) {
            if (!setH.contains(arr[i][0])) {

            }
        }


        long cnt = 0;
        for (int i=0; i<m; i++) {
            if (setH.contains(arr[i][0]) && setW.contains(arr[i][1])) cnt++;
        }

        if ((long)setH.size() * (long)setW.size() == cnt) {
            System.out.print(maxhCnt + maxWCnt - 1);
        } else {
            System.out.print(maxhCnt + maxWCnt);
        }



    }

    class Pair {
        int cnt;
        int idx;
        public Pair(int c, int i) {
            this.cnt = c;
            this.idx = i;
        }
    }



}

