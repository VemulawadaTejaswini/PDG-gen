import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main{
    static long fix = 998244353;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long ans = 1;

//        long fix = 998244353;

        int n = sc.nextInt();

        int[] d = new int[n];

        for (int i=0; i<n; i++) d[i] = sc.nextInt();

//        Arrays.sort(d);

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
        int cnt = 0;
        for (int i=0; i<n; i++){
            if (d[i]==0)cnt++;
        }
        if (cnt!=1){
            System.out.println(0);
            return;
        }
//        System.out.println(map);

        List<Integer> l = new ArrayList<>();

        for (Integer val: map.values()){
            l.add(val);
        }

        int tmp = -1;
        for (Integer val: map.keySet()){
            if (val!=tmp+1){
                System.out.println(0);
                return;
            }else {
                tmp++;
            }
        }


        for (int i=1; i<l.size()-1; i++){
            ans *= (((power((long)l.get(i), (long)l.get(i+1)))%fix));
            ans %= fix;
            if (ans<0) ans += fix;
        }
        System.out.println(ans);
//        System.out.println(power(10, 9));
//        System.out.println(power(10000, 10000));
    }

    public static long power(long x, long n){
        long sum = 1;
        while (n>0){
            if ((n&1)==1){
                sum *= x;
                sum %= fix;
            }
            x *= x;
            x %= fix;
            if (sum < 0) sum += fix;
            if (x < 0) x += fix;
            n>>=1;
        }
//        return sum;
        return sum%fix;
    }

}