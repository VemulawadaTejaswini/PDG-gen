

import java.util.*;

public class Main {
    public static class Sushi {
        int kind;
        int value;
        public Sushi(int kind, int value) {
            this.kind = kind;
            this.value = value;
        }

        @Override
        public String toString() {
            return "kind=" + kind +
                    ", value=" + value;
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        PriorityQueue<Sushi> sushis = new PriorityQueue<>((s1, s2) -> s2.value - s1.value);
        for (int i = 0; i < n; ++i) {
            int kind = scanner.nextInt();
            int value = scanner.nextInt();
            sushis.add(new Sushi(kind, value));
        }
        Map<Integer, PriorityQueue<Sushi>> choose = new HashMap<>();
        Map<Integer, Integer> kindChooseNum = new HashMap<>();

        long result = 0;
        for (int i = 0; i < k; ++i) {
            Sushi sushi = sushis.poll();
            PriorityQueue<Sushi> sushiInCurrentKind = choose.getOrDefault(
                    sushi.kind, new PriorityQueue<>((s1, s2) -> s1.value - s2.value)
            );
            sushiInCurrentKind.add(sushi);
            choose.put(sushi.kind, sushiInCurrentKind);
            result += sushi.value;
        }
        PriorityQueue<Sushi> minSushi = new PriorityQueue<>((s1, s2) -> s1.value - s2.value);
        choose.entrySet().forEach(
                kindSushiInKind -> {
                    if (kindSushiInKind.getValue().size() > 1) {
                        minSushi.addAll(kindSushiInKind.getValue());
                    }
                    kindChooseNum.put(kindSushiInKind.getKey(), kindSushiInKind.getValue().size());
                }
        );

        int chooseKinds = choose.size();
        result += choose.size() * choose.size();
        Set<Long> results = new HashSet<>();
        results.add(result);

        while (!sushis.isEmpty() && !minSushi.isEmpty()) {
            Sushi sushi = sushis.poll();
          //  System.out.println("check sushi: " + sushi);
            if (choose.containsKey(sushi.kind)) {
                continue;
            }
            Sushi deleteSushi = minSushi.poll();
            while (kindChooseNum.get(deleteSushi.kind) == 1 && !minSushi.isEmpty()) {
                deleteSushi = minSushi.poll();
            }
         //   System.out.println("deleteSushi: " + deleteSushi);
            if (kindChooseNum.get(deleteSushi.kind) > 1) {
                // replace deleteSushi to sushi
                long newResult = result - chooseKinds * chooseKinds - deleteSushi.value +
                        (chooseKinds + 1) * (chooseKinds + 1) + sushi.value;
          //      System.out.println("newResult: " + newResult);

                int currentKindChooseNum = kindChooseNum.get(deleteSushi.kind);
                kindChooseNum.put(deleteSushi.kind, currentKindChooseNum - 1);
                kindChooseNum.put(sushi.kind, 1);
                PriorityQueue<Sushi> chooseSushi = new PriorityQueue<>((s1, s2) -> s1.value - s2.value);
                chooseSushi.add(sushi);
                choose.put(sushi.kind, chooseSushi);
                result = newResult;
                ++chooseKinds;
                results.add(newResult);
            }

        }
        long maxResult = result;
        for (long r : results) {
            maxResult = Math.max(r, maxResult);
        }
        System.out.println(maxResult);

    }
}
