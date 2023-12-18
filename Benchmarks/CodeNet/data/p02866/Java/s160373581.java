import java.util.*;

class Main {
    public static void main(String[] args) {
        final int MOD = 998244353;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D[] = new int[N];
        for (int i=0; i<N; i++)
            D[i] = Integer.parseInt(sc.next());
        sc.close();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            if (map.containsKey(D[i])) {
                map.put(D[i], map.get(D[i])+1);
            } else {
                map.put(D[i], 1);
            } 
        }

        long cnt = 1;
        for (int i=0; i<map.size(); i++) {
            if (i>0) {
                if (!map.containsKey(i)) {
                    cnt = 0;
                } else {
                    cnt *= Math.pow(map.get(i-1) ,map.get(i)) % MOD;
                }
            } else if (!map.containsKey(0) || map.get(0)!=1) {
                cnt = 0;
                break;
            }
        }
        System.out.println(cnt);
    }
}