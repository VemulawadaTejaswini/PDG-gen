import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] charArr = sc.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int tmp = map.getOrDefault(charArr[i], 0);
            tmp++;
            map.put(charArr[i], tmp);
        }

        List<Integer> values = new ArrayList<Integer>(map.values());

        long MOD = 1000000007L;

//        System.out.println("values " + values);
        long tmpMod = 0L;
        // 取得個数ごとにmodの足し算
        for (int i = 1; i < values.size() + 1; i++) {
            tmpMod = (tmpMod + hoge(values, i)) % MOD;
        }

        System.out.println(tmpMod);

    }

    static long hoge(List<Integer> values, int n) {
        long MOD = 1000000007L;
        long tmpMod = 0L;
//        System.out.println("indexList " + combination(values, n));
        for (List<Integer> l : combination(values, n)) {
            long tmp2Mod = 1L;
            // 組み合わせ要素の積でのmod
            for (int i : l) {
                tmp2Mod = (i % MOD * tmp2Mod) % MOD;
            }
            // その和のmod
            tmpMod = (tmpMod + tmp2Mod) % MOD;
        }
        return tmpMod;
    }

    static List<List<Integer>> indexLists(List<Integer> values, int n) {
        List<List<Integer>> res = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i < values.size(); i++) {
                res.add(Arrays.asList(i));
            }
        } else if (n == 2) {
            for (int i = 0; i < values.size(); i++) {
                for (int j = i + 1; j < values.size(); j++) {
                    res.add(Arrays.asList(i, j));
                }
            }
        } else if (n == 3) {
            for (int i = 0; i < values.size(); i++) {
                for (int j = i + 1; j < values.size(); j++) {
                    for (int k = j + 1; k < values.size(); k++) {
                        res.add(Arrays.asList(i, j));
                    }
                }
            }

        }
        return res;
    }


//    public static void main(String[] args) {
//        List<List<Integer>> res = new ArrayList<>();
//        System.out.println(combination(new ArrayList<>(Arrays.asList(1, 2, 3)),3));
//
//    }

    public static List<List<Integer>> combination(List<Integer> values, int r) {
        if (values.size() < r || values.size() <= 0 || r <= 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }

        List<List<Integer>> combination = new ArrayList<>();
        for (int i = 0; i <= values.size() - r; i++) {
            Integer picked = values.get(i);
            List<Integer> rest = new ArrayList<>(values);
            rest.subList(0, i + 1).clear();
            combination.addAll(combination(rest, r - 1).stream().map(list -> {
                list.add(0, picked);
                return list;
            }).collect(Collectors.toList()));
        }
        return combination;
    }

    // List[1, 2, 3], 2 => List[List[1, 2], List[2, 3], List[1, 3]
    static List<List<Integer>> indexLists2(List<List<Integer>> res, List<Integer> values, int i, int n) {
        if (res.size() == n) {
            return res;
        } else if (i > n - 1) {
            return new ArrayList<>();
        } else {
            int size = values.size();
            final Integer ELEMENT = values.get(i);
            List<Integer> nextValues = values.subList(i + 1, size);
            int nextI = i++;
            List<List<Integer>> list1 = indexLists2(res, nextValues, nextI, n);
            res.stream().map(l -> l.add(ELEMENT)).collect(Collectors.toList());
            List<List<Integer>> list2 = indexLists2(res, nextValues, nextI, n);
            System.out.println("list1 " + list1);
            System.out.println("list2 " + list2);
            list1.addAll(list2);
            return list1;
        }
    }
}
