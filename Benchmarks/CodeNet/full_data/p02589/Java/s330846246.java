import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0L;
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        Arrays.sort(a, (x,y) -> y.length() - x.length());
        TreeMap<String, List<String>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = a[i];
            int len = s.length();
            String pre = s.substring(0, 1);
            String suf = 1 < len ? new StringBuilder(s.substring(1, len)).reverse().toString() : "";
            String key = map.ceilingKey(suf);
            while(key != null){
                if(!key.startsWith(suf)) break;
                for(String tgt : map.get(key)){
                    int idx = tgt.indexOf(pre);
                    if(-1 < idx && idx < tgt.length() - len +1){
                        ans++;
                    }
                }
                key = map.higherKey(key);
            }
            if(1 < len){
                if(!map.containsKey(suf)) map.put(suf, new ArrayList<String>());
                map.get(suf).add(s);
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
