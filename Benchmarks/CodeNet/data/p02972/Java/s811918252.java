

import java.util.AbstractMap;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N+1];
         int[] b=new int[N+1];

         for(int i=1; i<=N;i++) {
        	 a[i]=gi();
         }


         for (int i=N; i>0; i--) {
        	 int t=0;
        	 for(int j=2*i; j<N;j++) {
        		 t+=b[j];
        	 }
        	 if(t%2==a[i]) {
        		 b[i]=0;
        	 } else {
        		 b[i]=1;
        	 }
         }
         int m=0;
         StringBuilder sb=new StringBuilder();
         for(int i=1; i<=N;i++) {
        	 if(b[i]==1) {
        		 if(m!=0)sb.append(" ");
        		 m++;
        		 sb.append(i);
        	 }
         }

         System.out.println(m);
         System.out.println(sb);
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