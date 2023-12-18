import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Long> value = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < n; ++i) value.add(sc.nextLong());
        for(int i = 0; i < m; ++i) {
            long lo = value.poll();
            value.add(lo >> 1);
        }
        
        long ans = 0;
        for(long v : value) ans += v;
        System.out.println(ans);
    }
}
