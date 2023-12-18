
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = 0;
        HashMap<Long,Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            long x = sc.nextLong();
            long l= sc.nextLong();
            if(map.containsKey(x+l)&&l==0)ans++;
            if(map.containsKey(x+l)){
                map.put(x+l,Math.max(x-l,map.get(x+l)));
            }
            map.put(x+l,x-l);
        }

        Set<Long> key =map.keySet();
        List<Long> list = new ArrayList<>(key);
        list.sort(Long::compareTo);


        long now = Long.MIN_VALUE;
        for(Long i : list){
            // System.out.println(i+" "+map.get(i));
            if(map.get(i)>=now){
                ans++;
                now = i;
            }

        }

       System.out.println(ans);

    }
}
