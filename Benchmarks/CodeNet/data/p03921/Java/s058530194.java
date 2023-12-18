
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
         Map<Integer,List<Integer>> map2=new HashMap<Integer,List<Integer>>();
         boolean[] f=new boolean[N];
         for (int i=1; i<=N;i++) {
        	 int k=gi();
        	 List<Integer> ls=new ArrayList<Integer>();
        	 for (int j=0; j<k;j++) {
        		 int l=gi();
        		 if(map.containsKey(l)) {
        			 List<Integer> li=map.get(l);
        			 li.add(i);
        		 } else {
        			 List<Integer> li=new ArrayList<Integer>();
        			 li.add(i);
        			 map.put(l, li);
        		 }
        		 ls.add(l);
        	 }
        	 map2.put(i,ls);
         }

         Queue<Integer> q=new ArrayBlockingQueue<Integer>(N);
         q.add(1);
         f[0]=true;
         while(!q.isEmpty()) {
        	 int v=q.poll();
        	 List<Integer> lv =map2.get(v);
        	 for (int i=0; i<lv.size();i++) {
        		 List<Integer> nv=map.get(lv.get(i));
        		 for(int j=0; j<nv.size();j++) {
        			 int n=nv.get(j);
        			 if(f[n-1]==false) {
        				 q.add(n);
        				 f[n-1]=true;
        			 }
        		 }
        	 }
         }
         boolean ff=true;
         for (int i=0; i<N;i++) {
        	 if(f[i]==false) {
        		 ff=false;
        	 }
         }

         if(ff) {
             System.out.println("YES");
         }else {
        	 System.out.println("NO");
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