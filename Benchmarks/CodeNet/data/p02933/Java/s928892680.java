import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/*
6 2
1 2
1 3
2 4
3 6
2 5
1 10
1 10

20 20 20 20 20 20
 */

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();

        Map<Integer, LinkedList<Integer>> vertexMap = new HashMap<>();

        Map<Integer,Integer> countMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            countMap.put(i,0);
        }

        for (int i = 0; i < n-1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            vertexMap.putIfAbsent(a, new LinkedList<>());
            vertexMap.putIfAbsent(b, new LinkedList<>());
            vertexMap.get(a).add(b);
        }

        for (int i = 0; i < q; i++) {
            int r = scan.nextInt();
            int v = scan.nextInt();
            countMap.put(r,countMap.getOrDefault(r,0)+v);
            addValue(r,v,countMap,vertexMap,r);
        }

        countMap.values().forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    private static void addValue(int r, int v, Map<Integer, Integer> countMap, Map<Integer, LinkedList<Integer>> vertexMap,int p) {
        LinkedList<Integer> rss = vertexMap.getOrDefault(r,new LinkedList<>());
        for (int i = 0; i < rss.size(); i++) {
            if(rss.get(i) != r){
                countMap.put(rss.get(i),countMap.getOrDefault(rss.get(i),0)+v);
                addValue(rss.get(i),v,countMap,vertexMap,p);
            }
        }
    }
}