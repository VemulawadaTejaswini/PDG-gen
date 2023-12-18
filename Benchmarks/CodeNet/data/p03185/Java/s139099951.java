import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = nextInt(sc);
        long c = nextLong(sc);
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = nextLong(sc);
        long[] dp = new long[n];
        ConvexHullTrick cht = new ConvexHullTrick(true);
        cht.addLine(-2 * h[n - 1], h[n - 1] * h[n - 1] + dp[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cht.query(h[i]) + h[i] * h[i] + c;
            cht.addLine((int) (-2 * h[i]), h[i] * h[i] + dp[i]);
        }
        sb.append(dp[0]);
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    public static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    public static long nextLong(Scanner sc) {
        return Long.parseLong(sc.next());
    }
}

/**
 * verified:
 *  -
 * 
 * @author https://atcoder.jp/users/suisen
 */
class ConvexHullTrick {
    final LongOrderedMap<Long> Lines = new LongOrderedMap<>();
    final boolean MinQuery;

    public ConvexHullTrick(boolean minQuery) {
        this.MinQuery = minQuery;
    }

    public void addLine(long a, long b) {
        if (!MinQuery) {
            a = -a; b = -b;
        }
        if (Lines.isEmpty()) {
            Lines.put(a, b);
        } else if (Lines.size() == 1) {
            if (Lines.getOrDefault(a, Long.MAX_VALUE) > b) Lines.put(a, b);
        } else {
            LongObjEntry<Long> hi = Lines.higherEntry(a);
            LongObjEntry<Long> lo = Lines.lowerEntry(a);
            long al = lo == null ? 0 : lo.getKey();
            long bl = lo == null ? 0 : lo.getValue();
            long am = a;
            long bm = b;
            long ar = hi == null ? 0 : hi.getKey();
            long br = hi == null ? 0 : hi.getValue();
            if (lo != null && hi != null && !isNecessary(al, bl, am, bm, ar, br)) {
                return;
            }
            Lines.put(a, Math.min(b, Lines.getOrDefault(a, Long.MAX_VALUE)));
            if (hi != null) {
                al = am;
                bl = bm;
                while (true) {
                    LongObjEntry<Long> md = hi;
                    am = md.getKey();
                    bm = md.getValue();
                    hi = Lines.higherEntry(md.getKey());
                    if (hi == null) break;
                    ar = hi.getKey();
                    br = hi.getValue();
                    if (isNecessary(al, bl, am, bm, ar, br)) break;
                    Lines.remove(am);
                }
            }
            if (lo != null) {
                ar = am; br = bm;
                while (true) {
                    LongObjEntry<Long> md = lo;
                    am = md.getKey();
                    bm = md.getValue();
                    lo = Lines.lowerEntry(md.getKey());
                    if (lo == null) break;
                    al = lo.getKey();
                    bl = lo.getValue();
                    if (isNecessary(al, bl, am, bm, ar, br)) break;
                    Lines.remove(am);
                }
            }
        }
    }

    boolean isNecessary(long al, long bl, long am, long bm, long ar, long br) {
        long l = (ar - am) * (bl - bm);
        long r = (am - al) * (bm - br);
        if (l == r) return false;
        return l > r;
    }

    public long query(long x) {
        int l = 0, r = Lines.size();
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (apply(Lines.kthEntry(m - 1), x) >= apply(Lines.kthEntry(m), x)) {
                l = m;
            } else {
                r = m;
            }
        }
        long y = apply(Lines.kthEntry(l), x);
        return MinQuery ? y : -y;
    }

    long apply(LongObjEntry<Long> f, long x) {
        return f.getKey() * x + f.getValue();
    }
}

class IntObjEntry<V> implements Map.Entry<Integer, V> {
    private int key;
    private V val;
    public IntObjEntry(int key, V val) {
        this.key = key;
        this.val = val;
    }
    public Integer getKey() {
        return key;
    }
    public int getKeyAsInt() {
        return key;
    }
    public V getValue() {
        return val;
    }
    public V setValue(V newValue) {
        V oldValue = val;
        val = newValue;
        return oldValue;
    }
    public String toString() {
        return key + " => " + val;
    }
}

