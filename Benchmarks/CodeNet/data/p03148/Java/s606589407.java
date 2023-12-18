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
            ArrayList<Integer> duplicationIndexes = new ArrayList<>();

            for (int i = 0; i < K; i++) {
                Sushi poll = list.get(i);

                sumOishisa += poll.oishisa;
                if (netaSet.contains(poll.neta)) {
                    duplicationIndexes.add(i);
                }
                netaSet.add(poll.neta);

                long size = netaSet.size();
                max = Math.max(max, sumOishisa + size * size);
            }
            for (int i = K; i < N; i++) {
                Sushi poll = list.get(i);
                if (netaSet.contains(poll.neta)) {
                    continue;
                }

                boolean remove = false;
                if (duplicationIndexes.size() > 0) {
                    int index = duplicationIndexes.remove(duplicationIndexes.size() - 1).intValue();
                    Sushi state = list.get(index);
                    sumOishisa -= state.oishisa;
                    remove = true;
                }
                if (!remove) {
                    continue;
                }

                sumOishisa += poll.oishisa;
                netaSet.add(poll.neta);

                long size = netaSet.size();
                max = Math.max(max, sumOishisa + size * size);

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
