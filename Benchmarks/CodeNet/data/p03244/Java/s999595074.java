import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Map<Integer, Integer> counterEven = new HashMap<>();
        Map<Integer, Integer> counterOdd = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                increaseCount(counterEven, A[i]);
            } else {
                increaseCount(counterOdd, A[i]);
            }
        }

        List<Pair> lstEven = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counterEven.entrySet()) {
            lstEven.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(lstEven);

        List<Pair> lstOdd = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counterOdd.entrySet()) {
            lstOdd.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(lstOdd);

        int maxNumEven = lstEven.get(0).num;
        int maxNumOdd = lstOdd.get(0).num;

        if (maxNumEven != maxNumOdd) {
            int total = N - lstEven.get(0).cnt - lstOdd.get(0).cnt;
            System.out.println(total);
        } else {
            if (lstEven.get(0).cnt < lstOdd.get(0).cnt) {
                int total = N - lstOdd.get(0).cnt;
                if (lstEven.size() > 1) {
                    total -= lstEven.get(1).num;
                } 
                System.out.println(total);
            } else {
                int total = N - lstEven.get(0).cnt;
                if (lstOdd.size() > 1) {
                    total -= lstOdd.get(1).num;
                }
                System.out.println(total);
            }
        }
    }

    private static void increaseCount(Map<Integer, Integer> counter, int num) {
        if (counter.containsKey(num)) {
            counter.put(num, counter.get(num) + 1);
        } else {
            counter.put(num, 1);
        }
    }

    static class Pair implements Comparable<Pair> {
        int num;
        int cnt;
        public Pair(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cnt - o.cnt;
        }
    }
}
