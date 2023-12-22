import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Map<Integer,Integer>> L = new HashMap<>();
        Map<Integer,Integer> OPT = new HashMap<>();
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            int k = sc.nextInt();
            OPT.put(v,999999999);
            Map<Integer,Integer> C = new HashMap<>();
            for(int j=0;j<k;j++){
                int u = sc.nextInt();
                int c = sc.nextInt();
                C.put(u,c);
            }
            L.put(v,C);
        }
        OPT.replace(0,0);
        Dijkstra(L,OPT);
        for(int i:OPT.keySet()) System.out.println(i+" "+OPT.get(i));
    }
    public static void Dijkstra(Map<Integer,Map<Integer,Integer>> L,Map<Integer,Integer> OPT){
        Deque<Integer> Q = new ArrayDeque<>();
        Q.add(0);
        while(Q.size()!=0){
            int now = Q.poll();
            for(int i:L.get(now).keySet()){
                if(OPT.get(now)+L.get(now).get(i)<OPT.get(i)) {
                    Q.add(i);
                    OPT.replace(i,L.get(now).get(i)+OPT.get(now));
                }
            }
        }
    }
}
