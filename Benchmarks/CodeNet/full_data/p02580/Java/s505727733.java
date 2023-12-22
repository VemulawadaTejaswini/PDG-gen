
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         int M=gi();
         int[] h=new int[M];
         int[] w=new int[M];

         long[] ch=new long[H+1];
         long[] cw=new long[W+1];
         Map<Integer, Map<Integer, Boolean>> G=new HashMap<Integer, Map<Integer,Boolean>>();
         for (int i=0; i<M;i++) {
        	 h[i]=gi();
        	 w[i]=gi();
        	 if(G.containsKey(h[i])) {
        		 Map m=G.get(h[i]);
        		 m.put(w[i], true);
        	 } else {
        	     Map m=new HashMap<Integer, Boolean>();
        	     m.put(w[i], true);
        	     G.put(h[i], m);
        	 }
        	 ch[h[i]]++;
        	 cw[w[i]]++;
         }

         long mh=0;
         long mw=0;
         for (int i=1; i<H+1; i++) {
        	 mh=Math.max(mh, ch[i]);
         }
         for (int i=1; i<W+1; i++) {
        	 mw=Math.max(mw, cw[i]);
         }
         List<Integer> lih=new ArrayList<Integer>();
         for (int i=1; i<H+1; i++) {
        	 if(ch[i]==mh) {
        		 lih.add(i);
        	 }
         }
         List<Integer> liw=new ArrayList<Integer>();
         for (int i=1; i<W+1; i++) {
        	 if(cw[i]==mw) {
        		 liw.add(i);
        	 }
         }

         boolean f=false;
         for (int i=0; i<lih.size();i++) {
        	 for (int j=0; j<liw.size();j++) {
            	 int hi=lih.get(i);
            	 int wi=liw.get(j);
            	 if(G.containsKey(hi) && G.get(hi).containsKey(wi)) {
            		 //nop
            	 } else {
            		 f=true;
            		 break;
            	 }
             }
         }

         if(f) {
        	 System.out.println(mh+mw);
         } else {
        	 System.out.println(mh+mw-1);
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