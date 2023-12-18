import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> edge = new HashMap<>();
        for(int i = 0;i < m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            List<Integer> list = edge.containsKey(u) ? edge.get(u) : new ArrayList<>();
            list.add(v);
            edge.put(u, list);
        }
        int s = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, List<Integer>> edge3 = new HashMap<>();
        for(int i = 1;i <= n;i++){
            if(edge.containsKey(i)) {
                List<Integer> list = get3StepNodes (i, edge);
                edge3.put(i, list);
            }
        }

        int[] distance = new int[n+1];
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return distance[o1.intValue()] - distance[o2.intValue()];
            }
        });
        for(int i = 1;i <= n;i++){
            distance[i] = i == s ? 0 : Integer.MAX_VALUE;
            queue.add(i);
        }

        while(queue.size() != 0){
            int node = queue.poll();
            if(!edge3.containsKey(node)){
                continue;
            }
            for(int e : edge3.get(node)){
                if(node == e){
                    continue;
                }
                distance[e] = Math.min(distance[e], distance[node] + 1);
            }
        }
        if(distance[k] == Integer.MAX_VALUE){
            System.out.println("-1");
        } else {
            System.out.println(distance[k]);
        }
    }

    private static List<Integer> get3StepNodes(int s, Map<Integer, List<Integer>> edge){
        List<Integer> step1  = edge.get(s);
        List<Integer> step2  = new ArrayList<>();
        for(Integer s1 : step1){
            if(edge.containsKey(s1)) {
                step2.addAll(edge.get(s1));
            }
        }
        List<Integer> step3  = new ArrayList<>();
        for(Integer s2 : step2){
            if(edge.containsKey(s2)) {
                step3.addAll(edge.get(s2));
            }
        }
        return step3;
    }

}

