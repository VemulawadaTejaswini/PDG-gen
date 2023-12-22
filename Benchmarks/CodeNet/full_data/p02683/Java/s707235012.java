import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long X = sc.nextLong();

        long[] levels = new long[M];
        Arrays.fill(levels, 0);

        // (id - 獲得経験値のマップ)
        Map<Long, List<Long>> booksMap = new HashMap<>();
        // (id - 金額のマップ)
        Map<Long, Long> valuesMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long id = i + 1;
            long value = sc.nextLong();
            valuesMap.put(id, value);
            List<Long> bookList = new ArrayList<>();
            for (int l = 0; l < M; l++) {
                long exp = sc.nextLong();
                bookList.add(exp);
            }
            booksMap.put(id, bookList);
        }
        sc.close();
        // 全選択パターンの格納先
        List<List<Long>> allPatterns = new ArrayList<>();
        Object[] ids = booksMap.keySet().toArray();
        for (int i = 1; i <= N; i++) {
            getPatterns(i, 0, ids, allPatterns, new ArrayList<>(), 1);
        }

        List<Long> results = new ArrayList<>();
        // 全探索
        for (List<Long> selectItem : allPatterns) {
            long value = 0;
            for (Long id : selectItem) {
                List<Long> exps = booksMap.get(id);
                for (int i = 0; i < M; i++) {
                    long exp = levels[i];
                    exp += exps.get(i);
                    levels[i] = exp;
                }
                value += valuesMap.get(id);
            }
            boolean isOK = true;
            for (Long val : levels) {
                if (val < X) {
                    isOK = false;
                    break;
                }
            }
            if (isOK) {
                results.add(value);
            }
            Arrays.fill(levels, 0);
        }
        if (results.size() == 0) {
            System.out.println(-1);
        } else {
            Collections.sort(results);
            System.out.println(results.get(0));
        }
    }

    public static void getPatterns(int count, int curCount, Object[] idList, List<List<Long>> box, List<Long> init,
            long max) {
        List<Long> li = new ArrayList<>(init);
        if (curCount == count) {
            box.add(li);
            return;
        }
        for (int i = 0; i < idList.length; i++) {
            long val = Long.parseLong(idList[i].toString());
            if (val == 0) {
                continue;
            }
            if (val < max) {
                continue;
            }
            li.add(val);
            long befMax = max;
            max = val;
            idList[i] = 0;
            curCount++;
            getPatterns(count, curCount, idList, box, li, max);
            idList[i] = val;
            li = new ArrayList<>(init);
            curCount--;
            max = befMax;
        }
    }

}
