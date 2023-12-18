import java.util.*;

class Main {
    public static int a[];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        a = new int[n];
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            pairs.add(new Pair(c, b));
        }
        Collections.sort(pairs);
        for (int i = 0; i < m; i++) {
            int tmp = nibutan(0, n, pairs.get(i).key);
            int b = pairs.get(i).key;
            int pos = pairs.get(i).value - 1;
            if (pos < tmp) {
                tmp = pos;
            }
            System.out.println(tmp + " : " + b);
            for (int j = 0; j <= tmp; j++) {
                a[j] = b;
            }
            Arrays.sort(a);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
            System.out.println(a[i]);
        }

        System.out.println(ans);

        sc.close();
    }

    public static int nibutan(int left, int right, int key) {
        int l = left;
        int r = right;
        int mid = (l + r) / 2;
        if (r - l < 2) {
            if (a[l] <= key) {
                return l;
            } else {
                if (a[r] <= key) {
                    return r;
                } else {
                    return -1;
                }
            }
        }
        if (a[mid] > key) {
            return nibutan(l, mid, key);
        } else {
            return nibutan(mid, r, key);
        }
    }
}

class Pair implements Comparable {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Object other) {
        Pair otherPair = (Pair) other;
        if (this.key == otherPair.key)
            return this.value - this.value;
        return this.key - otherPair.key;
    }
}