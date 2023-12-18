import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String[] s = new String[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                s[i] = sc.next();
        }
        solve(N, s);
    }

    static void solve(long N, String[] s){
        HashMap<String, Long> hm = new HashMap<>();
        for (String si : s) {
            char[] ca = si.toCharArray();
            Arrays.sort(ca);
            Long val = hm.get(new String(ca));
            if(val == null) {
                val = (long)1;
            } else {
                val++;
            }
            val = hm.put(new String(ca), val);
        }

        long ans = 0;
        for (Map.Entry<String, Long> entry: hm.entrySet()) {
            long v = entry.getValue();
            ans += v * (v-1) / 2;
        }
        System.out.println(ans);

        



    }
}
