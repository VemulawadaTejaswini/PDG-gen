//package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;



public class Main {
    HashMap<Integer, HashMap<Integer,Integer>> graph;
    int size ;
    int edges;
    int[] h ;
    boolean[] peaks;

    public Main( int size, int edges) {
        this.h = new int[size+1];
        this.size = size;
        this.edges = edges;
        this.graph = new HashMap<>();
        this.peaks = new boolean[size+1];
        Arrays.fill(peaks,true);
    }

    public void addEdge(int a,int b){
        if(graph.get(a)==null)graph.put(a,new HashMap<>());
        if(graph.get(b)==null)graph.put(b,new HashMap<>());
        HashMap<Integer,Integer> gg = graph.get(a);
        HashMap<Integer,Integer> gh = graph.get(b);
        if(gg.get(b)==null){
            gg.put(b,1);
        }
        else{
            int count = gg.get(b);
            gg.put(b,++count);
        }
        if(gh.get(a)==null){
            gh.put(a,1);
        }
        else{
            int count = gh.get(a);
            gh.put(a,++count);
        }

    }

    @Override
    public String toString() {
        return "ABC166C{" +
                "graph=" + graph +
                ", size=" + size +
                ", edges=" + edges +
                ", h=" + Arrays.toString(h) +
                ", peaks=" + Arrays.toString(peaks) +
                '}';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int m = scan.nextInt();
        Main abc = new Main(n,m);
        for (int i = 1; i <=n; i++) {
            abc.h[i]=scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int xx = scan.nextInt();
            int yy = scan.nextInt();
            abc.addEdge(xx,yy);

        }

        for (int i = 1; i <= n; i++) {
            HashMap<Integer, Integer> integerPairHashMap = abc.graph.get(i);
            int finalI = i;
            if(integerPairHashMap!=null)
            integerPairHashMap.forEach((node, count) -> {
                if(abc.h[node]>abc.h[finalI] || count>1){

                        abc.peaks[finalI] = false;
                    }

            });
        }
        int count = 0;
//        System.out.println(Arrays.toString(abc.peaks)+" "+abc.graph);
        for (int i = 1; i <=n ; i++) {
            if(abc.peaks[i]==true){
                count++;
            }
        }
//        System.out.println(Arrays.toString(abc.peaks)+" "+abc.graph);
        System.out.println(count);

    }
}
