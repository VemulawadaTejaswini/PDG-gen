import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            pairs.add(new Pair(a, b));
        }
        Collections.sort(pairs);
        long ans = 0;
        // 残り日数
        int index = -1;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int j = 0;
            int size = pairs.size();

            while (j < size) {
                int need = pairs.get(j).key;
                if (i + 1 < need) {
                    break;
                }
                int val = pairs.get(j).value;
                if (val >= max) {
                    index = j;
                    max = val;
                }
                j++;
            }

            if (index != -1) {
                ans += max;
                pairs.remove(index);
            }
            index = -1;
            max = 0;
        }
        System.out.println(ans);

        sc.close();
    }
}

class Pair implements Comparable<Pair> {
    // key , value 昇順ソート
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.key == other.key) {
            return this.value - other.value;
        }
        return this.key - other.key;
    }
}
