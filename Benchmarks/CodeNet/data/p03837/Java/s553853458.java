import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node[] nodes = new Node[n];
        HashMap<Integer,HashMap<Integer,Integer>> routes = new HashMap<>();
        boolean[] flags = new boolean[m];
        for(int i = 0;i < n;++i){
            nodes[i] = new Node(i);
            routes.put(i,new HashMap<>());
        }
        for(int i = 0;i < m;++i){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            nodes[a].add(b,c);
            nodes[b].add(a,c);
            routes.get(a).put(b,i);
            routes.get(b).put(a,i);
        }
        for(int i = 0;i < n;++i){
            for(int j = i + 1;j < n;++j){
                ArrayList<Integer> r = route(i,j,nodes);
                int last = j;
                for(int id:r){
                    if(last == id){
                        continue;
                    }
                    int k = routes.get(last).get(id);
                    flags[k] = true;
                    last = id;
                }
            }
        }
        int c = 0;
        for(boolean f:flags)c += f ? 0 : 1;
        System.out.println(c);
    }

    static ArrayList<Integer> route(int start,int end,Node[] nodes){
        int[] dp = new int[nodes.length];
        for(int i = 0;i < dp.length;++i){
            dp[i] = 1000000000;
        }
        dp[start] = 0;
        return update(dp,start,end,nodes);
    }

    static ArrayList<Integer> update(int[] dp,int p,int end,Node[] nodes){
        Node node = nodes[p];
        ArrayList<Integer> best = null;
        for(int id:node.connected){
            int i = dp[p] + node.costs.get(id);
            if(i < dp[id]){
                dp[id] = i;
                if(id == end){
                    best = new ArrayList<>();
                    best.add(end);
                }
                else{
                    ArrayList<Integer> ids = update(dp,id,end,nodes);
                    if(ids != null)best = ids;
                }
            }
        }
        if(best != null) {
            best.add(p);
        }
        return best;
    }


    static class Node{
        public int id;
        public Set<Integer> connected = new HashSet<>();
        public Map<Integer,Integer> costs = new HashMap<>();
        public Node(int id){
            this.id = id;
        }

        public void add(int id,int cost){
            connected.add(id);
            costs.put(id,cost);
        }
    }
}


