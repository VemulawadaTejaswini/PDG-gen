
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    static class Bamboo {
        private final int id;
        private final int length;

        Bamboo(int id, int length) {
            this.id = id;
            this.length = length;
        }

        int getLength() {
            return length;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Bamboo && Bamboo.class.cast(obj).id == id;
        }

        @Override
        public String toString() {
            return super.toString().concat(String.format("ID:%1$d, Length:%2$d", id, length));
        }
    }

    static class Result {
        private final Set<Bamboo> concatinatedBamboos;
        private final int cost;

        Result(Set<Bamboo> usedBamboos, int usedPoint) {
            this.concatinatedBamboos = usedBamboos;
            this.cost = usedPoint;
        }

        Set<Bamboo> getConcatinatedBamboos() {
            return concatinatedBamboos;
        }

        int getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return String.format("Cost:%1$d, Bamboos:%2$s",
                    cost,
                    concatinatedBamboos.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(",", "[", "]")));
        }
    }

    static class CombinationGenerator implements Iterable<Set<Bamboo>>, Iterator<Set<Bamboo>> {

        private final int maxConcatCount;

        private final Bamboo[] allBamboos;

        private int currentConcatCount = 1;

        private int currentIndex = 0;

        private final int indexLimit;

        public CombinationGenerator(Set<Bamboo> bamboos) {
            this.allBamboos = bamboos.stream().toArray(Bamboo[]::new);
            indexLimit = 1 << bamboos.size();
            maxConcatCount = bamboos.size() - 2;
            findNextIndex();
        }

        @Override
        public boolean hasNext() {
            return currentConcatCount <= maxConcatCount;
        }

        @Override
        public Set<Bamboo> next() {
            Set<Bamboo> result = new HashSet<>(currentConcatCount);
            for (int i = 0; i < allBamboos.length; i++) {
                if (((currentIndex >> i) & 1) == 1) {
                    result.add(allBamboos[i]);
                    if (result.size() >= currentConcatCount) {
                        break;
                    }
                }
            }
            findNextIndex();

            return Collections.unmodifiableSet(result);
        }

        private void findNextIndex() {
            do {
                currentIndex++;
                if (currentIndex >= indexLimit) {
                    currentIndex = 1;
                    currentConcatCount++;
                }
            } while (bitCount(currentIndex) != currentConcatCount
                    && currentConcatCount <= maxConcatCount);
        }

        private int bitCount(int num) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                if (((num >> i) & 1) == 1) {
                    result++;
                }
            }
            return result;
        }

        @Override
        public Iterator<Set<Bamboo>> iterator() {
            return this;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bambooCount = sc.nextInt();
        int[] targetLengths = new int[3];
        targetLengths[0] = sc.nextInt();
        targetLengths[1] = sc.nextInt();
        targetLengths[2] = sc.nextInt();
        Set<Bamboo> allBamboos = new HashSet<>(bambooCount);
        for (int i = 0; i < bambooCount; i++) {
            allBamboos.add(new Bamboo(i, sc.nextInt()));
        }
        allBamboos = Collections.unmodifiableSet(allBamboos);
        CombinationGenerator generator = new CombinationGenerator(allBamboos);
        @SuppressWarnings("unchecked")
        List<Result>[] costs = new List[3];
        costs[0] = new LinkedList<>();
        costs[1] = new LinkedList<>();
        costs[2] = new LinkedList<>();
        for (Set<Bamboo> bamboos : generator) {
            costs[0].add(findMinCost(bamboos, targetLengths[0]));
            costs[1].add(findMinCost(bamboos, targetLengths[1]));
            costs[2].add(findMinCost(bamboos, targetLengths[2]));
        }
        Result[][] sortedResults = new Result[3][];
        sortedResults[0] = costs[0].stream().sorted(Comparator.comparingInt(Result::getCost)).toArray(Result[]::new);
        sortedResults[1] = costs[1].stream().sorted(Comparator.comparingInt(Result::getCost)).toArray(Result[]::new);
        sortedResults[2] = costs[2].stream().sorted(Comparator.comparingInt(Result::getCost)).toArray(Result[]::new);

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < sortedResults[0].length; i++) {
            Result result0 = sortedResults[0][i];
            if (result0.getCost() >= minCost) {
                continue;
            }

            for (int j = 0; j < sortedResults[1].length; j++) {
                Result result1 = sortedResults[1][j];
                int mergedCost = result0.getCost() + result1.getCost();
                if (mergedCost >= minCost) {
                    continue;
                }
                if (result1.getConcatinatedBamboos().stream().anyMatch(result0.getConcatinatedBamboos()::contains)) {
                    continue;
                }
                Set<Bamboo> mergedUsedBamboos = new HashSet<>();
                mergedUsedBamboos.addAll(result0.getConcatinatedBamboos());
                mergedUsedBamboos.addAll(result1.getConcatinatedBamboos());

                for (int k = 0; k < sortedResults[2].length; k++) {
                    Result result2 = sortedResults[2][k];
                    int totalCost = mergedCost + result2.getCost();
                    if (totalCost < minCost) {
                        if (result2.getConcatinatedBamboos().stream()
                                .noneMatch(mergedUsedBamboos::contains)) {
                            minCost = totalCost;
                        }
                    }
                }
            }
        }
        System.out.println(minCost);

    }

    private static Result findMinCost(Set<Bamboo> bamboos, int targetLength) {
        int concatLength = bamboos.stream().mapToInt(Bamboo::getLength).sum();
        int concatCost = (bamboos.size() - 1) * 10;
        return new Result(bamboos, concatCost + Math.abs(targetLength - concatLength));
    }
}
