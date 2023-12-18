

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int N;
    static int M;
    static int[] A;
    static int[] B;

	static boolean[] used;
	static long max=0;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    N=gi();
	    M=gi();
	    A=new int[M];
	    B=new int[M];
	    Map<Integer,Integer> map=new HashMap<Integer,Integer>();

	    for(int i=0;i<M;i++) {
	        A[i]=gi();
	        B[i]=gi();
	        if(map.containsKey(A[i])) {
	        	if(map.get(A[i])>B[i]) {
	        		map.put(A[i], B[i]);
	        	}
	        } else {
        		map.put(A[i], B[i]);
        	}
	    }

	    Pair<Integer,Integer>[] ps=new Pair[map.size()];
	    int ind=0;
	    for(Map.Entry<Integer, Integer> e :map.entrySet()) {
	    	ps[ind]=new Pair<Integer,Integer>(e.getKey(), e.getValue());
	    	ind++;
	    }
	    Arrays.parallelSort(ps);

	    int ans=0;
	    int nb=Integer.MAX_VALUE;
	    Pair<Integer,Integer> np=ps[0];
	    int npi=0;
	    for (int i=1;i<=N;i++) {
	    	if(nb==i) {
            	ans++;
            	nb=Integer.MAX_VALUE;
            }
	    	if(np.getKey()==i) {
            	nb=Math.min(nb, np.getValue());
            	npi++;
            	if(npi<ps.length) {
            	    np=ps[npi];
            	}
            }
	    }


	    System.out.println(ans);
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