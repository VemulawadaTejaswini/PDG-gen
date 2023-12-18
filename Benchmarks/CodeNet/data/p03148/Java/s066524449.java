

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] T=new int[N];
	    long[] D=new long[N];
	    Pair<Long, Integer>[] ps=new Pair[N];
	    int[] used=new int[N];
	    for(int i=0; i<N;i++) {
	    	int t=gi()-1;
	    	long d=gl();
	    	ps[i]=new Pair<Long, Integer>(d, t);
	    }

	    Arrays.parallelSort(ps, Collections.reverseOrder());

	    long k=0;
	    long point=0;
	    long max=0;
	    for(int i=0; i<K;i++) {
	    	Pair<Long, Integer> p = ps[i];
	    	if(used[p.getValue()]==0)k++;
	    	used[p.getValue()]++;
	    	point+=p.getKey();
	    }

	    point+=Math.pow(k, 2);
	    max=point;

	    for(int i=K; i<N;i++) {
	    	Pair<Long, Integer> p = ps[i];
	    	if(used[p.getValue()]==0) {
	    	    used[p.getValue()]++;
	    	    point-=Math.pow(k, 2);
	    	    k++;
	    	    point+=Math.pow(k, 2);
	    	    point+=p.getKey();
	    	    for(int j=K-1; j>=0;j--) {
	    	    	if(used[ps[j].getValue()]>1) {
	    	    		used[j]--;
	    	    		point-=ps[j].getKey();
	    	    		break;
	    	    	}
	    	    }
	    	    max=Math.max(max, point);
	    	}
	    }

	    System.out.print(max);
	}

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
		/** serialVersionUID. */
	    private static final long serialVersionUID = 6411527075103472113L;

	    public Pair(final K key, final V value) {
	        super(key, value);
	    }

		@Override
		public int compareTo(Pair<K, V> o) {

			Comparable key = (Comparable)this.getKey();
			Comparable key2 = (Comparable)o.getKey();

			return key.compareTo(key2);
		}

	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}