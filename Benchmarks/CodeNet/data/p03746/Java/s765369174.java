package atcoder.gc013.b;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] is = new int[m][2];
        for (int i = 0; i < m; i++) {
            is[i][0] = sc.nextInt() - 1;
            is[i][1] = sc.nextInt() - 1;
        }
        //        System.out.println(is.length);

        LinkedHashMap<Integer, Set<Integer>> map = new LinkedHashMap<>();
        for (int[] i : is) {
            int a = i[0];
            int b = i[1];
            if (!map.containsKey(a)) {
                map.put(a, new TreeSet<>());
            }
            if (!map.containsKey(b)) {
                map.put(b, new TreeSet<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }
        // System.out.println(map);

        int[][] xxx = new int[n + 1][0];
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> list = new ArrayList<>(entry.getValue());
            xxx[key] = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                xxx[key][i] = list.get(i);
            }
        }

        // 一番端点が少ないものから始める
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(a).size() - map.get(b).size());


        for (int start : list) {
            int[] must = xxx[start];
            // mustをすべて通る経路を探す
            LinkedList<Integer> result = new LinkedList<>();
            for (int second : must) {
                boolean[] passed = new boolean[n];
                passed[start] = true;
                boolean ok = go(second, xxx, must, passed, result);
                if (ok) {
                    result.addFirst(start);
                    System.out.println(result.size());
                    System.out.println(result.stream().map(i -> i + 1 + "").collect(Collectors.joining(" ")));
                    return;
                }
            }
        }
    }

    public static boolean go(int into, int[][] xxx, int[] must, boolean[] passed, LinkedList<Integer> result) {
        if (passed[into] == true) {
            return false;
        }
        passed[into] = true;
        if (isAllPassed(into, xxx, must, passed)) {
            result.addFirst(into);
            return true;
        }
        for (int next : xxx[into]) {
            boolean ok = go(next, xxx, must, passed, result);
            if (ok) {
                result.addFirst(into);
                return true;
            }
        }
        passed[into] = false;
        return false;
    }

    public static boolean isAllPassed(int end, int[][] xxx, int[] must, boolean[] passed) {
        for (int i : must) {
            if (passed[i] == false) {
                return false;
            }
        }
        for (int i : xxx[end]) {
            if (passed[i] == false) {
                return false;
            }
        }
        return true;
    }
}

