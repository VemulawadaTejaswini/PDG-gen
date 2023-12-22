import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Map<Integer, ABC166EAgent>> map = new HashMap<>();
        ABC166EAgent[] agents = new ABC166EAgent[n+1];
        for(int i=1; i<=n; i++) {
            ABC166EAgent a = new ABC166EAgent();
            a.num = i;
            a.height = in.nextInt();
            int key = a.num - a.height;
            if(map.containsKey(key)) {
                Map<Integer, ABC166EAgent> innerMap = map.get(key);
                innerMap.put(a.num, a);
            }
            else {
                Map<Integer, ABC166EAgent> innerMap = new HashMap<>();
                innerMap.put(a.num, a);
                map.put(key, innerMap);
            }
            agents[i] = a;
        }
        
        long ans = 0;
        for(int i=1; i<=n; i++) {
            ABC166EAgent a = agents[i];
            int myKey = a.num - a.height;
            map.get(myKey).remove(a.num);
            
            int searchKey = a.num + a.height;
            Map<Integer, ABC166EAgent> innerMap = map.get(searchKey);
            if(innerMap != null) {
                ans += innerMap.size();
            }
        }
        System.out.println(ans);
    }
}
class ABC166EAgent {
    int num;
    int height;
}
