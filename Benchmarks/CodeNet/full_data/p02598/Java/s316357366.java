import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			MultiSet<Double> multiSet = new MultiSet<>();
			IntStream.range(0, n).forEach(i -> multiSet.add(scanner.nextDouble()));
			System.out.println((int) Math.ceil(getResult(multiSet, k)));
		}
	}

	private static double getResult(MultiSet<Double> multiSet, int k) {
		// System.out.println("k=" + k + ", multiSet=" + multiSet);
		if (k == 0) {
			return multiSet.last();
		}
		// 2等分
		MultiSet<Double> newSet1 = new MultiSet<>(multiSet);
		Double last = newSet1.last();
		newSet1.remove(last);
		newSet1.add(last / 2.0);
		newSet1.add(last / 2.0);
		if ((1 == k) || (k > 10)) {
			return getResult(newSet1, k - 1);
		}
		// 3等分
		MultiSet<Double> newSet2 = new MultiSet<>(multiSet);
		last = newSet2.last();
		newSet2.remove(last);
		newSet2.add(last / 3.0);
		newSet2.add(last / 3.0);
		newSet2.add(last / 3.0);
		return Math.min(getResult(newSet1, k - 1), getResult(newSet2, k - 2));
	}

	/**
	 * MultiSetの実装
	 * 
	 * @param <E>
	 */
	private static class MultiSet<E> implements NavigableSet<E>, Cloneable, Serializable {

		/** */
		private static final long serialVersionUID = 1L;

		/** データを格納するマップ */
		TreeMap<E, Integer> treeMap;

		MultiSet() {
			treeMap = new TreeMap<>();
		}

		MultiSet(Comparator<? super E> comparator) {
			treeMap = new TreeMap<>(comparator);
		}

		MultiSet(MultiSet multiSet) {
			this.treeMap = new TreeMap<>(multiSet.treeMap);
		}

		@Override
		public Comparator<? super E> comparator() {
			return treeMap.comparator();
		}

		@Override
		public E first() {
			return treeMap.firstKey();
		}

		@Override
		public E last() {
			return treeMap.lastKey();
		}

		@Override
		public int size() {
			return treeMap.values().stream().mapToInt(Integer::intValue).sum();
		}

		@Override
		public boolean isEmpty() {
			return treeMap.isEmpty();
		}

		@Override
		public boolean contains(Object o) {
			return treeMap.containsKey(o);
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public Object[] toArray() {
			return treeMap.keySet().toArray();
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public <T> T[] toArray(T[] a) {
			return treeMap.keySet().toArray(a);
		}

		@Override
		public boolean add(E e) {
			treeMap.put(e, treeMap.getOrDefault(e, 0) + 1);
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean remove(Object o) {
			if (treeMap.containsKey(o)) {
				int count = treeMap.get(o) - 1;
				if (0 == count) {
					treeMap.remove(o);
				} else {
					treeMap.put((E) o, count);
				}
				return true;
			}
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			return treeMap.keySet().containsAll(c);
		}

		@Override
		public boolean addAll(Collection<? extends E> c) {
			if ((null != c) && (!c.isEmpty())) {
				c.forEach(o -> add(o));
				return true;
			}
			return false;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public boolean retainAll(Collection<?> c) {
			boolean result = false;
			if ((null != c) && (!c.isEmpty())) {
				for (E e : treeMap.keySet()) {
					if (!c.contains(e)) {
						treeMap.remove(e);
						result = true;
					}
				}
			} else {
				result = !treeMap.isEmpty();
				treeMap.clear();
			}
			return result;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			if ((null != c) && (!c.isEmpty())) {
				boolean result = false;
				for (Object o : c) {
					result = result || remove(o);
				}
				return result;
			}
			return false;
		}

		@Override
		public void clear() {
			treeMap.clear();
		}

		@Override
		public E lower(E e) {
			return treeMap.lowerKey(e);
		}

		@Override
		public E floor(E e) {
			return treeMap.floorKey(e);
		}

		@Override
		public E ceiling(E e) {
			return treeMap.ceilingKey(e);
		}

		@Override
		public E higher(E e) {
			return treeMap.higherKey(e);
		}

		@Override
		public E pollFirst() {
			return (null != treeMap.pollFirstEntry()) ? treeMap.pollFirstEntry().getKey() : null;
		}

		@Override
		public E pollLast() {
			return (null != treeMap.pollLastEntry()) ? treeMap.pollLastEntry().getKey() : null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public Iterator<E> iterator() {
			return treeMap.keySet().iterator();
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public NavigableSet<E> descendingSet() {
			return treeMap.descendingKeySet();
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public Iterator<E> descendingIterator() {
			return treeMap.descendingKeySet().iterator();
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
			return null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public NavigableSet<E> headSet(E toElement, boolean inclusive) {
			return null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
			return null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public SortedSet<E> subSet(E fromElement, E toElement) {
			return null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public SortedSet<E> headSet(E toElement) {
			return null;
		}

		/**
		 * 必要がないため、暫定実装
		 */
		@Override
		public SortedSet<E> tailSet(E fromElement) {
			return null;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<E, Integer> entry : treeMap.entrySet()) {
				IntStream.range(0, entry.getValue()).forEach(i -> sb.append(entry.getKey()).append(","));
			}
			return sb.toString();
		}
	}
}
