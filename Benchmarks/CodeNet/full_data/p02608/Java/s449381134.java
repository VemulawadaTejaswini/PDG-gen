import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in)) {


            // 文字列
            // String s = sc.next();
            // String ? = sc.next();

            // 整数
            int n = sc.nextInt();
            // int x = sc.nextInt();
            // int d = sc.nextInt();

            // 文字列列
            // ArrayList<String> ? = (ArrayList<String>) ChenAtCoderUtil.nScan(sc, n);
            // ArrayList<String> ? = (ArrayList<String>) ChenAtCoderUtil.nScan(sc, n);

            // 整数列
            // ArrayList<Integer> a = (ArrayList<Integer>) ChenAtCoderUtil.nScanInt(sc, n);
            // ArrayList<Integer> ? = (ArrayList<Integer>) ChenAtCoderUtil.nScanInt(sc, n);

            // 二次元整数列
            // ArrayList<ArrayList<Integer>> ? = new ArrayList<>();

            // ペア整数列
            // Pair<ArrayList<Integer>, ArrayList<Integer>> pair =
            // ChenAtCoderUtil.nScanPair(sc, m);
            // ArrayList<Integer> ? = pair.getKey();
            // ArrayList<Integer> ? = pair.getValue();


            // for (int i = n - 1; 0 <= i; i--) {
            //
            // }

            for (int i = 1; i <= n; i++) {
                long result = 0;
                int yf = 1;
                int zf = 1;
                for (int x = 1; x < i; x++) {
                    for (int y = yf; y < i; y++) {
                        for (int z = zf; z < i; z++) {
                            if (x*x + y*y + z*z + x*y + y*z + z*x > i) {
                                break;
                            }
                            if (x * x + y * y + z * z + x * y + y * z + z * x == i) {
                                if (x+y+z != 3) {
                                    result += 3;
                                } else {
                                    result++;
                                }
                            }
                        }
                        zf++;
                    }
                    yf++;
                }
                System.out.println(result);
            }

            // for (int i = L; i <= R; i++) {
            //     if (i % d == 0)
            //     result++;
            // }

            return null;
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

class ChenAtCoderUtil {
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

    static Pair<ArrayList<Integer>, ArrayList<Integer>> nScanPair(Scanner sc, int n) {
        Pair<ArrayList<Integer>, ArrayList<Integer>> al = new Pair<>(new ArrayList<>(), new ArrayList<>());
        for (int i = 0; i < n; i++) {
            al.getKey().add(sc.nextInt());
            al.getValue().add(sc.nextInt());
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
