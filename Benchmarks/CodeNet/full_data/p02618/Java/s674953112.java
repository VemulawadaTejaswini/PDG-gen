import java.util.*;

public class Main {

    static final Random rnd = new Random();
    static final long LIMIT = 1880L;
    static final long RANGE = 7000L;
    static final int D = 365;
    static final int[] c = new int[27];
    static final int[][] s = new int[365][27];
    static final int[] ans = new int[365];
    static final int[] last = new int[27];
    static final Map<Integer, TreeSet<Integer>> lastMap = new HashMap<>();
    public static void main(String[] args) {
        long end = System.currentTimeMillis() + LIMIT;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= 26; i++) {
            lastMap.put(i, new TreeSet<>());
            lastMap.get(i).add(0);
            lastMap.get(i).add(D+1);
        }
        StringBuilder sb = new StringBuilder();
        int score = 0;
        int[] tmpc = new int[27];
        for (int i = 0; i < D; i++) {
            int max = score;
            int idx = 0;
            for (int j = 1; j <= 26; j++) {
                tmpc[j] = c[j] * (i - last[j] + 1);
                score -= tmpc[j];
            }
            for (int j = 1; j <= 26; j++) {
                int tmp = score + s[i][j] +  tmpc[j];
                if(max < tmp){
                    max = tmp;
                    idx = j;
                }
            }
            score = max;
            ans[i] = idx;
            last[idx] = i+1;
            lastMap.get(idx).add(i+1);
        }

        // greedy
        while(System.currentTimeMillis() < end){
            boolean change = false;
            for (int i = 0; i < D; i++) {
                int prei = ans[i];
                int idx = prei;
                int max = s[i][prei] + c[prei] * (i - lastMap.get(prei).lower(i+1) +1) * (lastMap.get(prei).higher(i+1) - i -1);
                for (int j = 1; j <= 26; j++) {
                    if(j == prei)continue;
                    int tmp = s[i][j] + c[j] * (i - lastMap.get(j).lower(i+1) +1) * (lastMap.get(j).higher(i+1) - i -1);
                    if(max < tmp){
                        idx = j;
                        max = tmp;
                    }
                }
                if(prei != idx){
                    ans[i] = idx;
                    lastMap.get(prei).remove(i+1);
                    lastMap.get(idx).add(i+1);
                    change = true;
                }
            }
            if(!change)break;
        }

        // yakinamashi
        int cnt = 0;
        double rate = 0;
        double line = 0;
        while (true) {
            long curTime = System.currentTimeMillis();
            if (end < curTime) {
                break;
            }
            rate = (end - curTime) / LIMIT;
            line = rate * RANGE;

            for (int i = 0; i < 1000; i++) {
                cnt++;
                // 2-swap
                swapTwo(line, cnt);
                // random change
                if (rnd.nextDouble() < 0.4) randomChange(line);
            }

        }

//    System.out.println("LOOPCOUNT:" + cnt);
//    System.err.println("LOOPCOUNT:" + cnt);


        for (int i = 0; i < D; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    private static boolean swapTwo(double line, int cnt) {
        int d1 = cnt % (D-1);
        int d2 = rnd.nextInt(15) + d1 + 1;
        if(D <= d2) d2 = D-1;
        int t1 = ans[d1], t2 = ans[d2];
        if(t1 == t2 && d1 != 0) t1 = ans[--d1];
        if(t1 == t2 && d2 != D-1) t2 = ans[++d2];
        if(t1 == t2)return false;
        int preScore = calcScoreDiff(d1, t1) + calcScoreDiff(d2, t2);
        ans[d1] = t2; ans[d2] = t1;
        lastMap.get(t1).remove(d1+1);
        lastMap.get(t2).remove(d2+1);
        lastMap.get(t1).add(d2+1);
        lastMap.get(t2).add(d1+1);
        int tryScore = calcScoreDiff(d1, t2) + calcScoreDiff(d2, t1);
        if(preScore < tryScore || preScore - tryScore < line){
            lastMap.get(t1).remove(d1+1);
            lastMap.get(t2).remove(d2+1);
            lastMap.get(t1).add(d2+1);
            lastMap.get(t2).add(d1+1);
            return true;
        }else{
            ans[d1] = t1; ans[d2] = t2;
            lastMap.get(t1).remove(d2+1);
            lastMap.get(t2).remove(d1+1);
            lastMap.get(t1).add(d1+1);
            lastMap.get(t2).add(d2+1);
        }
        return false;
    }

    private static boolean randomChange(double line) {
        int day = (int)(rnd.nextDouble() * D);
        int type = rnd.nextInt(26)+1;
        int preType = ans[day];
        if(preType == type) return false;
        int preScore = calcScoreDiff(day, preType);
        int tryScore = calcScoreDiff(day, type);
        if(preScore < tryScore || preScore - tryScore < line){
            ans[day] = type;
            lastMap.get(preType).remove(day+1);
            lastMap.get(type).add(day+1);
            return true;
        }
        return false;
    }

    private static int calcScoreDiff(int day, int type){
        return s[day][type] + c[type] * (day - lastMap.get(type).lower(day+1) +1) * (lastMap.get(type).higher(day+1) - day -1);
    }

}
