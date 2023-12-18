import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0; i<n; i++) {
            q.add(sc.nextInt());
        }
        for(int i=0; i<m; i++) {
            int p = q.poll();
            q.add(p/2);
        }

        long res = 0;
        while(!q.isEmpty()) {
            res += q.poll();
        }

        System.out.println(res);
    }

}
