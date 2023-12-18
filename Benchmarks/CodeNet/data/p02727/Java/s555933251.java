import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int p[] = new int[A];
        int q[] = new int[B];
        int r[] = new int[C];
        for(int i=0; i<A; i++) {
            p[i] = sc.nextInt();
        }
        for(int i=0; i<B; i++) {
            q[i] = sc.nextInt();
        }
        for(int i=0; i<C; i++) {
            r[i] = sc.nextInt();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        int total[] = new int[2*(X+Y)];
        int cnt=0;
        for(int i=p.length-1; i>=p.length-X; i--) {
            total[cnt++] = p[i];
        }
        for(int i=q.length-1; i>=q.length-Y; i--) {
            total[cnt++] = q[i];
        }
        for(int i=r.length-1; i>=Math.max(0, r.length-(X+Y)); i--) {
            if(i>=r.length) continue;
            total[cnt++] = r[i];
        }
        Arrays.sort(total);

//        System.out.println(String.format("(X,Y,cnt)=(%d,%d,%d)", X, Y, cnt));
//        for(int i=0; i<total.length; i++) {
//            System.out.print(String.format("%d,", total[i]));
//        }
//        System.out.println();

        long result = 0L;
        cnt = total.length - 1;
        for(int i=0; i<X+Y; i++) {
            result+=total[cnt--];
        }
        System.out.println(result);
    }
}
