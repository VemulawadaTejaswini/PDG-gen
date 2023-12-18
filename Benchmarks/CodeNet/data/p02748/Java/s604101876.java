import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int amin = Integer.MAX_VALUE;
        int bmin = Integer.MAX_VALUE;
        int[] a = new int[A];
        int[] b = new int[B];
        int normalmin = 0;
        for(int i=0; i<A; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(amin > a[i]) amin = a[i];
        }
        for(int i=0; i<B; i++) {
            b[i] = Integer.parseInt(sc.next());
            if(bmin > b[i]) bmin = b[i];
        }
        normalmin = amin + bmin;
        int ans = normalmin;
        for(int i=0; i<M; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            if(a[x-1]+b[y-1]-c < ans) ans = a[x-1]+b[y-1]-c;
        }
        System.out.println(ans);
    }
}
