
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     static Map<Integer,List<Integer>> map;
     static int[] col;
     static int[] par;
     static int N;
     static int[] as;
     static int[] bs;
     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         N=gi();
         map= new HashMap<Integer,List<Integer>>();
         col=new int[N-1];
         par =new int[N+1];
         as =new int[N];
         bs =new int[N];
         for (int i=0; i<N-1;i++) {
        	 as[i]=gi();
        	 bs[i]=gi();
        	 par[bs[i]]=as[i];
        	 if(map.containsKey(as[i])) {
        		 map.get(as[i]).add(bs[i]);
        	 } else {
        		 List<Integer> l=new ArrayList<Integer>();
        		 l.add(bs[i]);
        		 map.put(as[i], l);
        	 }
         }
         f(1, 0);

         StringBuilder sb=new StringBuilder();
         int max=0;
         for (int i=0; i<N-1; i++) {
        	 int c=col[i];
        	 max=Math.max(max, c);
        	 sb.append(c);
        	 sb.append(System.lineSeparator());
         }

         System.out.println(max);
         System.out.println(sb);
     }

     public static void f(int r, int bi) {
    	 List<Integer> b=map.get(r);
    	 if(b==null) return;
    	 int li=-1;
    	 int ri=N-1;
    	 while(ri-li>1) {
    		 int ind=(li+ri)/2;
    		 if(as[ind]>=r) {
    			 ri=ind;
    		 } else {
    			 li=ind;
    		 }
    	 }
         int tmp=1;
         for (int i=0; i<b.size(); i++) {
        	 int v=b.get(i);
        	 if(col[bi]==tmp)tmp++;
        	 col[ri+i]=tmp;
        	 tmp++;
         }
         for (int i=0; i<b.size(); i++) {
        	 int v=b.get(i);
        	 f(v, ri+i);
         }
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