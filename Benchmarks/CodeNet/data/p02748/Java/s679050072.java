import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for (int i=0;i<A;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<B;i++) {
            b[i] = sc.nextInt();
        }
        int ans = 300_000;
        for (int i=0;i<M;i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int c = sc.nextInt();
            ans = Math.min(ans, a[x]+b[y]-c);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        ans = Math.min(ans, a[0]+b[0]);
        System.out.println(ans);
    }
}