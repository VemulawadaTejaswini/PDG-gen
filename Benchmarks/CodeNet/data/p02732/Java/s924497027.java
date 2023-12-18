
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N];

         for (int i=0; i<N;i++) {
        	 a[i]=gi();
         }

         //Arrays.parallelSort(a);

         Map<Integer,Long> map=new HashMap<Integer, Long>();
         for (int i=0; i<N;i++) {
             if(map.containsKey(a[i])) {
            	 map.put(a[i], map.get(a[i])+1);
             } else {
            	 map.put(a[i], 1l);
             }
         }

         long max=0;
         for(Long v :map.values()) {
             long t=v*(v-1)/2;
             max+=t;
         }

         StringBuilder sb=new StringBuilder();
         for (int i=0; i<N;i++) {
             long v=map.get(a[i]);
             if(v>1) {
            	 long t1=v*(v-1)/2;
            	 long t2=(v-1)*(v-2)/2;
            	 sb.append(max-t1+t2);
            	 sb.append(System.lineSeparator());
             } else {
            	 sb.append(max);
            	 sb.append(System.lineSeparator());
             }
         }

         System.out.println(sb);
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