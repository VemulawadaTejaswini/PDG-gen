
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         long[] a=new long[N];
         Pair<Long, Long>[] ps=new Pair[M];

         for(int i=0; i<N;i++) {
        	 a[i]=gl();
         }

         for(int i=0; i<M;i++) {
        	 long b=gl();
        	 long c=gl();
        	 Pair<Long,Long> p=new Pair<Long,Long>(c,b);
        	 ps[i]=p;
         }

         Arrays.parallelSort(a);
         Arrays.parallelSort(ps, Collections.reverseOrder());

         int ind=0;
         long max=0;
         for(int i=0; i<M;i++) {
        	 Pair<Long,Long> p=ps[i];
        	 long b=p.getValue();
    		 long c=p.getKey();
        	 for(int j=0; j<b;j++) {
        		 if(ind>=a.length) break;
        		 if(a[ind]<=c) {
        			 ind++;
        			 max+=c;
        		 } else {
        			 break;
        		 }
        	 }
         }

         for(int i=ind; i<a.length;i++) {
        	 max+=a[i];
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