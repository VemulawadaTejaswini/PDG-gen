
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int[] X=new int[N];
        int[] Y=new int[N];
        Map<Pair, Integer>map=new HashMap<Pair, Integer>();

        for (int i=0; i<N; i++) {
            X[i]=gi();
            Y[i]=gi();
        }

        for (int i=0; i<N; i++) {
        	for (int j=i+1; j<N; j++) {
                Pair<Integer, Integer> p=new Pair<Integer, Integer>(X[i] - X[j], Y[i]-Y[j]);
                Pair<Integer, Integer> p2=new Pair<Integer, Integer>(X[j] - X[i], Y[j]-Y[i]);
                if(map.containsKey(p)) {
                	map.put(p, map.get(p)+1);
                } else {
                	map.put(p, 1);
                }
                if(map.containsKey(p2)) {
                	map.put(p2, map.get(p2)+1);
                } else {
                	map.put(p2, 1);
                }
            }
        }
        
        int max =0;
        for(Integer i: map.values()) {
        	if(i>max) {
        		max=i;
        	}
        }

        System.out.println(N-max);
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