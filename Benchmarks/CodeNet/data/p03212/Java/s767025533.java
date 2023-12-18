import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        
        Queue<long[]> que = new ArrayDeque<long[]>();
        que.add(new long[]{3, 1, 0, 0});
        que.add(new long[]{5, 0, 1, 0});
        que.add(new long[]{7, 0, 0, 1});
        
        int count = 0;
        while (true) {
            long[] cur = que.poll();
            long tmp = cur[0];
            long x = cur[1];
            long y = cur[2];
            long z = cur[3];
            
            //if (tmp > 770000000) System.out.println(Arrays.toString(cur));
            
            if (x * y * z == 1) count++;
            
            if (tmp > num) break;
            
            que.add(new long[]{tmp * 10 + 3, x | 1, y, z});
            que.add(new long[]{tmp * 10 + 5, x, y | 1, z});
            que.add(new long[]{tmp * 10 + 7, x, y, z | 1});
        }
        
        System.out.println(count);
    }
}
