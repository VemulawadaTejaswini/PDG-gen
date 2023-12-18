import java.util.*;

public class Main {
    static List<Map<Integer, Cost>> mp = new ArrayList<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long S = sc.nextLong();
        long[] exch = new long[N];
        long[] exchTime = new long[N];
        for(int i=0;i<N;i++){
            mp.add(new HashMap<>());
        }
        for(int i=0;i<M;i++){
            int U=sc.nextInt()-1;
            int V=sc.nextInt()-1;
            long A=sc.nextLong();
            long B=sc.nextLong();
            mp.get(U).put(V, new Cost(A, B));
            mp.get(V).put(U, new Cost(A, B));
        }
        for(int i=0;i<N;i++){
            exch[i] = sc.nextLong();
            exchTime[i] = sc.nextLong();
        }

        PriorityQueue<State> pq = new PriorityQueue<>(new Comparator<State>() {
            @Override
            public int compare(State o1, State o2) {
                if(o1.time == o2.time){
                    if(o2.silver > o1.silver){
                        return 1;
                    }else if(o2.silver == o1.silver) {
                        return 0;
                    }else{
                        return -1;
                    }
                }else{
                    if(o1.time > o2.time){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        long[] minTime = new long[N];
        long[] rich = new long[N];
        Arrays.fill(minTime, Long.MAX_VALUE);
        Set<Integer> visited = new HashSet<>();
        pq.add(new State(S, 0, 0));
        while(!pq.isEmpty() && visited.size() != N){
            State now = pq.poll();
            int nowpos = now.now;
            long nows = now.silver;
            long nowtime = now.time;
            if(visited.contains(nowpos) && rich[nowpos] > nows){
                continue;
            }
            visited.add(nowpos);
            rich[nowpos] = nows;
            minTime[nowpos] = Math.min(minTime[nowpos], nowtime);
            if(nows + exch[nowpos] <= 2505) {
                pq.add(new State(nows + exch[nowpos], nowtime + exchTime[nowpos], nowpos));
            }

            Map<Integer, Cost> neighbors = mp.get(nowpos);
            for(Integer nei:neighbors.keySet()){
                long money = neighbors.get(nei).money;
                long time = neighbors.get(nei).time;
                if(nows >= money) {
                    pq.add(new State(nows - money,
                            nowtime + time,
                            nei));
                }else{
                    long cnt = (money-nows) % exch[nowpos] == 0 ? ((money-nows) / exch[nowpos]) : ((money-nows)/exch[nowpos]+1);
                    pq.add(new State(nows - money + cnt * exch[nowpos], nowtime + time + cnt * exchTime[nowpos], nei));
                }
            }
        }
        for(int i=1;i<N;i++){
            System.out.println(minTime[i]);
        }
    }

    private static class State{
        long silver;
        long time;
        int now;
        State(long s, long t, int n){
            silver = s;
            time = t;
            now = n;
        }
        @Override
        public String toString(){
            return now + " sil:" + silver + " time:" + time;
        }
    }

    private static class Cost{
        long money;
        long time;
        Cost(long a, long b){
            money = a;
            time = b;
        }
        @Override
        public String toString(){
            return "sil:" + money + " time:" + time;
        }
    }
}
