import java.util.*;

class Pair implements Comparable {
    int p;
    int y;
    int shiIdx;

    Pair(int p, int y, int shiIdx) {
        this.p = p;
        this.y = y;
        this.shiIdx = shiIdx;
    }

    @Override
    public int compareTo(Object o) {
        Pair other = (Pair) o;
        return this.y - other.y;
    }
}

class Pair2 implements Comparable {
    int shiIdx;
    String id;

    Pair2(int shiIdx, String id) {
        this.shiIdx = shiIdx;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Pair2 other = (Pair2) o;
        return this.shiIdx - other.shiIdx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Pair[] pairs = new Pair[M];
        for (int i = 0; i < M; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            pairs[i] = new Pair(p, y, i);
        }

        Arrays.sort(pairs);

        Map<Integer, Integer> map = new HashMap<>();
        Pair2[] pairs2 = new Pair2[M];

        for (int i = 0; i < M; i++) {
            Pair pair = pairs[i];
            int num;
            if (!map.containsKey(pair.p)) {
                map.put(pair.p, 1);
                num = 1;
            } else {
                num = map.get(pair.p) + 1;
                map.put(pair.p, num);
            }

            // pair.pを6桁に変換 + numを6桁に変換 = id
            Pair2 pair2 = new Pair2(pair.shiIdx, String.format("%06d", pair.p) + String.format("%06d", num));
            pairs2[pair.shiIdx] = pair2;
        }

        for (int i = 0; i < M; i++) {
            System.out.println(pairs2[i].id);
        }
    }
}