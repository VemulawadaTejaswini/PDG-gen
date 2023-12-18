

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.util.AbstractList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		SkipList<Integer> unko=new SkipList<Integer>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			unko.add(sc.nextInt());
		}
		Collections.sort(unko);
		int kosu=0;
		while(true){
			int a=unko.get(unko.size()-1);
			unko.remove(unko.size()-1);
			int max=solve_pair(a);
			int hosu=max-a;
			int ban=Collections.binarySearch(unko, hosu);
			if(ban>=0) {
					kosu++;
					unko.remove(ban);
			}
			if(unko.size()==0) {
				break;
			}
		}
		System.out.println(kosu);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	static int solve_pair(int a) {
		int k=0;
		int b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		int aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		return aaa;
	}
	public static class SkipList<E> extends AbstractList<E> implements Cloneable, Serializable {
		static SkipList<Integer> unko=new SkipList<Integer>();
		private static final long serialVersionUID = 8750206937467686912L;

		protected class Pointer<T> implements Serializable {
			private static final long serialVersionUID = -5260753036548236032L;

			public Entry<T> prev;
			public Entry<T> next;
			public int distance;

			public Pointer(Entry<T> prev, Entry<T> next, int distance) {
				this.prev = prev;
				this.next = next;
				this.distance = distance;
			}
		}

		protected class Entry<T> implements Serializable {
			private static final long serialVersionUID = 6623755413831454813L;

			public Pointer<T>[] pts;
			public Entry<T> prev;
			public Entry<T> next;
			public T value;

			public Entry() {
			}

			@SuppressWarnings("unchecked")
			public Entry(int level, Entry<T> prev, Entry<T> next, T value) {
				if(level > 0) {
					this.pts = new Pointer[level];
				}
				this.prev = prev;
				this.next = next;
				this.value = value;
			}

			public int level() {
				return pts != null ? pts.length : 0;
			}
		}

		protected class EntryIterator implements Iterator<E> {
			private Entry<E> current;
			private int expectedSize;

			public EntryIterator(Entry<E> current) {
				this.current = current;
				expectedSize = size;
			}

			public boolean hasNext() {
				return current.next != head;
			}

			public E next() {
				if(!hasNext()) {
					throw new NoSuchElementException();
				}
				current = current.next;
				return current.value;
			}

			public void remove() {
				if(expectedSize != size) {
					throw new ConcurrentModificationException();
				}
				removeEntry(current);
				expectedSize = size;
			}
		}

		protected class BackwardEntryIterator implements Iterator<E> {
			private Entry<E> current;
			private int expectedSize;

			public BackwardEntryIterator(Entry<E> current) {
				this.current = current;
				expectedSize = size;
			}

			public boolean hasNext() {
				return current.prev != head;
			}

			public E next() {
				if(!hasNext()) {
					throw new NoSuchElementException();
				}
				current = current.prev;
				return current.value;
			}

			public void remove() {
				if(expectedSize != size) {
					throw new ConcurrentModificationException();
				}
				removeEntry(current);
				expectedSize = size;
			}
		}

		protected Entry<E> head;
		protected int size;

		private int randomSeed;

		public SkipList() {
			Random rand = new Random();
			randomSeed = rand.nextInt() | 0x100;
			buildHead();
		}

		private void buildHead() {
			head = new Entry<E>();
			head.prev = head;
			head.next = head;
		}

		// [ref] java.util.concurrent.ConcurrentSkipListMap
		private int generateRandomLevel() {
			int x = randomSeed;
			x ^= x << 13;
			x ^= x >>> 17;
			randomSeed = x ^= x << 5;
			if((x & 0x8001) != 0) {
				return 0;
			}
			int level = 0;
			while(((x >>>= 1) & 1) != 0) {
				level++;
			}
			return level;
		}

		@SuppressWarnings("unchecked")
		protected Entry<E> addBefore(E element, Entry<E> entry) {
			int headLevel = head.level();
			int level = Math.min(generateRandomLevel(), headLevel + 1);
			if(level > headLevel) {
				Pointer<E>[] pts = new Pointer[level];
				for(int i = 0; i < headLevel; i++) {
					pts[i] = head.pts[i];
				}
				for(int i = headLevel; i < level; i++) {
					pts[i] = new Pointer<E>(head, head, 0);
				}
				head.pts = pts;
				headLevel = level;
			}

			Entry<E> prev = entry.prev;
			Entry<E> next = entry;
			Entry<E> e = new Entry<E>(level, prev, next, element);
			next.prev = e;
			prev.next = e;

			int prevDistance = 1;
			int nextDistance = 1;
			for(int i = 0; i < level; i++) {
				while(prev.pts == null) {
					prevDistance++;
					prev = prev.prev;
				}
				int lv = prev.level();
				while(lv <= i) {
					Pointer<E> prevPt = prev.pts[lv - 1];
					prevDistance += prevPt.prev.pts[lv - 1].distance;
					prev = prevPt.prev;
					lv = prev.pts.length;
				}
				while(next.pts == null) {
					nextDistance++;
					next = next.next;
				}
				lv = next.level();
				while(lv <= i) {
					Pointer<E> nextPt = next.pts[lv - 1];
					nextDistance += nextPt.distance;
					next = nextPt.next;
					lv = next.pts.length;
				}

				e.pts[i] = new Pointer<E>(prev, next, nextDistance);

				prev.pts[i].next = e;
				prev.pts[i].distance = prevDistance;
				next.pts[i].prev = e;
			}
			for(int i = level; i < headLevel; i++) {
				while(prev.pts == null) {
					prev = prev.prev;
				}
				while(prev.pts.length <= i) {
					prev = prev.pts[prev.pts.length - 1].prev;
				}
				prev.pts[i].distance++;
			}

			size++;
			return e;
		}

		protected Entry<E> getEntry(int index) {
			if(index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("size: " + size + ", index: " + index);
			}
			Entry<E> e = head;
			int level = e.level();
			int curIndex = -1;
			while(curIndex != index) {
				if(level == 0) {
					e = e.next;
					curIndex++;
				}
				else {
					Pointer<E> p = e.pts[level - 1];
					int n = curIndex + p.distance;
					if(n <= index) {
						e = p.next;
						curIndex = n;
					}
					else {
						level--;
					}
				}
			}
			return e;
		}

		protected void removeEntry(Entry<E> entry) {
			Entry<E> prev = entry.prev;
			Entry<E> next = entry.next;
			prev.next = next;
			next.prev = prev;
			int level = entry.level();
			if(level > 0) {
				for(int i = 0; i < level; i++) {
					Pointer<E> p = entry.pts[i];
					prev = p.prev;
					next = p.next;
					prev.pts[i].next = next;
					next.pts[i].prev = prev;
					prev.pts[i].distance += p.distance - 1;
				}
				prev = entry.pts[level - 1].prev;
			}
			int headLevel = head.level();
			for(int i = level; i < headLevel; i++) {
				while(prev.pts == null) {
					prev = prev.prev;
				}
				while(i >= prev.pts.length) {
					prev = prev.pts[prev.pts.length - 1].prev;
				}
				prev.pts[i].distance--;
			}
			size--;
		}

		protected int getIndex(Entry<E> entry) {
			Entry<E> e = entry;
			int distance = 0;
			while(e != head) {
				if(e.pts == null) {
					distance++;
					e = e.next;
				}
				else {
					Pointer<E> p = e.pts[e.pts.length - 1];
					distance += p.distance;
					e = p.next;
				}
			}
			return size - distance;
		}

		@Override
		public int size() {
			return size;
		}

		@Override
		public void clear() {
			buildHead();
			size = 0;
		}

		@Override
		public boolean add(E element) {
			addBefore(element, head);
			return true;
		}

		@Override
		public void add(int index, E element) {
			if(index == size) {
				addBefore(element, head);
			}
			else {
				Entry<E> entry = getEntry(index);
				addBefore(element, entry);
			}
		}

		@Override
		public E remove(int index) {
			Entry<E> entry = getEntry(index);
			removeEntry(entry);
			return entry.value;
		}

		@Override
		public boolean remove(Object o) {
			int index = indexOf(o);
			if(index == -1) {
				return false;
			}
			remove(index);
			return true;
		}

		@Override
		public E get(int index) {
			return getEntry(index).value;
		}

		@Override
		public E set(int index, E value) {
			Entry<E> entry = getEntry(index);
			E oldValue = entry.value;
			entry.value = value;
			return oldValue;
		}

		@Override
		public int indexOf(Object o) {
			int index = 0;
			Entry<E> e = head.next;
			if(o == null) {
				for(; e != head; e = e.next, index++) {
					if(e.value == null) {
						return index;
					}
				}
			}
			else {
				for(; e != head; e = e.next, index++) {
					if(e.value.equals(o)) {
						return index;
					}
				}
			}
			return -1;
		}

		@Override
		public int lastIndexOf(Object o) {
			int index = size - 1;
			Entry<E> e = head.prev;
			if(o == null) {
				for(; e != head; e = e.prev, index--) {
					if(e.value == null) {
						return index;
					}
				}
			}
			else {
				for(; e != head; e = e.prev, index--) {
					if(e.value.equals(o)) {
						return index;
					}
				}
			}
			return -1;
		}

		@Override
		public Iterator<E> iterator() {
			return new EntryIterator(head);
		}

		public Iterator<E> backwardIterator() {
			return new BackwardEntryIterator(head);
		}
	}
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class GB29{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[][] ar=new long[N][2];
		for(int i=0; i<N; i++) {
			ar[i][0]=sc.nextInt();
			ar[i][1]=0;
		}
		quick_sort(ar,0,N-1);
		int  kosu=0;
		for(int i=0; i<N; i++) {
			if(ar[N-1-i][1]==0) {
				long a=ar[N-1-i][0];
				long k=unko(a)-a;
				int aa=bS(k,ar);
				if(aa>=0 && ar[aa][1]==0) {
					kosu++;
					ar[N-i-1][1]++;
					ar[aa][1]++;
				}
				else if(aa==-1) {
					ar[N-i-1][1]++;
				}
			}
			else {
				//
			}
		}
		System.out.println(kosu);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	static long unko(long a) {
		int k=0;
		long b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		long aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		if(aaa>=2*a) {
			aaa=a;
		}
		return aaa;
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left;
		int r = right;
		long tmp;
		long tmp1;
		long tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
	static int bS(long n, long[][] ary){
		int low = 0;
		int high = ary.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (n == ary[mid][0])
				return mid;
			else if (n > ary[mid][0])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}

*/

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class GB29{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		ArrayList<Integer> unko=new ArrayList<Integer>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			unko.add(sc.nextInt());
		}
		Collections.sort(unko);
		int kosu=0;
		while(true){
			int a=unko.get(unko.size()-1);
			int max=unko(a);
			int hosu=max-a;
			int ban=unko.indexOf(hosu);
			if(ban>=0) {
				kosu++;
				unko.remove(unko.size()-1);
				unko.remove(ban);
			}
			else {
				unko.remove(unko.size()-1);
			}
			if(unko.size()==0) {
				break;
			}
		}
		System.out.println(kosu);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	static int unko(int a) {
		int k=0;
		int b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		int aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		if(aaa>=2*a) {
			aaa=a;
		}
		return aaa;
	}
}
*/