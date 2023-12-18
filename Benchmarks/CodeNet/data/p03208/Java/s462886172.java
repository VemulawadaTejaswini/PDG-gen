

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Long, Long> map = new TreeMap<>();
        Pair max = new Pair(0L, 0L);
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long time = 1;
            if (map.containsKey(num)) {
                long tmp = map.get(num);
                map.put(num, tmp + 1);
                time = tmp + 1;
            } else {
                map.put(num, 1L);
            }
            if (time == k) {
                System.out.println(0);
                return;
            } else {
                if (time > max.value) {
                    max = new Pair(num, time);
                }
            }
        }
        List<Long> keys = new ArrayList<>(map.keySet());
        int index = keys.indexOf(max.key);
        int diffUp = 0;
        int diffDown2 = 0;
        Long treeValueUp = k - max.value;
        Ans ans1 = null;
        up:
        while (treeValueUp > 0) {
            diffUp++;
            if (index + diffUp >= keys.size()) {
                //下に下がる
                while (treeValueUp >= 0) {
                    diffDown2++;
                    if (index - diffDown2 < 0) {
                        ans1 = new Ans(0, keys.size() - 1);
                        break up;
                    }
                    treeValueUp = treeValueUp - map.get(keys.get(index - diffDown2));
                }
                ans1 = new Ans(index - diffDown2, keys.size() - 1);
                break;
            }
            treeValueUp = treeValueUp - map.get(keys.get(index + diffUp));
        }
        if (ans1 == null) {
            ans1 = new Ans(index - diffDown2, diffUp);
        }
        Ans ans2 = null;
        int diffDown = 0;
        int diffUp2 = 0;
        Long treeValueDown = k - max.value;
        down:
        while (treeValueDown > 0) {
            diffDown++;
            if (index - diffDown < 0) {
                while (treeValueDown >= 0) {
                    diffUp2++;
                    if (index + diffUp2 >= keys.size()) {
                        ans2 = new Ans(0, keys.size() - 1);
                        break down;
                    }
                    treeValueDown = treeValueDown - map.get(keys.get(index + diffUp2));
                }
                ans2 = new Ans(0, index + diffUp2);
                break;
            }
            treeValueDown = treeValueDown - map.get(keys.get(index - diffDown));
        }
        if (ans2 == null) {
            ans2 = new Ans(diffDown, index + diffUp);
        }

        long result1 = keys.get(ans1.max) - keys.get(ans1.min);
        long result2 = keys.get(ans2.max) - keys.get(ans2.min);
        System.out.println(Math.min(result1, result2));
    }

    static class Pair {
        public Pair(Long key, Long value) {
            this.key = key;
            this.value = value;
        }

        Long key;
        Long value;
    }

    static class Ans {
        public Ans(int min, int max) {
            this.min = min;
            this.max = max;
        }

        int min;
        int max;
    }

}
