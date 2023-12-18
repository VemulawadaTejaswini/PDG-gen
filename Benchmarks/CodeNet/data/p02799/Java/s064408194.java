import java.util.*;

public class Main {
    public static final int MAX_WEIGHT = 1_000_000_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] d = new int[n];
        int[] toMin = new int[n];
        int[] curMin = new int[n];
        int[] edgeMin = new int[n];
        Arrays.fill(curMin, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }

        int u, v;
        for (int i = 0; i < m; i++) {
            u = scanner.nextInt()-1;
            v = scanner.nextInt()-1;
            if(curMin[u]>d[v]){
                toMin[u] = v;
                curMin[u] = d[v];
                edgeMin[u] = i;
            }
            if(curMin[v]>d[u]){
                toMin[v] = u;
                curMin[v] = d[u];
                edgeMin[v] = i;
            }
        }


        Pair<Boolean[], Integer[]> result = bichrome(d, toMin, edgeMin, m);
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

    public static Pair<Boolean[], Integer[]> bichrome(int[] d, int[] toMin, int[] edgeMin, int m) {
        int n = toMin.length;
        Boolean[] nodeColors = new Boolean[n];
        Integer[] edgeWeights = new Integer[m];

        SortedMap<Integer, Set<Integer>> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int finalI = i;
            treeMap.compute(d[i], (key, value)->{
                if(value!=null){
                    value.add(finalI);
                    return value;
                }else{
                    HashSet<Object> set = new HashSet<>();
                    set.add(finalI);
                    return set;
                }
            });
        }

        for (Map.Entry<Integer, Set<Integer>> setEntry : treeMap.entrySet()) {
            Set<Integer> entryValue = setEntry.getValue();
            Integer minWeight = setEntry.getKey();
            for (Integer node : entryValue) {
                if (nodeColors[node] != null) continue;
                Integer toMinForNode = toMin[node];
                if (nodeColors[toMinForNode] != null) {
                    nodeColors[node] = !nodeColors[toMinForNode];
                    edgeWeights[edgeMin[node]] = minWeight;
                    continue;
                }
                if (entryValue.contains(toMinForNode)) {
                    //нужно покрасить два
                    nodeColors[node] = true;
                    nodeColors[toMinForNode] = false;
                    edgeWeights[edgeMin[node]] = minWeight;
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