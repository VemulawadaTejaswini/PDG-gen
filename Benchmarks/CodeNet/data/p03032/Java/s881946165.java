
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int K=gi();
         long[] v=new long[N];

         for(int i=0; i<N;i++) {
        	 v[i]=gl();
         }

         long max=0;

         for(int i=0; i<=Math.min(N, K);i++) {
        	 for (int j=0; j<=i;j++) {
        		 long tmp=0;
        	     List<Long> ml=new ArrayList<Long>();
        	     for(int k=0; k<j;k++) {
        	    	 if(v[k]>=0) {
        	    		 tmp+=v[k];
        	    	 } else {
        	    		 ml.add(v[k]);
        	    	 }
        	     }

        	     for(int k=0; k<i-j;k++) {
        	    	 if(v[N-1-k]>=0) {
        	    		 tmp+=v[N-1-k];
        	    	 } else {
        	    		 ml.add(v[N-1-k]);
        	    	 }
        	     }
        	     Collections.sort(ml);
        	     for(int k=K-i; k<ml.size();k++) {
        	    	 tmp+=ml.get(k);
        	     }
        	     max=Math.max(max, tmp);
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