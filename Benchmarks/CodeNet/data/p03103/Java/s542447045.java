import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        long ans  = 0;
        for(int i = 0;i < n;i++){
            int cost = sc.nextInt();
            int num = sc.nextInt();
            map.put(cost,num);
        }
        Object[] o = map.keySet().toArray();
        Arrays.sort(o);
        List<Integer> key = new ArrayList<>(map.keySet());
        List<Integer> val = new ArrayList<>(map.values());
        long count = 0;
        for(int i = 0;count < m;i++){
            count += (long)val.get(i);
            ans += (long)val.get(i) * (long)key.get(i);
            if(count > m){
                long over = count - m;
                ans -= (long)(key.get(i) * over);
                break;
            }
        }
        System.out.println(ans);
    }
}