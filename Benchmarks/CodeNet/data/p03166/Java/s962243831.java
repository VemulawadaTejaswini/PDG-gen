import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        int[] d = new int[n+1];
        Arrays.fill(d,0);
        d[1] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a->d[a]));
        for(int i = 1 ; i<=n ;++i){
            pq.add(i);
        }
        for(int i = 0 ; i < m ;++i){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(graph.containsKey(x)){
                graph.get(x).add(y);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(y);
                graph.put(x,list);
            }
        }
        int res = 0;
        while (!pq.isEmpty()){
            int node = pq.poll();
            ArrayList<Integer> neighbours = graph.getOrDefault(node,new ArrayList<>());
            for(int neighbour:neighbours){
                if(d[node]-1<d[neighbour]){
                    //is pq updated automatically??
                    d[neighbour] = d[node]-1;
                    pq.remove(neighbour);
                    pq.add(neighbour);
                    res = Math.min(res,d[neighbour]);
                }
            }
        }
        System.out.println(-res);
    }
}
