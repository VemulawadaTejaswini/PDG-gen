import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Element> map1 = new HashMap<>();
        Map<Integer, Element> map2 = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            int v = sc.nextInt();
            if (!map1.keySet().contains(v)) {
                map1.put(v, new Element(v));
            }
            map1.get(v).num += 1;

            v = sc.nextInt();
            if (!map2.keySet().contains(v)) {
                map2.put(v, new Element(v));
            }
            map2.get(v).num += 1;
        }
        sc.close();

        List<Element> list1 = map1.values().stream().sorted((e1, e2) -> e2.num - e1.num).collect(Collectors.toList());
        List<Element> list2 = map2.values().stream().sorted((e1, e2) -> e2.num - e1.num).collect(Collectors.toList());
//        System.out.println(list1);
//        System.out.println(list2);

        int ans;
        // 奇数列と偶数列で一番多い数が違う場合
        if (list1.get(0).v != list2.get(0).v) {
            int sum1 = sum(list1);
            int max1 = max(list1);

            int sum2 = sum(list2);
            int max2 = max(list2);

            ans = (sum1 - max1) + (sum2 - max2);
        } else { // 奇数列と偶数列で一番多い数が同じ場合
            if (list1.size() == 1) {
                if (list2.size() == 1) {
                    ans = n / 2;
                } else {
                    int max2 = list2.get(1).num;
                    int sum2 = sum(list2);
                    ans = sum2 - max2;
                }
            } else {
                if (list2.size() == 1) {
                    int max1 = list1.get(1).num;
                    int sum1 = sum(list1);
                    ans = sum1 - max1;
                } else {
                    // candidate1
                    int max1 = list1.get(0).num;
                    int sum1 = sum(list1);
                    int max2 = list2.get(1).num;
                    int sum2 = sum(list2);
                    int candidate1 = (sum1 - max1) + (sum2 - max2);
                    // candidate2
                    max1 = list1.get(1).num;
                    sum1 = sum(list1);
                    max2 = list2.get(0).num;
                    sum2 = sum(list2);
                    int candidate2 = (sum1 - max1) + (sum2 - max2);

                    ans = Math.min(candidate1, candidate2);
                }
            }
        }

        System.out.println(ans);
    }

    static int max(List<Element> list) {
        return list.stream().mapToInt(e -> e.num).max().getAsInt();
    }

    static int sum(List<Element> list) {
        return list.stream().mapToInt(e -> e.num).sum();
    }

    static int max(Map<Integer, Integer> map) {
        return map.values().stream().mapToInt(e -> e).sorted().max().getAsInt();
    }

    static int sum(Map<Integer, Integer> map) {
        return map.values().stream().mapToInt(e -> e).sum();
    }

    static class Element {
        int v;
        int num;

        Element(int v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return "(v=" + v + ", num=" + num + ")";
        }
    }
}
