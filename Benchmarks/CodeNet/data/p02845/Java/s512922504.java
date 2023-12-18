import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;

        long ans = 1L;
        long zero_cnt = 3;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            int A = Integer.parseInt(sc.next());
            if (A==0) {
                if (map.containsKey(A)) {
                    ans = ans*zero_cnt%mod;
                    zero_cnt--;
                    map.put(A, map.get(A)+1);
                } else {
                    ans = ans*zero_cnt%mod;
                    zero_cnt--;
                    map.put(A, 1);
                }
            } else {
                if (map.containsKey(A)) {
                    ans = ans*(map.get(A-1)-map.get(A))%mod;
                    map.put(A, map.get(A)+1);
                } else {
                    ans = ans*map.get(A-1)%mod;
                    map.put(A, 1);
                }
            }
        }
        System.out.println(ans);
    }
}