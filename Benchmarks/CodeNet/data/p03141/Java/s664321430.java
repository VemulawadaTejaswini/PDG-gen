
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
        boolean[] f=new boolean[N];
        int[] A=new int[N];
        int[] B=new int[N];
        List<Pair<Integer, Integer>> tl=new ArrayList<Pair<Integer, Integer>>();

        long ans=0;
        for (int i=0; i<N;i++) {
            int a=gi();
            int b=gi();
            A[i]=a;
            B[i]=b;
            tl.add(new Pair<Integer, Integer>(a+b, i));
        }
        Collections.sort(tl, Collections.reverseOrder());

        long tv=0;
        long av=0;
        boolean tf=true;
        for (int i=0; i<N;i++) {
            if(tf) {
                tv+=A[tl.get(i).getValue()];
            	tf=false;
            } else {
            	av+=B[tl.get(i).getValue()];
            	tf=true;
            }
        }


        ans=tv-av;
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