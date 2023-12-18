
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] dp;
    static int ind=1;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
	    int[] P=new int[m];
	    int[] Y=new int[m];
        List<Pair<Integer, Integer>> l=new ArrayList<Pair<Integer, Integer>>();
        List<Pair<Integer, Integer>> l2=new ArrayList<Pair<Integer, Integer>>();
        Map<Pair<Integer, Integer>, String> maps=new HashMap<Pair<Integer, Integer>, String>();
        int[] c=new int[100001];

        for (int i=0; i< m;i++) {
        	P[i]=gi();
        	Y[i]=gi();
        	Pair<Integer, Integer> pair= new Pair<Integer, Integer>(P[i], Y[i]);
        	l.add(pair);
        	l2.add(pair);
        }

        //Collections.sort(l);

        for(Pair<Integer, Integer> p : l) {
        	int key = p.getKey();
        	c[key]++;
        	String s= String.format("%06d", key) +String.format("%06d", c[key]);
        	maps.put(p, s);

        }

        for(Pair<Integer, Integer> p :l2) {
        	System.out.println(maps.get(p));
        }

        //System.out.println(max);
	}

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
		/** serialVersionUID. */
	    private static final long serialVersionUID = 6411527075103472113L;

	    public Pair(final K key, final V value) {
	        super(key, value);
	    }

	    @Override
	    public boolean equals(Object o) {
	    	Comparable key = (Comparable)this.getKey();
			Comparable key2 = (Comparable)((Pair)o).getKey();
			Comparable v = (Comparable)this.getValue();
			Comparable v2 = (Comparable)((Pair)o).getValue();

			return key.equals(key) && v.equals(v2);
	    }

//		@Override
//		public int compareTo(Pair<K, V> o) {
//
//			Comparable key = (Comparable)this.getKey();
//			Comparable key2 = (Comparable)o.getKey();
//
//			return key.compareTo(key2);
//		}

		@Override
		public int compareTo(Pair<K, V> o) {

			Comparable key = (Comparable)this.getValue();
			Comparable key2 = (Comparable)o.getValue();

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