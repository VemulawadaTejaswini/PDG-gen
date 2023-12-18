import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = Character.getNumericValue(s[n-i]);
        }
        int[] s1 = new int[n+1];
        int[] s2 = new int[n+1];
        int r = 10;
        s1[1] = a[1];
        s2[1] = a[1] % 3;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(s1[1]*10 + s2[1], 1);
        for (int i = 2; i <= n; i++) {
            s1[i] = (s1[i-1] + a[i]*r) % 673;
            s2[i] = (s2[i-1] + a[i]) % 3;
            int t = s1[i] * 10 + s2[i];
            if(!map.containsKey(t)) map.put(t, 0);
            map.put(t, map.get(t) + 1);
            r = r*10%673;
        }
        long ans = 0;
        if(map.containsKey(0)){
            ans += map.get(0);
            map.remove(0);
        }
        for(Integer k : map.keySet()){
            int c = map.get(k);
            if(1 < 2){
                ans += c * (c-1) / 2;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
