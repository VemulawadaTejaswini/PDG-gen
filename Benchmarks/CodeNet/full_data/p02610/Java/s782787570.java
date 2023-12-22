import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            solve(sc);
        }
    }

    public static void solve(Scanner sc){
        int N = sc.nextInt();
        List<Place> v = new ArrayList<>();
        long base=0;
        for(int i=0;i<N;i++){
            int k,l,r;
            k = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            base += (long)(Math.min(l,r));
            v.add(new Place(k,l,r,N));
        }
        Map<Integer, PriorityQueue<Place>> lmp = new HashMap<>();
        Map<Integer, PriorityQueue<Place>> rmp = new HashMap<>();
        for(Place t:v){
            if(t.isLeft()){
                lmp.putIfAbsent(t.K, new PriorityQueue<>(Comparator.comparingLong(p->-p.gain)));
                lmp.get(t.K).add(t);
            }else if(t.isRight()){
                rmp.putIfAbsent(t.K, new PriorityQueue<>(Comparator.comparingLong(p->-p.gain)));
                rmp.get(t.K).add(t);
            }
        }
        base += getGain(N, lmp);
        base += getGain(N, rmp);
        System.out.println(base);
    }

    private static long getGain(int n, Map<Integer, PriorityQueue<Place>> lmp) {
        long gain=0;
        List<Place> ll=new ArrayList<>();
        for(int i = 1; i<= n; i++) {
            if (lmp.containsKey(i)) {
                PriorityQueue<Place> pq = lmp.get(i);
                while (ll.size() <= i && !pq.isEmpty()) {
                    gain += pq.peek().gain;
                    ll.add(pq.poll());
                }
            }
        }
        System.out.println(ll);
        return gain;
    }

    public static class Place{
        long gain;
        private int lr;
        int K;
        public Place(int k, int l, int r, int N){
            if(l-r > 0){
                gain = l-r;
                lr=-1;//left of K
                K=k;
            }else if(l-r < 0){
                gain = r-l;
                lr=1;//right of K
                K=N-k;
            }else{
                gain = 0;
                lr=0;
                K=k;
            }
        }
        public String toString(){
            return gain + " - " + K;
        }
        public boolean isLeft(){
            return lr == -1;
        }

        public boolean isRight() {
            return lr == 1;
        }
    }
}
