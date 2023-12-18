import java.util.*;

class Pair implements Comparable {
    int index;
    int value;

    Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Pair other = (Pair) o;
        return this.value - other.value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Pair[] A = new Pair[N];
        Pair[] B = new Pair[N];
        for (int i = 0; i < N; i++) {
            A[i] = new Pair(i, sc.nextInt());
            B[i] = new Pair(i, sc.nextInt());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());


        boolean[] bused = new boolean[N];
        int bpointer = 0;
        Map<Integer, Integer> taboo = new HashMap<>();
        long ret = 0;

        for (int aidx = 0; aidx < N; aidx++) {
            int tmpBpointer = bpointer;
            while (bused[tmpBpointer] || A[aidx].index == B[tmpBpointer].index || aidx == tmpBpointer) tmpBpointer++;
            ret += Math.min(A[aidx].value, B[tmpBpointer].value);
            taboo.put(tmpBpointer, aidx);
            bused[tmpBpointer] = true;
            if (tmpBpointer == bpointer) {
                while (!bused[bpointer]) bpointer++;
            }
        }

        System.out.println(ret);
    }
}