import java.util.*;

public class Main {

    static HashSet<Integer> q;
    static HashMap<Integer, ArrayDeque<Integer>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayDeque<Integer> deq = new ArrayDeque<>(n-1);
            for (int j = 0; j < n-1; j++) {
                deq.add(sc.nextInt()-1);
            }
            map.put(i, deq);
        }
        int ans = 0;
        q = new HashSet<>();
        for (int i = 0; i < n; i++) {
            check(i,q);
        }
        while(!q.isEmpty()){
            ans++;
            HashSet<Integer> nexq = new HashSet<>();
            for(int i : q){
                int a = i / 10000;
                int b = i % 10000;
                map.get(a).poll();
                map.get(b).poll();
            }
            for(int i : q){
                int a = i / 10000;
                int b = i % 10000;
                check(a, nexq);
                check(b, nexq);
            }
            q = nexq;
        }
        boolean able = true;
        for (int i = 0; i < n; i++) {
            if(0 < map.get(i).size()){
                able = false;
                break;
            }
        }
        System.out.println(able ? ans : -1);
        sc.close();

    }

    private static void check(int i , HashSet<Integer> set){
        if(map.get(i).isEmpty()) return;
        int x = map.get(i).peek();
        if(map.get(x).isEmpty() || map.get(x).peek() != i) return;
        int tmp = i * 10000 + x;
        if(x < i) tmp = x * 10000 + i;
        set.add(tmp);
    }

}
