import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static class Walk implements Comparable<Walk>{
        int pos, time, limit, rest;
 
        public Walk(int pos, int time, int limit, int rest) {
            super();
            this.pos = pos;
            this.time = time;
            this.limit = limit;
            this.rest = rest;
        }
 
        @Override
        public int compareTo(Walk o) {
            return this.time - o.time;
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while (true) {
            final int N = sc.nextInt();
            final int M = sc.nextInt();
            final int L = sc.nextInt();
            final int K = sc.nextInt();
            final int A = sc.nextInt();
            final int H = sc.nextInt();
             
            if(N == 0 && M == 0 && L == 0 && K == 0 && A == 0 && H == 0){
                break;
            }
             
            System.gc();
            
            Set<Integer> cool = new HashSet<Integer>(L);
            ArrayList<Map<Integer, Integer>> a_list = new ArrayList<Map<Integer, Integer>>(N);
            for(int i = 0; i < N; i++){
                a_list.add(new HashMap<Integer, Integer>());
            }
             
            for(int i = 0; i < L; i++){
                cool.add(sc.nextInt());
            }
            cool.add(A);
            cool.add(H);
             
            for(int i = 0; i < K; i++){
                final int from = sc.nextInt();
                final int to = sc.nextInt();
                final int cost = sc.nextInt();
                 
                a_list.get(from).put(to, cost);
                a_list.get(to).put(from, cost);
            }
             
            boolean[][][] is_visited = new boolean[N][M + 1][M + 1];
             
            PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
            queue.add(new Walk(A, 0, M, 0));
             
            boolean flag = false;
            while(!queue.isEmpty()){
                Walk walk = queue.poll();
                 
                //System.out.println(walk.pos + " " + walk.time + " " + walk.limit + " " + walk.rest);
               
                
                if(is_visited[walk.pos][walk.limit][walk.rest]){
                    continue;
                }else{
                    is_visited[walk.pos][walk.limit][walk.rest] = true;
                }
                 
                if(walk.pos == H){
                    System.out.println(walk.time);
                    flag = true;
                    break;
                }
                 
                for(Map.Entry<Integer, Integer> entry : a_list.get(walk.pos).entrySet()){
                	int rest = walk.rest;
                	
                	if(cool.contains(walk.pos)){
                    	rest = M - walk.limit;
                    }
                	
                    int limit = walk.limit - entry.getValue();
                    int use = 0;
                    if(limit < 0){
                    	if(limit + rest >= 0){
                    		use = -limit;
                    		rest += limit;
                    		limit = 0;
                    	}else{
                    		//System.out.println("out");
                    		continue;
                    	}
                    }
                    	
                    if(limit < 0){
                    	continue;
                    }else if(is_visited[entry.getKey()][limit][rest]){
                    	continue;
                    }else{
                    	queue.add(new Walk(entry.getKey(), walk.time + entry.getValue() + use, limit, rest));
                    }
                }
            }

            if(!flag){
                System.out.println("help!");
            }
        }
 
        sc.close();
    }
 
}