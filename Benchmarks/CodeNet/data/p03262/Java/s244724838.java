import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(X);
        for(int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }
        int minValue = 0;
        int prev = queue.poll();
        HashSet<Integer> set = new HashSet<>();
        int size = queue.size();
        for(int i = 0; i < size; i++) {
            int num = queue.poll();
            minValue = Math.min(minValue, num);
            set.add(num - prev);
            prev = num;
        }
        Integer[] sorted = new Integer[set.size()];
        set.toArray(sorted);
        Arrays.sort(sorted);
        int ans = sorted[0];
        for(int i = 1; i < sorted.length; i++) {
            if(sorted[i] % ans != 0){
                int num = sorted[i];
                while (true)
                {
                    int r = num % ans;
                    if(r == 0) break;
                    num = ans;
                    ans = r;
                }
            }
        }
        System.out.println(ans);
    }
}