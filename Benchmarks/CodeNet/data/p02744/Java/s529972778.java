import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final List<String> str = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        new PartitionSetCreator(n).printAllPartitions();

    }

    private static class PartitionSetCreator {
        private int n;
        private Set<Set<Set<Integer>>> parts;//the partitions that are created
        private Set<Set<Integer>> pow;//the power set of the input set
        private Set<Integer> base;//the base set

        /**
         * The main method is just for testing and can be deleted.
         */

        public PartitionSetCreator(int n) {
            this.n = n;
            base = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                base.add(i);
            }
            this.pow = powerSet(base);
            if (pow.size() > 1) {
                //remove the empty set if it's not the only entry in the power set
                pow.remove(new HashSet<Integer>());
            }
            this.parts = new HashSet<>();
        }

        /**
         * Calculation is in this method.
         */
        public void printAllPartitions() {
            //find part sets for every entry in the power set
            for (Set<Integer> set : pow) {
                Set<Set<Integer>> current = new HashSet<Set<Integer>>();
                current.add(set);
                findPartSets(current);
            }

            //return all partitions that were found
            SortedSet<String> result = new TreeSet<>();
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
            for (Set<Set<Integer>> part : parts) {
                char c = 'a';
                List<Set<Integer>> list = part.stream().sorted(Comparator.comparingInt(s -> s.stream().min(Integer::compareTo).get())).collect(Collectors.toList());
                for (Set<Integer> integers : list) {
                    for (Integer integer : integers) {
                        sb.setCharAt(integer-1, c);
                    }
                    c++;
                }
                result.add(sb.toString());
            }

            for (String s : result) {
                System.out.println(s);
            }
        }

        /**
         * Finds all partition sets for the given input and adds them to parts (global variable).
         */
        private void findPartSets(Set<Set<Integer>> current) {
            int maxLen = base.size() - deepSize(current);
            if (maxLen == 0) {
                //the current partition is full -> add it to parts
                parts.add(current);
                //no more can be added to current -> stop the recursion
                return;
            }
            else {
                //for all possible lengths
                for (int i = 1; i <= maxLen; i++) {
                    //for every entry in the power set
                    for (Set<Integer> set : pow) {
                        if (set.size() == i) {
                            //the set from the power set has the searched length
                            if (!anyInDeepSet(set, current)) {
                                //none of set is in current
                                Set<Set<Integer>> next = new HashSet<Set<Integer>>();
                                next.addAll(current);
                                next.add(set);
                                //next = current + set
                                findPartSets(next);
                            }
                        }
                    }
                }
            }
        }

        /**
         * Creates a power set from the base set.
         */
        private Set<Set<Integer>> powerSet(Set<Integer> base) {
            Set<Set<Integer>> pset = new HashSet<Set<Integer>>();
            if (base.isEmpty()) {
                pset.add(new HashSet<Integer>());
                return pset;
            }
            List<Integer> list = new ArrayList<Integer>(base);
            Integer head = list.get(0);
            Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
            for (Set<Integer> set : powerSet(rest)) {
                Set<Integer> newSet = new HashSet<Integer>();
                newSet.add(head);
                newSet.addAll(set);
                pset.add(newSet);
                pset.add(set);
            }

            return pset;
        }

        /**
         * The summed up size of all sub-sets
         */
        private int deepSize(Set<Set<Integer>> set) {
            int deepSize = 0;
            for (Set<Integer> s : set) {
                deepSize += s.size();
            }
            return deepSize;
        }

        /**
         * Checks whether any of set is in any of the sub-sets of current
         */
        private boolean anyInDeepSet(Set<Integer> set, Set<Set<Integer>> current) {
            boolean containing = false;

            for (Set<Integer> s : current) {
                for (Integer item : set) {
                    containing |= s.contains(item);
                }
            }

            return containing;
        }
    }
}

