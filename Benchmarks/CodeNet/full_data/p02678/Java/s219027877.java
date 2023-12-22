import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        
        List<List<Integer>> to = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            to.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            to.get(A).add(B);
            to.get(B).add(A);
        }
        
        int[] dist = new int[N];
        int[] pre = new int[N];
        for(int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
            pre[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        dist[0] = 0;
        
        while(!queue.isEmpty()) {
            int q = queue.poll();
            for(int p : to.get(q)) {
                if(dist[p] != Integer.MAX_VALUE) continue;
                dist[p] = dist[q] + 1;
                pre[p] = q;
                queue.add(p);
            }
        }
        
        System.out.println("Yes");
        for(int i = 1; i < N; i++) {
            System.out.println(pre[i]+1);
        }
    }
}
