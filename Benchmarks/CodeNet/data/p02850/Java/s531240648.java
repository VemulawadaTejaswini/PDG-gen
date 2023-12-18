
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     static Map<Integer,List<Integer>> map;
     static int[][] col;
     static int[] par;
     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         map= new HashMap<Integer,List<Integer>>();
         col=new int[N+1][N+1];
         par =new int[N+1];
         int[] as =new int[N];
         int[] bs =new int[N];
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
         f(1);

         StringBuilder sb=new StringBuilder();
         int max=0;
         for (int i=0; i<N-1; i++) {
        	 int c=col[as[i]][bs[i]];
        	 max=Math.max(max, c);
        	 sb.append(c);
        	 sb.append(System.lineSeparator());
         }

         System.out.println(max);
         System.out.println(sb);
     }

     public static void f(int r) {
    	 List<Integer> b=map.get(r);
    	 if(b==null) return;
         int tmp=1;
         for (int i=0; i<b.size(); i++) {
        	 int v=b.get(i);
        	 if(col[par[r]][r]==tmp)tmp++;
        	 col[r][v]=tmp;
        	 tmp++;
         }
         for (int i=0; i<b.size(); i++) {
        	 int v=b.get(i);
        	 f(v);
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