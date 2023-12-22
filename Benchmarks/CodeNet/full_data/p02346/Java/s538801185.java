import java.util.*;

public class Main {
    static long[] bit;
    static int n;

    static void add(int x, int y) {
        for (int i=x;i<=n;i+=i&(-i)) {
            bit[i]+=y;
        }
    }

    static long sum(int x) {
        long tmp = 0L;
        for (int i=x;i>0;i-=i&(-i)) {
            tmp+=bit[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int q = sc.nextInt();
        bit = new long[n+1];
        for (int i=0;i<q;i++) {
            int com = sc.nextInt();
            if (com==0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                add(x, y);
            } else { // com==1
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(sum(y)-sum(x-1));
            }
        }
    }
}
