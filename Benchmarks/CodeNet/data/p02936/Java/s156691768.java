import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        List[] list = new List[n];

        for(int i=0; i<n ;i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list[a].add(b);
            list[b].add(a);
        }

        long[] p = new long[n];
        for(int i=0; i<q; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            p[a] += b;
        }

        Queue<Integer> w = new LinkedList<>();
        w.add(0);
        boolean[] v = new boolean[n];
        v[0] = true;
        while(!w.isEmpty()) {
            int a = w.poll();
            for(Object o :list[a]) {
                int b = (Integer) o;
                if(v[b]) continue;
                v[b] = true;
                p[b] += p[a];
                w.offer(b);
            }
        }

        System.out.print(p[0]);
        for(int i=1; i<n ;i++) {
            System.out.print(' ');
            System.out.print(p[i]);
        }
        System.out.println();
    }

}
