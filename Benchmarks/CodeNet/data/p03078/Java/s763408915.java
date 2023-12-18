import java.util.*;

public class Main {

    static class Tuple3 {
        int a, b, c;

        public Tuple3(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public String toString() {
            return this.a + "," + this.b + "," + this.c;
        }

        public int hashCode() {
            return this.toString().hashCode();
        }

        public boolean equals(Object other) {

            if (this == other) {
                return true;
            }

            if (!(other instanceof Tuple3)) {
                return false;
            }

            Tuple3 otherT = (Tuple3) other;
            if (this.hashCode() == otherT.hashCode()) {
                return true;
            }
            return false;
        }
    }


    static long[] aArr;
    static long[] bArr;
    static long[] cArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        aArr = new long[x];
        bArr = new long[y];
        cArr = new long[z];

        for (int i = 0; i < x; i++) {
            aArr[i] = sc.nextLong();
        }

        for (int i = 0; i < y; i++) {
            bArr[i] = sc.nextLong();
        }

        for (int i = 0; i < z; i++) {
            cArr[i] = sc.nextLong();
        }

        // ちいさいじゅんに並び替える
//        Arrays.sort(aArr);
//        Arrays.sort(bArr);
//        Arrays.sort(cArr);

        int aCurrentIdx = x - 1;
        int bCurrentIdx = y - 1;
        int cCurrentIdx = z - 1;
        long currentSum = aArr[aCurrentIdx] + bArr[bCurrentIdx] + cArr[cCurrentIdx];
        System.out.println(currentSum);
        Set<Tuple3> set = new HashSet<>();
        set.add(new Tuple3(aCurrentIdx, bCurrentIdx, cCurrentIdx));
        fuga(set, k - 1).stream().map(t -> aArr[t.a] + bArr[t.b] + cArr[t.c]).sorted(Comparator.reverseOrder()).limit(k - 1).forEach(System.out::println);
    }

    static Set<Tuple3> fuga(Set<Tuple3> set, int k) {
        Set<Tuple3> newSet = createIndexTuple(set);
        if (newSet.size() >= k) {
            return newSet;
        } else {
            newSet.addAll(fuga(newSet, k - newSet.size()));
            return newSet;
        }
    }


    static Set<Tuple3> createIndexTuple(Set<Tuple3> tuples) {
        Set<Tuple3> res = new HashSet<>();
        for (Tuple3 t : tuples) {
            res.addAll(hoge(t));
        }
        return res;
    }

    static Set<Tuple3> hoge(Tuple3 tuple) {
        Set<Tuple3> res = new HashSet<>();
        if (tuple.a - 1 >= 0) {
            res.add(new Tuple3(tuple.a - 1, tuple.b, tuple.c));
        }
        if (tuple.b - 1 >= 0) {
            res.add(new Tuple3(tuple.a, tuple.b - 1, tuple.c));
        }
        if (tuple.c - 1 >= 0) {
            res.add(new Tuple3(tuple.a, tuple.b, tuple.c - 1));
        }
        return res;
    }

    static int max3(long[] sums) {
        if (sums[0] > sums[1] && sums[0] > sums[2]) {
            return 0;
        } else if (sums[1] > sums[0] && sums[1] > sums[2]) {
            return 1;
        } else {
            return 2;
        }
    }

    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

}
