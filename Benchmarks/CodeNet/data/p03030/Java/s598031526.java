import java.util.*;

public class Main {

    static class Pair implements Comparable<Pair>{
        int count=0;
        int val=0;
        Pair(int x , int y){
            this.count = x;
            this.val = y;
        }
        @Override
        public int compareTo(Pair o) {
            return  o.count - this.count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        TreeMap<String, PriorityQueue<Pair>> tm = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String c = sc.next();
            Integer p = sc.nextInt();
            if(!tm.containsKey(c)){
                PriorityQueue<Pair> pq = new PriorityQueue<>();
                pq.add(new Pair(p,i));
                tm.put(c,pq);
            }else{
                PriorityQueue<Pair> pq = tm.get(c);
                pq.add(new Pair(p,i));
            }
        }

        for(Map.Entry<String, PriorityQueue<Pair>> e: tm.entrySet()){
            PriorityQueue<Pair> pq = e.getValue();
            while(!pq.isEmpty()){
                Pair pair = pq.poll();
//                System.out.println(e.getKey() +" "+ (pair.count)+" "+  (pair.val+1));
                System.out.println( (pair.val+1));
            }
        }
    }
}
