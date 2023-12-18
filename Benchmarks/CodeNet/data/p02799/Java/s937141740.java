import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;

public class Main {
    public static final int MAX_WEIGHT = 1_000_000_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] d = new int[n];
        HashMap<Integer, Integer>[] graph = new HashMap[n];
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
            graph[i] = new HashMap<>();
        }

        int u, v;
        for (int i = 0; i < m; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            graph[u - 1].put(v - 1, i);
            graph[v - 1].put(u - 1, i);
        }
        Pair<Boolean[], Integer[]> result = bichrome(graph, d, m);
        if (result != null) {
            Boolean[] colors = result.getFirst();
            for (int i = 0; i < n; i++) {
                System.out.print(colors[i] ? "B" : "W");
            }
            System.out.println();
            for (int w : result.second) {
                System.out.println(w);
            }
        } else {
            System.out.println(-1);
        }
    }

    public static Pair<Boolean[], Integer[]> bichrome(HashMap<Integer, Integer>[] graph, int[] weights, int numM) {
        Boolean[] nodeColors = new Boolean[weights.length];
        Integer[] edgeWeights = new Integer[numM];

        TreeMap<Integer, Set<Integer>> treeMap = IntStream.range(0, weights.length).boxed()
                .collect(Collectors.groupingBy(i -> weights[i], TreeMap::new, toSet()));

        Map<Integer, Integer> toMin = IntStream.range(0, weights.length).boxed()
                .collect(Collectors.toMap(i -> i, i -> graph[i].keySet().stream().min(Comparator.comparingInt(toI -> weights[toI])).get()));

        for (Map.Entry<Integer, Set<Integer>> setEntry : treeMap.entrySet()) {
            Set<Integer> entryValue = setEntry.getValue();
            Integer minWeight = setEntry.getKey();
            for (Integer withMinWeightNode : entryValue) {
                if (nodeColors[withMinWeightNode] != null) continue;
                Integer toMinForNode = toMin.get(withMinWeightNode);
                if (nodeColors[toMinForNode] != null) {
                    nodeColors[withMinWeightNode] = !nodeColors[toMinForNode];
                    edgeWeights[graph[withMinWeightNode].get(toMinForNode)] = minWeight;
                    continue;
                }
                if (entryValue.contains(toMinForNode)) {
                    //нужно покрасить два
                    nodeColors[withMinWeightNode] = true;
                    nodeColors[toMinForNode] = false;
                    edgeWeights[graph[withMinWeightNode].get(toMinForNode)] = minWeight;
                    continue;
                }
                return null;
            }
        }


        for (int i = 0; i < edgeWeights.length; i++) {
            if (edgeWeights[i] == null) edgeWeights[i] = MAX_WEIGHT;
        }
        return new Pair<>(nodeColors, edgeWeights);
    }

    public static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
}