class LongObjEntry<V> implements Map.Entry<Long, V> {
    private long key;
    private V val;
    public LongObjEntry(long key, V val) {
        this.key = key;
        this.val = val;
    }
    public Long getKey() {
        return key;
    }
    public long getKeyAsLong() {
        return key;
    }
    public V getValue() {
        return val;
    }
    public V setValue(V newValue) {
        V oldValue = val;
        val = newValue;
        return oldValue;
    }
}

class MutablePair<T, U> implements java.io.Serializable {
    private static final long serialVersionUID = -2022089021501463539L;
    private T fst;
    private U snd;
    public MutablePair(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }
    public T getFirst() {
        return fst;
    }
    public U getSecond() {
        return snd;
    }
    public T setFirst(T newValue) {
        T oldValue = fst;
        fst = newValue;
        return oldValue;
    }
    public U setSecond(U newValue) {
        U oldValue = snd;
        snd = newValue;
        return oldValue;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (fst == null ? 0 : fst.hashCode());
        result = 31 * result + (snd == null ? 0 : snd.hashCode());
        return result;
    }
    @Override
    @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof MutablePair) {
            MutablePair p = (MutablePair) o;
            boolean equalsFirst = fst == null ? p.fst == null : fst.equals(p.fst);
            boolean equalsSecond = snd == null ? p.snd == null : snd.equals(p.snd);
            return equalsFirst && equalsSecond;
        }
        return false;
    }
    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}

