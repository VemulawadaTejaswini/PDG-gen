import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class adj_list implements Comparable<adj_list>{
    public int u,k,d;
    public int[] v;
    public boolean find_flg = false;
    public int compareTo (adj_list a){return this.u - a.u;}
}

public class Main {

    private static ArrayList<adj_list>  ar = new ArrayList<adj_list>();

    private static final int U          =  0,
                             K          =  1,
                             UNREARCHED = -1,
                             START      =  1,
                             S          =  0;

    public static void main(String[] args) {

        //input
         Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
         int      N = sc.nextInt();

         adj_list a;String[] s;
         for(int i = 0;i < N;i++){
             s = sc.next().split("\\s");
             a = new adj_list();
             a.u = Integer.parseInt(s[U]);
             a.k = Integer.parseInt(s[K]);
             a.v = new int[a.k];
             for(int j=0;j<a.k;j++){a.v[j] = Integer.parseInt(s[j+2]);}
             a.d = UNREARCHED;
             ar.add(a);
         }
         Collections.sort(ar);

         //calculation
       	 BFS();

         //output
         for (adj_list d:ar) {System.out.println(d.u + " " + d.d);}
    }

    private static void BFS(){
    	ArrayDeque<adj_list> q = new ArrayDeque<adj_list>();
    	adj_list s = get_list(START);
    	s.d = S;
    	s.find_flg = true;
    	q.add(s);

    	while(!q.isEmpty()){
    		adj_list u = q.poll();

    		for(int v:u.v){
    			adj_list a = get_list(v);
    			if(a.find_flg){continue;}
    			a.d = u.d+1;
    			a.find_flg = true;
    			q.add(a);
    		}
    	}
    }

    private static adj_list get_list(int id){
        adj_list ret = null;
        for(adj_list a:ar){if(a.u == id){ret = a;}}
        return ret;
    }
}