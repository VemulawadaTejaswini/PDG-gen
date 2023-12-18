import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Set<ABC166EAgent>> map = new HashMap<>();
        ABC166EAgent[] agents = new ABC166EAgent[n+1];
        for(int i=1; i<=n; i++) {
            ABC166EAgent a = new ABC166EAgent();
            a.num = i;
            a.height = in.nextInt();
            int key = a.num - a.height;
            if(map.containsKey(key)) {
                Set<ABC166EAgent> set = map.get(key);
                set.add(a);
            }
            else {
                Set<ABC166EAgent> set = new HashSet<>();
                set.add(a);
                map.put(key, set);
            }
            agents[i] = a;
        }
        
        long ans = 0;
        for(int i=1; i<=n; i++) {
            ABC166EAgent a = agents[i];
            int key = a.num + a.height;
            Set<ABC166EAgent> set = map.get(key);
            if(set != null) {
                Iterator<ABC166EAgent> it = set.iterator();
                while(it.hasNext()) {
                    ABC166EAgent opponent = it.next();
                    if(opponent.num > a.num) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
class ABC166EAgent {
    int num;
    int height;
}
