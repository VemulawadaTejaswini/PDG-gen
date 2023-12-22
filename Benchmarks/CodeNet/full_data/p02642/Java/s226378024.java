import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> noMap = new TreeMap<>();
        for (int i=1;i<=n;i++) {
            int x = sc.nextInt();
            if (noMap.containsKey(x)) {
                noMap.put(x,0);
            } else {
                int skip=0;
                Set<Integer> rSet = new HashSet<>();
                for (int key : noMap.keySet()) {
                    if (x%key==0) {
                        skip=1;
                        break;
                    } else if (key%x==0){
                        rSet.add(key);
                    }
                }
                if (skip==0) {
                    noMap.put(x, 1);
                    for(int value : rSet){
                        noMap.remove(value);
                    }
                }
            }
        }

        int ans=0;
        for (int key : noMap.keySet()) {
            if (noMap.get(key)==1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
