import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static class X {
		long x;
		long y;
		long z;
		public X(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	private enum Operation {add, remove};
    private static<T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation) result.add(item);
        if (Operation.remove == operation) result.remove(item);
        return result;
    }

    private static<T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0) return apply(new HashSet<>(), Operation.add, selected); // 選択済みのもののみ要素に持つ集合をかえす
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(
                    _combination(
                            apply(selected, Operation.add, item), // item を選択済みに変更
                            depth - 1,
                            apply(pool, Operation.remove, item)  // pool の中からは取り除く
                    )
            );
        }
        return result;
    }
    public static<T> Set<Set<T>> combination(Set<T> src, int k) {return _combination(new HashSet<T>(), k, src);}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Set<X> src = new HashSet<X>();
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			long b = Long.parseLong(sc.next());
			long c = Long.parseLong(sc.next());
			src.add(new X(a, b, c));
		}
		long ans = 0;
		Set<Set<X>> result = combination(src, m);
		for (Iterator<Set<X>> i = result.iterator(); i.hasNext();) {
			long a = 0, b = 0, c = 0;
			for (Iterator<X> j = i.next().iterator(); j.hasNext();) {
				X tem = j.next();
				a += tem.x;
				b += tem.y;
				c += tem.z;
			}
			ans = Math.max(ans, Math.abs(a) + Math.abs(b) + Math.abs(c));
		}
		System.out.println(ans);
    }
}