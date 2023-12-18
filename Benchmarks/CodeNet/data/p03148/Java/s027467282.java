import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            long[] neta = new long[N];
            long[] oishisa = new long[N];
            for (int i = 0; i < N; i++) {
                neta[i] = in.nextInt();
                oishisa[i] = in.nextInt();
            }

            ArrayList<Sushi> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(new Sushi(neta[i], oishisa[i]));
            }
            Collections.sort(list);

            long max = 0;

            long sumOishisa = 0;
            HashSet<Long> netaSet = new HashSet<>();
//            int[] count2 = new int[N];
            HashMap<Long, Integer> netaToCount = new HashMap<>();
            ArrayList<Integer> duplicationIndexes = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                Sushi poll = list.get(i);
//                Utils.debug(poll.t, poll.d);

                if (i < K) {
                    if (netaSet.contains(poll.neta)) {
                        duplicationIndexes.add(i);
                    }
                } else {
                    if (netaSet.contains(poll.neta)) {
                        continue;
                    }

                    boolean remove = false;
                    for (int j = duplicationIndexes.size() - 1; j >= 0; j--) {
                        Sushi state = list.get(duplicationIndexes.get(j));
                        duplicationIndexes.remove(j);
//                        assert netaToCount.get(state.neta).intValue() > 1;
//                        if (netaToCount.get(state.neta).intValue() > 1) {
                        sumOishisa -= state.oishisa;
                        netaToCount.put(state.neta, (netaToCount.get(state.neta) == null ? 0 : netaToCount.get(state.neta).intValue()) - 1);
                        remove = true;
                        break;
//                        }
                    }
                    if (!remove) {
                        continue;
                    }

                }

                sumOishisa += poll.oishisa;
                netaToCount.put(poll.neta, 1 + (netaToCount.get(poll.neta) == null ? 0 : netaToCount.get(poll.neta).intValue()));
                netaSet.add(poll.neta);

                max = Math.max(max, sumOishisa + netaSet.size() * netaSet.size());
//                Utils.debug(score, set.size(), max);
            }

            System.out.println(max);
        }
    }

}

class Sushi implements Comparable<Sushi> {
    long neta;
    long oishisa;

    public Sushi(long t, long d) {
        super();
        this.neta = t;
        this.oishisa = d;
    }

    @Override
    public int compareTo(Sushi o) {
        if (oishisa > o.oishisa) {
            return -1;
        }
        if (oishisa < o.oishisa) {
            return 1;
        }
        return 0;
    }
}
