
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
	    long[] P=new long[m];
	    long[] Y=new long[m];
        List<Pair<Long, Long>> l=new ArrayList<Pair<Long, Long>>();
        List<Pair<Long, Long>> l2=new ArrayList<Pair<Long, Long>>();
        Map<Long, Long> map=new HashMap<Long, Long>();
        Map<Pair<Long, Long>, String> maps=new HashMap<Pair<Long, Long>, String>();

        for (int i=0; i< m;i++) {
        	P[i]=gl();
        	Y[i]=gl();
        	Pair<Long, Long> pair= new Pair<Long, Long>(P[i], Y[i]);
        	l.add(pair);
        	l2.add(pair);
        }

        Collections.sort(l);

        for(Pair<Long, Long> p : l) {
        	long key = p.getKey();
        	if(!map.containsKey(key)) {
        		map.put(key, 1l);
        	} else {
        		long v=map.get(key);
        		map.put(key, v+1);
        	}
        	String s= String.format("%06d", key) +String.format("%06d", map.get(key));
        	maps.put(p, s);

        }
        
        for(Pair<Long, Long> p :l2) {
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