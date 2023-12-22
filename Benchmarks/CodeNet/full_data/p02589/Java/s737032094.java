import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0L;
        int n = sc.nextInt();
        PriorityQueue<String> q = new PriorityQueue<>((x,y) -> x.length()-y.length());
        for (int i = 0; i < n; i++) {
            q.add(sc.next());
        }
        Map<String, boolean[]> sufMap = new HashMap<>();
        while(!q.isEmpty()){
            String s = q.poll();
            int len = s.length();
            for (int i = 0; i < len-1; i++) {
                String suf = 0 < i ? s.substring(len-i) : "";
                if(sufMap.containsKey(suf)){
                    String res = s.substring(0, len-suf.length());
                    boolean[] b = sufMap.get(suf);
                    for (int j = 0; j < 26; j++) {
                        if(b[j] && res.contains(String.valueOf((char)('a' + j)))){
                            ans++;
                        }
                    }
                }
            }
            String suf = 1 < len ? s.substring(1) : "";
            char pre = s.charAt(0);
            if(!sufMap.containsKey(suf)) sufMap.put(suf, new boolean[26]);
            sufMap.get(suf)[pre - 'a'] = true;
        }
        System.out.println(ans);
        sc.close();
    }

}
