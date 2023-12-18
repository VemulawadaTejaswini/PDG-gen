
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        PriorityQueue<Entry> pq = new PriorityQueue<Entry>(N, new EntryComparator());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            pq.add(new Entry(sc.nextLong(), sc.nextInt()));
        }

        long price = 0;
        int count = 0;
        while(!pq.isEmpty()){
            Entry entry = pq.poll();
            int tmpCount = entry.E;
            long tmpPrice = entry.S;

            if(tmpCount + count < M){
                price += tmpCount * tmpPrice;
                count += tmpCount;
            } else {
                price += (M - count) * tmpPrice;
                break;
            }
        }

        out.println(price);
    }

    // 小さい順番に並べる
    static class EntryComparator implements Comparator<Entry> {
        @Override
        public int compare(Entry t1, Entry t2) {
            if (t1.S > t2.S) {
                return 1;
            }
            return -1;
        }
    }

    static class Entry {
        public long S;
        public int E;

        public Entry(long S, int E){
            this.S = S;
            this.E = E;
        }
    }
}
