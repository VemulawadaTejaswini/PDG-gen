import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in)) {
            long result = 0;
            // 文字列
            // String s = sc.next();
            // String ? = sc.next();

            // 整数
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 文字列列
            // ArrayList<String> ? = (ArrayList<String>) ChenInputrUtil.nScan(sc, n);
            // ArrayList<String> ? = (ArrayList<String>) ChenInputrUtil.nScan(sc, n);

            // 整数列
            // ArrayList<Integer> ? = (ArrayList<Integer>) ChenInputrUtil.nScanInt(sc, n);
            // ArrayList<Integer> ? = (ArrayList<Integer>) ChenInputrUtil.nScanInt(sc, n);

            // 二次元整数列
            // ArrayList<ArrayList<Integer>> ? = ChenInputrUtil.nmScanInt(sc, n, m);
            // ArrayList<ArrayList<Long>> ? = ChenInputrUtil.nmScanLong(sc, n, m);

            // 値を取りながら整数列を作るやつ
            // ArrayList<ArrayList<Integer>> ? = ChenInputrUtil.nExtendScanInt(sc, n);

            // ペア整数列
            // Pair<Collection<Integer>, Collection<Integer>> intPair =
            // ChenInputrUtil.nPairScan(sc, n);
            // ArrayList<Integer> ? = (ArrayList<Integer>) intPair.getKey();
            // ArrayList<Integer> ? = (ArrayList<Integer>) intPair.getValue();

            // for (int i = 0; i < n; i++) {
            //
            // }

            if (a == b && b == c) {
                return -1;
            }
            int a2;
            int b2;
            int c2;
            while (true) {
                if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                    result++;
                    a2 = b / 2 + c / 2;
                    b2 = a / 2 + c / 2;
                    c2 = a / 2 + b / 2;
                    if ((a == a2 && b == b2 && c == c2) || (a == b2 && b == c2 && c == a2)
                            || (a == c2 && b == a2 && c == b2) || (a == a2 && b == c2 && c == b2)
                            || (a == b2 && b == a2 && c == c2) || (a == c2 && b == b2 && c == a2)) {
                        return -1;
                    }
                    a = a2;
                    b = b2;
                    c = c2;
                } else
                    break;
            }
            return result;
        }
    }
}

class ChenNumberUtil {
    static Collection<Integer> getDivisors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i)
                    al.add(n / i);
            }
        }
        Collections.sort(al);
        return al;
    }
}

class ChenBitUtil {
    static int popCount(int bit) {
        return Integer.bitCount(bit);
    }

    static boolean isFlag(int bit, int i) {
        return 0 != (bit & (1 << i));
    }

    static int setTrue(int bit, int i) {
        return bit |= (1 << i);
    }

    static int setFalse(int bit, int i) {
        return bit &= ~(1 << i);
    }

    static int setReverse(int bit, int i) {
        return isFlag(bit, i) ? setFalse(bit, i) : setTrue(bit, i);
    }

    static int reverseAll(int bit) {
        return ~bit;
    }
}

class ChenInputUtil {
    static Collection<Integer> nScanInt(Scanner sc, int n) {
        Collection<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    static Collection<Long> nScanLong(Scanner sc, int n) {
        Collection<Long> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLong());
        }
        return al;
    }

    static Collection<Double> nScanDouble(Scanner sc, int n) {
        Collection<Double> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextDouble());
        }
        return al;
    }

    static Collection<String> nScan(Scanner sc, int n) {
        Collection<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.next());
        }
        return al;
    }

    static Collection<String> nScanLine(Scanner sc, int n) {
        Collection<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLine());
        }
        return al;
    }

    static Pair<Collection<Integer>, Collection<Integer>> nPairScan(Scanner sc, int n) {
        Pair<Collection<Integer>, Collection<Integer>> al = new Pair<>(new ArrayList<>(), new ArrayList<>());
        for (int i = 0; i < n; i++) {
            al.getKey().add(sc.nextInt());
            al.getValue().add(sc.nextInt());
        }
        return al;
    }

    static ArrayList<ArrayList<Integer>> nmScanInt(Scanner sc, int n, int m) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                al.get(i).set(j, sc.nextInt());
            }
        }
        return al;
    }

    static ArrayList<ArrayList<Long>> nmScanLong(Scanner sc, int n, int m) {
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                al.get(i).set(j, sc.nextLong());
            }
        }
        return al;
    }

    static ArrayList<ArrayList<Integer>> nExtendScanInt(Scanner sc, int n) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                al.get(i).add(sc.nextInt());
            }
        }
        return al;
    }
}

class Pair<K, V> implements Entry<K, V>, java.io.Serializable {
    private static final long serialVersionUID = -8499721149061103585L;

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair(Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public K setKey(K key) {
        K oldKey = this.key;
        this.key = key;
        return oldKey;
    }

    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
        return eq(key, e.getKey()) && eq(value, e.getValue());
    }

    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        return key + "=" + value;
    }

    private static boolean eq(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }
}
