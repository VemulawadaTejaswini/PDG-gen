import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long ans = 1;

        long fix = 998244353;

        int n = sc.nextInt();

        int[] d = new int[n];

        for (int i=0; i<n; i++) d[i] = sc.nextInt();

        Arrays.sort(d);

        if (d[0]!=0){
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            if(map.containsKey(d[i])){
                int v = map.get(d[i]);
                v++;
                map.put(d[i], v);
            }else {
                map.put(d[i], 1);
            }
        }

//        System.out.println(map);

        List<Integer> l = new ArrayList<>();

        for (Integer val: map.values()){
            l.add(val);
        }

        for (int i=1; i<l.size()-1; i++){
            ans *= ((long)(Math.pow(l.get(i), l.get(i+1))%fix));
        }
        System.out.println(ans);

    }
}