class LongOrderedMap<V> implements Iterable<LongObjEntry<V>> {
    private static Random rnd = new Random();
    RBST<V> root;
    public LongOrderedMap() {}
    private LongOrderedMap(RBST<V> root) {this.root = root;}
    public static <V> LongOrderedMap<V> merge(LongOrderedMap<V> l, LongOrderedMap<V> r) {
        return l.mergeRight(r);
    }
    public LongOrderedMap<V> mergeLeft(LongOrderedMap<V> l) {
        return new LongOrderedMap<>(RBST.merge(l.root, root));
    }
    public LongOrderedMap<V> mergeRight(LongOrderedMap<V> r) {
        return new LongOrderedMap<>(RBST.merge(root, r.root));
    }
    public LongOrderedMap<V> splitRightUsingIndex(int k) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingIndex(int k) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        root = snd.root;
        return fst;
    }
    public LongOrderedMap<V> splitRightUsingKey(long key) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingKey(long key) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        root = snd.root;
        return fst;
    }
    public LongObjEntry<V> kthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        return RBST.kthEntry(root, k);
    }
    public LongObjEntry<V> firstEntry() {
        return kthEntry(0);
    }
    public LongObjEntry<V> lastEntry() {
        return kthEntry(size() - 1);
    }
    public LongObjEntry<V> lowerEntry(long key) {
        return kthEntry(RBST.ltCount(root, key) - 1);
    }
    public LongObjEntry<V> floorEntry(long key) {
        return kthEntry(RBST.leqCount(root, key) - 1);
    }
    public LongObjEntry<V> higherEntry(long key) {
        return kthEntry(RBST.leqCount(root, key));
    }
    public LongObjEntry<V> ceilingEntry(long key) {
        return kthEntry(RBST.ltCount(root, key));
    }
    public V get(long key) {
        return RBST.get(root, key);
    }
    public V getOrDefault(long key, V defaultValue) {
        V res = RBST.get(root, key);
        return res != null ? res : defaultValue;
    }
    public V put(long key, V val) {
        if (RBST.contains(root, key)) {
            LongObjEntry<V> e = RBST.getEntry(root, key);
            V oldValue = e.getValue();
            e.setValue(val);
            return oldValue;
        }
        root = RBST.insert(root, key, val);
        return null;
    }
    public V putIfAbsent(long key, V val) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e != null) return e.getValue();
        put(key, val);
        return null;
    }
    public LongObjEntry<V> removeKthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingIndex(root, k);
        root = nodeAndEntry.getFirst();
        return nodeAndEntry.getSecond();
    }
    public LongObjEntry<V> remove(long key) {
        if (!containsKey(key)) return null;
        MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
        root = nodeAndEntry.getFirst();
        return nodeAndEntry.getSecond();
    }
    public boolean remove(long key, V value) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        if (Objects.equals(value, e.getValue())) {
            MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
            root = nodeAndEntry.getFirst();
            return true;
        }
        return false;
    }
    public V replace(long key, V newValue) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return null;
        V oldValue = e.getValue();
        e.setValue(newValue);
        return oldValue;
    }
    public boolean replace(long key, V oldValue, V newValue) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        V value = e.getValue();
        if (Objects.equals(value, oldValue)) {
            e.setValue(newValue);
            return true;
        }
        return false;
    }
    public boolean containsKey(long key) {
        return RBST.contains(root, key);
    }
    public int size() {
        return RBST.size(root);
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void clear() {
        root = null;
    }
    public Set<LongObjEntry<V>> entrySet() {
        return RBST.entrySet(root);
    }
    public Set<LongObjEntry<V>> descendingEntrySet() {
        return RBST.descendingEntrySet(root);
    }
    public Iterator<LongObjEntry<V>> iterator() {
        return RBST.iterator(root);
    }
    public Iterator<LongObjEntry<V>> descendingIterator() {
        return RBST.descendingIterator(root);
    }
    public PrimitiveIterator.OfLong keyIterator() {
        return RBST.keyIterator(root);
    }
    public PrimitiveIterator.OfLong descendingKeyIterator() {
        return RBST.descendingKeyIterator(root);
    }
    public Set<Long> keySet() {
        return RBST.keySet(root);
    }
    public Set<Long> descendingKeySet() {
        return RBST.descendingKeySet(root);
    }
    public Collection<V> values() {
        return RBST.values(root);
    }
    public Optional<V> safeGet(long key) {
        V res = get(key);
        return res != null ? Optional.of(res) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetFirstEntry() {
        return size() > 0 ? Optional.of(kthEntry(0)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetLastEntry() {
        return size() > 0 ? Optional.of(kthEntry(size() - 1)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetLowerEntry(long key) {
        int k = RBST.ltCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetFloorEntry(long key) {
        int k = RBST.leqCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetHigherEntry(long key) {
        int k = RBST.leqCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetCeilingEntry(long key) {
        int k = RBST.ltCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    static final class RBST<V> extends LongObjEntry<V> {
		private RBST<V> l, r;
        private int size;
        private RBST(long key, V val) {super(key, val); this.size = 1;}
        private RBST<V> update() {
            size = size(l) + size(r) + 1;
            return this;
        }
        static <V> LongObjEntry<V> getEntry(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return t;
                t = t.getKeyAsLong() < key ? t.r : t.l;
            }
            return null;
        }
        static <V> V get(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return t.getValue();
                t = t.getKeyAsLong() < key ? t.r : t.l;
            }
            return null;
        }
        static <V> LongObjEntry<V> kthEntry(RBST<V> t, int k) {
            int c = size(t.l);
            if (k < c) return kthEntry(t.l, k);
            if (k == c) return t;
            return kthEntry(t.r, k - c - 1);
        }
        static <V> int leqCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key < t.getKeyAsLong()) return leqCount(t.l, key);
            return leqCount(t.r, key) + size(t.l) + 1;
        }
        static <V> int ltCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key <= t.getKeyAsLong()) return ltCount(t.l, key);
            return ltCount(t.r, key) + size(t.l) + 1;
        }
        static <V> RBST<V> merge(RBST<V> l, RBST<V> r) {
            if (l == null) return r;
            if (r == null) return l;
            if (rnd.nextInt() % (l.size + r.size) < l.size) {
                l.r = merge(l.r, r);
                return l.update();
            } else {
                r.l = merge(l, r.l);
                return r.update();
            }
        }
        static <V> MutablePair<RBST<V>, RBST<V>> splitUsingIndex(RBST<V> x, int k) {
            if (k < 0 || k > size(x)) {
                throw new IndexOutOfBoundsException(
                    String.format("index %d is out of bounds for the length of %d", k, size(x))
                );
            }
            if (x == null) {
                return new MutablePair<RBST<V>, RBST<V>>(null, null);
            } else if (k <= size(x.l)) {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(x.l, k);
                x.l = p.getSecond();
                p.setSecond(x.update());
                return p;
            } else {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(x.r, k - size(x.l) - 1);
                x.r = p.getFirst();
                p.setFirst(x.update());
                return p;
            }
        }
        static <V> MutablePair<RBST<V>, RBST<V>> splitUsingKey(RBST<V> x, long key) {
            if (x == null) {
                return new MutablePair<RBST<V>, RBST<V>>(null, null);
            } else if (key <= x.getKeyAsLong()) {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(x.l, key);
                x.l = p.getSecond();
                p.setSecond(x.update());
                return p;
            } else {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(x.r, key);
                x.r = p.getFirst();
                p.setFirst(x.update());
                return p;
            }
        }
        static <V> RBST<V> insert(RBST<V> t, long key, V val) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            return RBST.merge(RBST.merge(p.getFirst(), new RBST<>(key, val)), p.getSecond());
        }
        static <V> MutablePair<RBST<V>, LongObjEntry<V>> eraseUsingIndex(RBST<V> t, int k) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(t, k);
            MutablePair<RBST<V>, RBST<V>> q = splitUsingIndex(p.getSecond(), 1);
            return new MutablePair<>(RBST.merge(p.getFirst(), q.getSecond()), q.getFirst());
        }
        static <V> MutablePair<RBST<V>, LongObjEntry<V>> eraseUsingKey(RBST<V> t, long key) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            MutablePair<RBST<V>, RBST<V>> q = splitUsingIndex(p.getSecond(), 1);
            return new MutablePair<>(RBST.merge(p.getFirst(), q.getSecond()), q.getFirst());
        }
        static <V> boolean contains(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return true;
                else if (t.getKeyAsLong() < key) t = t.r;
                else t = t.l;
            }
            return false;
        }
        static <V> int size(RBST<V> nd) {
            return nd == null ? 0 : nd.size;
        }
        static <V> Set<LongObjEntry<V>> entrySet(RBST<V> t) {
            LinkedHashSet<LongObjEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntObjEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.r != null) stack.addLast(new IntObjEntry<>(0, t.r));
            stack.addLast(new IntObjEntry<>(1, t));
            if (t.l != null) stack.addLast(new IntObjEntry<>(0, t.l));
            while (stack.size() > 0) {
                IntObjEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.getKeyAsInt() == 1) {
                    set.add(u);
                } else {
                    if (u.r != null) stack.addLast(new IntObjEntry<>(0, u.r));
                    stack.addLast(new IntObjEntry<>(1, u));
                    if (u.l != null) stack.addLast(new IntObjEntry<>(0, u.l));
                }
            }
            return set;
        }
        static <V> Set<LongObjEntry<V>> descendingEntrySet(RBST<V> t) {
            LinkedHashSet<LongObjEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntObjEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.l != null) stack.addLast(new IntObjEntry<>(0, t.l));
            stack.addLast(new IntObjEntry<>(1, t));
            if (t.r != null) stack.addLast(new IntObjEntry<>(0, t.r));
            while (stack.size() > 0) {
                IntObjEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.getKeyAsInt() == 1) {
                    set.add(u);
                } else {
                    if (u.l != null) stack.addLast(new IntObjEntry<>(0, u.l));
                    stack.addLast(new IntObjEntry<>(1, u));
                    if (u.r != null) stack.addLast(new IntObjEntry<>(0, u.r));
                }
            }
            return set;
        }
        static <V> Set<Long> keySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongObjEntry<V> e : entrySet(t)) set.add(e.getKeyAsLong());
            return set;
        }
        static <V> Set<Long> descendingKeySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongObjEntry<V> e : descendingEntrySet(t)) set.add(e.getKeyAsLong());
            return set;
        }
        static <V> Collection<V> values(RBST<V> t) {
            Collection<V> col = new ArrayList<>();
            for (LongObjEntry<V> e : entrySet(t)) col.add(e.getValue());
            return col;
        }
        static <V> Iterator<LongObjEntry<V>> iterator(RBST<V> t) {
            return entrySet(t).iterator();
        }
        static <V> Iterator<LongObjEntry<V>> descendingIterator(RBST<V> t) {
            return descendingEntrySet(t).iterator();
        }
        static <V> PrimitiveIterator.OfLong keyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongObjEntry<V>> it = iterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().getKeyAsLong();}
            };
        }
        static <V> PrimitiveIterator.OfLong descendingKeyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongObjEntry<V>> it = descendingIterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().getKeyAsLong();}
            };
        }
        public String toString() {
            return "(" + getKey() + " => " + getValue() + ")";
        }
    }

    static final class Random {
        int x = 123456789, y = 362436069, z = 521288629, w = 88675123;
        int nextInt() {
            int t = x ^ (x << 11);
            x = y; y = z; z = w;
            return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
        }
    }

    public static void main(String[] args) {
        LongOrderedMap<String> map = new LongOrderedMap<>();
        System.out.println("PUT");
        map.put(0, "a");
        map.put(4, "e");
        map.put(6, "g");
        map.put(4, "ee"); // replace
        map.put(-1, "z");
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("REMOVE");
        map.removeKthEntry(2); // removing (4, "ee")
        map.removeKthEntry(1); // removing (0, "a")
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("ADD");
        map.putIfAbsent(-1, "zzz"); // has no effect
        map.replace(0, "a", "aa");  // has no effect
        map.put(2, "c");
        map.replace(2, "cc");       // replace
        map.put(3, "d");
        map.replace(3, "dd", "ddd");// has no effect
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("GET");
        System.out.println(map.kthEntry(0));
        System.out.println(map.kthEntry(1));
        System.out.println(map.kthEntry(2));
        System.out.println(map.kthEntry(3));
        System.out.println(map.kthEntry(4)); // null
        System.out.println("KEYS");
        for (long key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("VALUES");
        for (String val : map.values()) {
            System.out.println(val);
        }
        System.out.println("DESC ENTRIES");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("DESC KEYS");
        for (long key : map.descendingKeySet()) {
            System.out.println(key);
        }
        System.out.println("HIGHER/LOWER/CEILING/FLOOR");
        System.out.println(map.higherEntry(3));
        System.out.println(map.lowerEntry(3));
        System.out.println(map.ceilingEntry(3));
        System.out.println(map.floorEntry(3));
        System.out.println(map.lowerEntry(2));
        System.out.println(map.floorEntry(2));
        System.out.println(map.higherEntry(6)); // null
        System.out.println(map.ceilingEntry(7));// null
        System.out.println(map.floorEntry(-2)); // null
        System.out.println(map.lowerEntry(-1)); // null
        System.out.println("L");
        LongOrderedMap<String> l = map.splitLeftUsingIndex(2);
        for (LongObjEntry<String> e : l.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("R");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        map = map.mergeLeft(l);
        LongOrderedMap<String> r = map.splitRightUsingKey(3);
        System.out.println("L");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("R");
        for (LongObjEntry<String> e : r.descendingEntrySet()) {
            System.out.println(e);
        }
    }
}