import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<Long, Integer> m = new HashMap<>();
        for(int i=0; i<n; i++) {
            long l = sc.nextLong();
            if(m.containsKey(l)) {
                m.put(l, m.get(l)+1);
            } else {
                m.put(l, 1);
            }
        }

        int cnt = 0;
        for(long i: m.keySet()) {
            if(m.get(i) == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
