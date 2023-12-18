import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Queue<Integer> pq = new PriorityQueue<>();
        int sqr = (int) Math.ceil(Math.sqrt(m));
        int bound = Math.max(0, a.length - 1 - sqr);
        for (int i = a.length -1 ; i >= bound ; i--) {
          for (int j = a.length -1 ; j >= bound; j--) {
            pq.offer(a[i] + a[j]);
              if (pq.size() > m) {
                  pq.poll();
              }
        }  
        }
        int res = 0;
        while (!pq.isEmpty()) res+=pq.poll();
        
        // output
        System.out.println(res);
    }
}
