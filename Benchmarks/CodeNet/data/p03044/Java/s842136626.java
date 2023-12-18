import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug == false) {
            return;
        }
        System.out.println(str);
    }

    public static class Edge {
        int u;
        int v;
        int w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;

        }
    }

    public static void main(String[] args) {

        int N;
        HashMap<Integer,List<Edge>> set;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            set = new HashMap<>();
            for (int i = 0; i < N - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                Edge e = new Edge(u, v, w);
                setSet(set,e,u);
                setSet(set,e,v);
            }
        }
        int[] distans = new int[N];
        HashSet<Edge> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        queue.push(1);
        distans[0] = 0;
        Integer target;
        while((target = queue.pollFirst()) != null){
            List<Edge> list = set.get(target);
            for(Edge e : list){
                if(visited.contains(e)){
                    continue;
                }else{
                    if(e.u != target && e.v == target){
                        queue.addLast(e.u);
                        distans[e.u  -1] = distans[target-1] + e.w;
                        debug(e.u+":" + distans[e.u  -1] );
                    }else if(e.v != target && e.u == target){
                        queue.addLast(e.v);
                        distans[e.v  -1] = distans[target-1] + e.w;
                        debug(e.v+":"+distans[e.v  -1]);
                    }
                    visited.add(e);
                }
            }
        }
        for(int i : distans){
            System.out.println(i%2);
        }
    }

    private static void setSet(HashMap<Integer,List<Edge>> set,Edge e, int i){
        List<Edge> list = set.get(i);
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(e);
        set.put(i, list);
    }

}
