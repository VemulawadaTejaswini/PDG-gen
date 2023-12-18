import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, ArrayDeque<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayDeque<Integer> deq = new ArrayDeque<>(n-1);
            for (int j = 0; j < n-1; j++) {
                deq.add(sc.nextInt()-1);
            }
            map.put(i, deq);
        }
        int ans = 0;
        boolean able = true;
        while(able){
            able = false;
            ans++;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if(map.get(i).isEmpty()) continue;
                Integer x = map.get(i).peek();
                if(x < i){
                    int t = x * 10000 + i;
                    if(set.contains(t)){
                        map.get(i).poll();
                        map.get(x).poll();
                        able = true;
                    }
                }else{
                    set.add(i * 10000 + map.get(i).peek());
                }
            }
        }
        if(!able){
            boolean tmp = true;
            for (int i = 0; i < n; i++) {
                if(0 < map.get(i).size()){
                    tmp = false;
                    break;
                }
            }
            if(tmp) able = true;
        }
        System.out.println(able ? ans-1 : -1);
        sc.close();

    }

}
