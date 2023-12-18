import java.util.*;

public class Main {
    private static Map<Integer, List<Integer>> mp = new HashMap<>();
    private static Map<Integer, Integer> aokiMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int u = sc.nextInt()-1;
        int v = sc.nextInt()-1;
        for(int i=0;i<N-1;i++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            mp.computeIfAbsent(A,(p)->new ArrayList<>() ).add(B);
            mp.computeIfAbsent(B,(p)->new ArrayList<>() ).add(A);
        }
        traverseAoki(v);
        System.out.println(dijkstraTaka(u));
    }

    private static int dijkstraTaka(int u){
        PriorityQueue<Taka> pq = new PriorityQueue<>(Comparator.comparingInt(a -> -aokiMap.get(a.now)));//Reverse order of larger to smaller
        Map<Integer, Integer> takaMap = new HashMap<>();
        int maxAoki=0;
        pq.add(new Taka(u,-1,0));
        while(!pq.isEmpty()){
            Taka top = pq.poll();
            Integer now = top.now;
            Integer from = top.from;
            Integer walk = top.walk;
            if(walk >= aokiMap.get(now)){
                maxAoki = Math.max(maxAoki, aokiMap.get(now));
                continue;
            }
            for(Integer nei: mp.get(now)){
                if(nei.equals(from)){
                    if(mp.get(now).size() != 1){
                        continue;
                    }
                }
                pq.add(new Taka(nei, now, walk+1));
            }
        }
        return maxAoki;
    }

    private static void traverseAoki(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        aokiMap.put(v,0);
        while(!q.isEmpty()){
            Integer now = q.poll();
            for(Integer nei:mp.get(now)){
                if(aokiMap.containsKey(nei)){continue;}//already traversed.
                aokiMap.put(nei, aokiMap.get(now)+1);
                q.add(nei);
            }
        }
    }

    private static class Taka{
        int now;
        int from;
        int walk;
        Taka(int n, int f, int w){
            now = n;
            from = f;
            walk = w;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj.getClass() == this.getClass()){
                Taka o = (Taka)obj;
                return o.from==from && o.now ==now && o.walk == walk;
            }
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return now * 200_000 + from + walk;
        }
    }
}
