
import java.util.AbstractMap;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    int D=gi();
	    Pair<Integer, Integer>[] A=new Pair[H*W+1];
	    for(int i=0;i<H;i++) {
	    	for(int j=0;j<W;j++) {
	    	    int a=gi();
	    	    A[a]=new Pair<Integer, Integer>(i,j);
	    	}
	    }

	    int[][] d=new int[D][Math.floorDiv(H*W, D)+2];
	    for(int i=1;i<H*W-D+1;i++) {
	    	int i1=i%D;
	    	int i2=Math.floorDiv(i, D);
	    	d[i1][i2]=Math.abs(A[i+D].getKey()-A[i].getKey()) + Math.abs(A[i+D].getValue()-A[i].getValue());
	    	if(i2>0) d[i1][i2]+=d[i1][i2-1];
	    }
	    int Q=gi();
	    for(int i=0; i<Q;i++) {
	    	int l=gi();
	    	int r=gi();
	    	int l1=l%D;
	    	int l2=(l-l1)/D-1;
	    	int r1=r%D;
	    	int r2=(r-r1)/D-1;
	    	if (l2>=0 && r2>=0) {
	    	    System.out.println(d[r1][r2]-d[l1][l2]);
	    	} else if(r2>=0) {
	    		System.out.println(d[r1][r2]);
	    	} else {
	    		System.out.println(0);
	    	}
	    }

	    //System.out.println(-1);
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