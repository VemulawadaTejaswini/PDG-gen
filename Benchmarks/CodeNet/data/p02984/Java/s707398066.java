

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         long[] x=new long[N];
         
         for(int i=0; i<N;i++) {
        	 a[i]=gl();
         }
         
         x[0]=0;
         for (int i=0; i<N; i++) {
        	 if(i%2==0) {
        		 x[0]+=a[i];
        	 } else {
        		 x[0]-=a[i];
        	 }
         }
         for(int i=1; i<N;i++) {
        	 x[i]=2*a[i-1] - x[i-1];
         }
         
         for (int i=0; i<N; i++) {
        	 if(i!=0)System.out.print(" ");
        	 System.out.print(x[i]);
         }

         //System.out.print("Yes");
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